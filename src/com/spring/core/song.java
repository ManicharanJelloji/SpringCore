package com.spring.core;

public class song implements performer{
	private int noSongs=2;
	private Dance dance;
	
	public song() {
		
	}
	public song(int songs,Dance dance) {
		noSongs=songs;
		this.dance=dance;
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("TU TU TU TU: "+noSongs + " "+dance);
	}

}
