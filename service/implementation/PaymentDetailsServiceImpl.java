package com.velocity.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.model.PaymentDetails;
import com.velocity.repository.PaymentDetailsRepository;
import com.velocity.service.PaymentDetailsService;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

	
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;
     @Override
	public PaymentDetails savePaymentDetails (PaymentDetails paymentDetails ) {
		PaymentDetails pay = paymentDetailsRepository.save(paymentDetails);
		return pay;
	}

}
