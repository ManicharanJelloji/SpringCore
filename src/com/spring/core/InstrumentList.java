package com.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InstrumentList implements performer {
	private String song;
	private Map<String,String> instrument;
	
	public InstrumentList() {
		
	}
	public void setSong(String song) {
		this.song=song;
	}
	public void setInstrument(Map<String,String>  instrument) {
		this.instrument=instrument;
	}
	//Setter DI
	
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing....."+ song+" :");
		instrument.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
//			System.out.println(key);
//			System.out.println(value);
	}

}
