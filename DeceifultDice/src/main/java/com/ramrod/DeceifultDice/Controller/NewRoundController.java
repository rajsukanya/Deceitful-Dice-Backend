package com.ramrod.DeceifultDice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameResultsService;
import com.ramrod.DeceifultDice.service.GameRollsService;

@Controller
@CrossOrigin("http://localhost:4200")
@RequestMapping("/newRound")
public class NewRoundController {
	
	public static PlayerItems human;
	public static PlayerItems computer;
	public static PlayerItems winner;
	
	GameResultsService grs = new GameResultsService();
	
	@PostMapping("/new")
	public PlayerItems newGame(@RequestBody PlayerItems pi) {
		GameRollsService gs = new GameRollsService();
		gs.playerNewRoll(pi, 5);
		if(pi.getPlayer().equals("human")) {
			human = pi;
		} else {
			computer = pi;
		}
		return pi;
	}
	
	@PutMapping("/next")
	public PlayerItems nextRound(@RequestBody PlayerItems pi) {
		GameRollsService gs = new GameRollsService();
		
		if(winner.getPlayerId() == pi.getPlayerId()) {
			int size = pi.getNumOfPieces().size();
			pi.getNumOfPieces().clear();
			gs.playerNewRoll(pi,size);
		} else {
			int newSize = pi.getNumOfPieces().size()-1;
			if(grs.isGameOver(pi, newSize) != null) {
				pi.getNumOfPieces().clear();
				return null;
			}
			
			pi.getNumOfPieces().clear();
			gs.playerNewRoll(pi, newSize);
		}
		
		if(pi.getPlayer().equals("human")) {
			human = pi;
		} else {
			computer = pi;
		}
		
		return pi;
	}
	
	@GetMapping("/finalWinner")
	public PlayerItems checkGameOver() {
		return null;
	}
	
	
	


}
