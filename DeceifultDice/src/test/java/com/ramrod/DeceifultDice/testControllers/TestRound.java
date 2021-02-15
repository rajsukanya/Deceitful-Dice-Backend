package com.ramrod.DeceifultDice.testControllers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ramrod.DeceifultDice.Controller.NewRoundController;
import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameRollsService;

public class TestRound {
	
	private static GameRollsService gs;
	private static PlayerItems pi;
	private static NewRoundController nc;
	
	@BeforeAll
	public static void init() {
		gs = new GameRollsService();
		pi = new PlayerItems(1, "human", new ArrayList<>());
		nc = new NewRoundController();
	}
	
	@Test
	public void startNewRoundTest() {
		nc.newGame(pi);
		System.out.println("pieces: " + pi.getNumOfPieces());
		if(pi.getNumOfPieces().size() != 0) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
	
	@Test
	public void nextRoundTest() {
		
	}

}
