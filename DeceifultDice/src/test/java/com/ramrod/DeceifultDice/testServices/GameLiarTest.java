package com.ramrod.DeceifultDice.testServices;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ramrod.DeceifultDice.service.GameLiarService;

import static org.mockito.Mockito.*;

public class GameLiarTest {
	
	private static GameLiarService gls;
	private static int[] betArray = {2,4};

	@BeforeAll
	public static void init() {
		gls = new GameLiarService();

	}
	
	@Test
	//need Mockito: mock NewRoundController and create human and computer with values{2,4}
	public void isBetCorrectTest() {
		boolean b = gls.isBetCorrect(betArray);
		assertTrue(b);
	}
}
