package com.spring.core;

public class Dance {
	public String Genere;
	
	public Dance() {
		
	}
	public Dance(String gen) {
		Genere=gen;
	}
	@Override
	public String toString() {
		return "Dance [Genere=" + Genere + "]";
	}

}
