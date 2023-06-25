package com.pravalika.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		//gives system date and time
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if(hour<12)
			return "GOOD MORNING:";
		else if(hour<16)
			return "GOOD AFTERNOON:";
		else if(hour<18)
			return "GOOD EVENING:";
		else
			return "GOOD NIGHT:";
	}

}
