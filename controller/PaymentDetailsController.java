package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.PaymentDetails;
import com.velocity.service.PaymentDetailsService;

@RestController
public class PaymentDetailsController {


	@Autowired
	private PaymentDetailsService paymentDetailsService;

	

	@PostMapping("/savePaymentDetailsData")
	public ResponseEntity<PaymentDetails> savePaymentDetails (@RequestBody PaymentDetails paymentDetails ) {
		PaymentDetails pay = paymentDetailsService.savePaymentDetails (paymentDetails ); //calling the method
		return ResponseEntity.ok().body(pay);
	}
}
