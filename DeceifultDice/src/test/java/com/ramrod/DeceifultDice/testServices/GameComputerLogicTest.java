package com.ramrod.DeceifultDice.testServices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ramrod.DeceifultDice.service.GameComputerLogicService;

public class GameComputerLogicTest {
	
	private static GameComputerLogicService gs;
	
	@BeforeAll
	public static void init() {
		gs = new GameComputerLogicService();
	}

	@Test
	//need mockito: threshold - difference > 2 = Liar
	public void decideIfLiarTest() {
		int[] betArray = {2,4};
		boolean b = gs.decideIfLiar(betArray);
		assertTrue(b);
	}
	
	@Test
	//need mockito: to make larger bet
	public void computerNewBetTest() {
		int[] betArray = {2,4};
		int[] newBet = {1, 5};
		int[] computerArray = gs.computerNewBet(betArray);
		assertEquals(newBet, betArray);
	}
}
