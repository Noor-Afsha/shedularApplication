package com.Wecoodee.CustomerAppliaction.service;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class Test {

//	@Scheduled(fixedRate = 2000)
//	public void getSchedule() {
//		//print the every 2 seconds with date
//		System.out.println("hiiii " + new Date());
//	}

	
	//print the statement within 1min, per statement should print after 2 sec
	@Scheduled(cron =  "01/2 27 17 * * *")
	
	public void scheduleFixedRateWithInitialDelayTask() {

	     System.out.println("job schedular is working"+new Date().toString());
	}
}
