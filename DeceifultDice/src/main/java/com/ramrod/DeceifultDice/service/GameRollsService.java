package com.ramrod.DeceifultDice.service;

import com.ramrod.DeceifultDice.models.PlayerItems;

public class GameRollsService {
	
	//this will assign a value of 1-6 for each on the pieces in the array list
	public void playerNewRoll(PlayerItems pi, int pieces) {
		for(int i = 0; i < pieces; i++) {
			int a = (int) (Math.random()*6+1);
			pi.getNumOfPieces().add(a);
			System.out.println("a: " + a);		
		}
		
	}

}
