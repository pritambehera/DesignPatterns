package com.decorator.pattern;

import java.util.Date;

public class LivePresentationEvent extends AdvancedEvent {
      
	
	
	public LivePresentationEvent(AdvancedEvent advancedEvent) {
		super();
	
	}

	@Override
	public void Organize(String place, Date eDate, int ParticPants) {
		System.out.println("LivePresantationEvent have"+"palce:"+place+"on Date:"+eDate+"no Ofparticpants:"+ParticPants);
		super.Organize(place, eDate, ParticPants);
	}

}
