package com.decorator.pattern;

import java.util.Date;

public class Test {
 private static AdvancedEvent advancedEvent;

public static void main(String[] args) {
	
	Event event= new TechnicalEvent(new LivePresentationEvent(advancedEvent));
	event.Organize("hitex",new Date(), 3000);
	Event event1=new CorporateEvent(new VideoConferanceEvent(advancedEvent));
	event1.Organize("Ameerpet",new Date(), 4000);
	
}
}
