package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
//@Component
public class Piano implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("plink plink plink");
	}

	

}
