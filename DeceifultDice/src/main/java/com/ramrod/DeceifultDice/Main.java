package com.ramrod.DeceifultDice;

import java.util.ArrayList;
import java.util.List;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameResultsService;

public class Main {
	
	
	
	public static void main(String[] args) {
		PlayerItems p1 = new PlayerItems(1, "human", new ArrayList<>());
		
		List<Integer> numOfPieces = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			int a = (int) (Math.random()*6+1);
			numOfPieces.add(a);
			System.out.println("a: " + a);		
		}
		System.out.println("num pieces: " + numOfPieces);
		p1.setNumOfPieces(numOfPieces);
		
		GameResultsService result = new GameResultsService();
		//System.out.println(result.calculateRatio(10, 20));
		
	}
	

}
