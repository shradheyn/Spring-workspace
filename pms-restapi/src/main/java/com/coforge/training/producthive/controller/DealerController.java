package com.coforge.training.producthive.controller;

import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.producthive.exception.ResourceNotFoundException;
import com.coforge.training.producthive.model.Address;
import com.coforge.training.producthive.model.Dealer;
import com.coforge.training.producthive.model.DealerAndAddressProjection;
import com.coforge.training.producthive.service.DealerService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;


/**
* Author   : Shradhey.Naudiyal
* Date     : Oct 3, 2025
* Time     : 3:24:18 PM
* Project  : pms-restapi
*/
@RestController
@RequestMapping(value="/api")
public class DealerController {
	
	private final DealerService dservice;

	//DI using constructors	
	public DealerController(DealerService dservice) {
		super();
		this.dservice = dservice;
	}
	//Open PostMan, make a POST Request - http://localhost:8088/product-hive/api/register
		//Select body -> raw -> JSON 
		//Insert JSON Dealer object.
		@PostMapping("/register")
		public ResponseEntity<String> createDealer(@Validated @RequestBody Dealer dealer){
			try {
				Address address=dealer.getAddress(); //get data from secondary Table

				//Establish bi-directional Mapping
				address.setDealer(dealer);
				dealer.setAddress(address);

				Dealer registeredDealer=dservice.registerDealer(dealer); //save dealer details
				if(registeredDealer !=null) {
					return ResponseEntity.ok("Registration Successfull");
				}else {
					return ResponseEntity.badRequest().body("Registration Failed");
				}
			}catch(Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
						body("An Error Occurred :"+e.getMessage());
			}
		}

		    //Open PostMan, make a POST Request - http://localhost:8088/product-hive/api/login
			//Select body -> raw -> JSON 
			//Insert JSON Dealer object with email & password.
		@PostMapping("/login")
		public ResponseEntity<Boolean> loginDealer(@Validated @RequestBody Dealer dealer) 
				throws ResourceNotFoundException
		{
			Boolean isLogin=false;
			
			String email = dealer.getEmail();
			String password =  dealer.getPassword();
			
			Dealer d= dservice.loginDealer(email).orElseThrow(() -> //Invokes loginDealer() method with email parameter
			new ResourceNotFoundException("Dealer doen't Exists :: " +email));
			
			if(email.equals(d.getEmail()) && password.equals(d.getPassword())) {
				isLogin=true;
			}
			return ResponseEntity.ok(isLogin);
		}
		
		// client --> Controller --> Service -- > repo --> JPA repo --> DB
		
		 //Open PostMan, make a GET Request - http://localhost:8088/product-hive/api/dealers
		
		//Logger logger=LoggerFactory.getLogger(DealerController.class);
		
		@GetMapping("/dealers")
		public ResponseEntity<List<DealerAndAddressProjection>> getDealerInfo(){
			try {
				List<DealerAndAddressProjection> selectedFields=dservice.getDealerInfo();
				//logger.info("Dealer Information fetched Successfully");
				return ResponseEntity.ok(selectedFields);
			}catch(Exception e) {
				e.printStackTrace();
				//logger.error("Dealer Information fetched UnSuccessfully");
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			}
		}
}
