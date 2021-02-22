package com.ramrod.DeceifultDice.testServices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.models.Score;
import com.ramrod.DeceifultDice.service.GameResultsService;

public class GameResultsTest {
	
	private static Score score;
	private static GameResultsService grs;
	private static PlayerItems pi;
	
	@BeforeAll
	public static void init() {
		grs = new GameResultsService();
		score = new Score(1, 2, 4, 0);
		List<Integer> emptyList = new ArrayList<>();
		pi = new PlayerItems(1, "human", emptyList);
	}
	
	@Test
	public void calculateRatioTest() {
		double ratio = 0.5;
		grs.calculateRatio(score);
		assertEquals(ratio, score.getRatio());
	}

	@Test
	public void isGameOverTest() {
		PlayerItems loser = grs.isGameOver(pi, 0);
		assertEquals(pi, loser);
	}
}
