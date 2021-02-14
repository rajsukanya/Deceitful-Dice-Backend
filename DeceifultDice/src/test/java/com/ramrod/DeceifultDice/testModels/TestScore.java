package com.ramrod.DeceifultDice.testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ramrod.DeceifultDice.models.Score;
import com.ramrod.DeceifultDice.service.GameResultsService;

public class TestScore {
	private static GameResultsService rs;
	
	@BeforeAll
	public static void init() {
		rs = new GameResultsService();
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {45, 3, 5, 100})
	public void calculateRatioTest(int wins) {
		int loss = 20;
		Score score = new Score(1, wins, loss, 0);
		rs.calculateRatio(score);
		
		System.out.println("Ratio: " + score.getRatio());
		System.out.println((double)wins/loss);
		assertEquals(score.getRatio(),(double)wins/loss);
	}
}
