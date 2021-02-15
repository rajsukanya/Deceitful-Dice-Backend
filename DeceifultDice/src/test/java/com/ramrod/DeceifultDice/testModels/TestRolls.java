package com.ramrod.DeceifultDice.testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameRollsService;

public class TestRolls {
	private static GameRollsService gs;
	private static PlayerItems pi;
	
	@BeforeAll
	public static void init() {
		gs = new GameRollsService();
		
	}
	
	@BeforeEach
	public void beforeTest() {
		pi = new PlayerItems(1, "human", new ArrayList<>());
	}
	
	//checks the playerNewRolls method arrayList for how many pieces a player has
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	public void playerNewRollsTest(int pieces) {
		gs.playerNewRoll(pi, pieces);
		System.out.println("num: " + pi.getNumOfPieces().size());
		assertEquals(pieces, pi.getNumOfPieces().size());
	}
	
	//checks the value of pieces in the arrayList in between 1 and 6
	@Test
	public void validPiecesTest() {
		gs.playerNewRoll(pi,5);
		if(pi.getNumOfPieces().size() != 0) {
			for(int i = 0; i < 5; i++) {
				if(pi.getNumOfPieces().get(i) > 0 && pi.getNumOfPieces().get(i) < 7) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
		} else {
			assertTrue(false);
		}
	}
	
}
