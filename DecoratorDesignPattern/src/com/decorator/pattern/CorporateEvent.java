package com.decorator.pattern;

import java.util.Date;

public class CorporateEvent implements Event{

	public CorporateEvent(VideoConferanceEvent videoConferanceEvent) {
		
	}

	@Override
	public void Organize(String place, Date eDate, int ParticPants) {
		System.out.println("CorporateEvent have"+"palce:"+place+"on Date:"+eDate+"no Ofparticpants:"+ParticPants);
		
	}

}
