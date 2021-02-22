package com.ramrod.DeceifultDice.service;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.models.Score;

public class GameResultsService {
	
	
	public void calculateRatio(Score score) {
		double newRatio = (double) score.getWins()/score.getLosses();
		score.setRatio(newRatio);
	}
	
	//checks who is the winner and returns loser
	public PlayerItems isGameOver(PlayerItems pi, int newSize) {
		if(newSize == 0) {
			return pi; //returns the loser
		}
		return null; //game is not over
	}

}
