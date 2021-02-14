package com.ramrod.DeceifultDice.testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ramrod.DeceifultDice.models.Score;
import com.ramrod.DeceifultDice.service.GameResults;

public class TestScore {
	Score score = new Score();
	GameResults rs = new GameResults();
	
	@BeforeEach
	public void beforeTest() {
		score.setWins(10);
		score.setLosses(12);
		score.setRatio(.6);
		
	}
	
	@Test
	public void testScore() {
		int wins = score.getWins();
		int losses = score.getLosses();
		assertEquals(10, wins);
		assertEquals(12, losses);
		
	}
	
	@Test
	public void ratioTest() {
		double ratio = score.getRatio();
		assertEquals(.6, ratio);
	}
	
	@Test
	public void calculateRatioTest() {
		double newRatio = rs.calculateRatio(10,20);
		assertEquals(0.5,newRatio);
	}
}
