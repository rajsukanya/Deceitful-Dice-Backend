package com.ramrod.DeceifultDice.service;

import java.util.List;

import com.ramrod.DeceifultDice.Controller.NewRoundController;

public class GameLiarService {
	
	static NewRoundController nrc = new NewRoundController();
	
	//human calling computer a liar
	public boolean lyingComputer(int[] betArray) {
		return isBetCorrect(betArray);
	}
	
	public boolean isBetCorrect(int[] betArray) {
		List<Integer> playerArray = nrc.human.getNumOfPieces();
		List<Integer> computerArray = nrc.computer.getNumOfPieces();
		int counter = 0;
		
		for(Integer i: playerArray) {
			if(i == betArray[1]) {
				counter++;
			}
		}
		for(Integer i: computerArray) {
			if(i == betArray[1]) {
				counter++;
			}
		}
		
		if(counter >= betArray[0])
			return true;
		else
			return false;
	}
	
	public boolean lyingPlayer(int[] betArray) {
		return isBetCorrect(betArray);
	}

}
