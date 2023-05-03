package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member implements performer {
	@Value("STUCK STUCK STUCK")
	private String song;
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	

//	public void setSong(String song) {
//		this.song = song;
//	}
//	
//	public void setInstrument(Instrument instrument) {
//		this.instrument = instrument;
//	}


	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println(song);
		instrument.play();
		
	}

}
