package com.luv2code.springdemo;

public class LifeCoach implements Coach {

	private FortuneService fortuneService;

	public LifeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "You can do it!";
	}

	@Override
	public String getDailyFortune() {
		return "You don't need luck, you got this";
	}
}
