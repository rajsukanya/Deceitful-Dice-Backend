package com.ramrod.DeceifultDice.testControllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ramrod.DeceifultDice.Controller.PlayerActionsController;
import com.ramrod.DeceifultDice.service.GameLiarService;

public class PlayerActionsTest {
	private static PlayerActionsController pc;
	private static GameLiarService gls;
	
	@BeforeAll
	public static void init() {
		pc = new PlayerActionsController();
		gls = new GameLiarService();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	public void playersBetTest(int pieces) {
		int dice = 2;
		int[] expectedArray = {pieces, dice};
		int[] betArray = pc.playersBet(pieces, dice);
		assertEquals(expectedArray[0], betArray[0]);
		assertEquals(expectedArray[1], betArray[1]);
	}
	
	
}
