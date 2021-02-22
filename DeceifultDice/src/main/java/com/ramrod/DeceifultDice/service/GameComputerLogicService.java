package com.ramrod.DeceifultDice.service;

import java.util.List;

import com.ramrod.DeceifultDice.Controller.NewRoundController;
import com.ramrod.DeceifultDice.Controller.PlayerActionsController;

public class GameComputerLogicService {
	
	PlayerActionsController pac = new PlayerActionsController();
	NewRoundController nrc = new NewRoundController();
	
	//knows human's num of pieces and human's bet
	//true - liar; false -bet
	public boolean decideIfLiar(int[] betArray) {
		List<Integer> computerArray = nrc.computer.getNumOfPieces();
		int counter = countPieces(betArray);
		
		if(betArray[0] - counter > 2) {
			return true;
		} 
		return false;
	}
	
	public int countPieces(int[] betArray) {
		int counter = 0; 
		
		for(Integer i: betArray) {
			if(betArray[1] == i) {
				counter++;
			}
		}
		return counter;
	}
	
	public int[] computerNewBet(int[] betArray) {
		int[] newBet = new int[2];
		List<Integer> computerArray = nrc.computer.getNumOfPieces();
		int counter = countPieces(betArray);
		int currentDice = betArray[1];
		
		while(counter == 0) {
			currentDice++;
			counter = countPieces(betArray);
			if(counter > 1) {
				newBet[0] = 2;
				newBet[1] = currentDice;
				return newBet;
			} else if(counter == 1) {
				newBet[0] = 1;
				newBet[1] = currentDice;
				return newBet;
			} 
		}
		
		newBet[0] = 1;
		newBet[1] = betArray[1]+1;
		return newBet;
		
	}
	
	
	
}
