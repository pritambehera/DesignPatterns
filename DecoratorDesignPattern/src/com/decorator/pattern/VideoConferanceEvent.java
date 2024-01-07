package com.decorator.pattern;

import java.util.Date;

public class VideoConferanceEvent extends AdvancedEvent{

	
	public VideoConferanceEvent(AdvancedEvent advancedEven) {
		super();
	
	}

	@Override
	public void Organize(String place, Date eDate, int ParticPants) {
		System.out.println("VideoConferenceEvent have"+"palce:"+place+"on Date:"+eDate+"no Ofparticpants:"+ParticPants);
		super.Organize(place, eDate, ParticPants);
	}

}
