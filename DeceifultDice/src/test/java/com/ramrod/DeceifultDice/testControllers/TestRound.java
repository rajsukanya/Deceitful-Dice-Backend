package com.ramrod.DeceifultDice.testControllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ramrod.DeceifultDice.Controller.NewRoundController;
import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameRollsService;

public class TestRound {
	
	private static GameRollsService gs;
	private static PlayerItems pi;
	private static PlayerItems winner;
	private static NewRoundController nc;
	
	@BeforeAll
	public static void init() {
		gs = new GameRollsService();
		pi = new PlayerItems(1, "human", new ArrayList<>());
		nc = new NewRoundController();
		winner = new PlayerItems(2, "computer", new ArrayList<>());
		
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
	//Checks to see if a person won the last round
	public void nextRoundTest() {
		int idWinner = 1; 
		nc.nextRound(pi);
		assertEquals(idWinner,pi.getPlayerId());
		
	}
	
	@Test
	//needs mockito to call nextRound
	public void checkGameOverTest() {
		PlayerItems newWinner = new PlayerItems(2, "computer", new ArrayList<>());
		winner = nc.checkGameOver();
		assertEquals(winner, newWinner);
	}

}
