package com.my.gw_boot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("scheduledTasks")
public class ScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(initialDelay=1000, fixedRate=5000)
	public void reportCurrentTime0() {
		System.out.println("[000]The time is now " + dateFormat.format(new Date()));
	}
	
	public void reportCurrentTime1(){
		System.out.println("[111]The time is now " + dateFormat.format(new Date()));
	}

	public void reportCurrentTime2(){
		System.out.println("[222]The time is now " + dateFormat.format(new Date()));
	}


}
