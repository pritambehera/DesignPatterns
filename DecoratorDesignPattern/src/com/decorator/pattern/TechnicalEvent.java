package com.decorator.pattern;

import java.util.Date;

public class TechnicalEvent implements Event{



	public TechnicalEvent(LivePresentationEvent livePresentationEvent) {
		
	}

	@Override
	public void Organize(String place, Date eDate, int ParticPants) {
		System.out.println("TechnicalEvent have "+"palce:"  +place+  "on Date:"  +eDate+ "no Ofparticpants:"  +ParticPants);
		
	}



}
