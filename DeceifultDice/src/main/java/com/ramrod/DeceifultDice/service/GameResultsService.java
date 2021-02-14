package com.ramrod.DeceifultDice.service;

import com.ramrod.DeceifultDice.models.Score;

public class GameResultsService {
	
	
	public void calculateRatio(Score score) {
		double newRatio = (double) score.getWins()/score.getLosses();
		score.setRatio(newRatio);
	}

}
