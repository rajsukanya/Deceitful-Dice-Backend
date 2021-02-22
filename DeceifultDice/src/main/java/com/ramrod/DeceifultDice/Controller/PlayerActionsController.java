package com.ramrod.DeceifultDice.Controller;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramrod.DeceifultDice.service.GameLiarService;

@Controller
@CrossOrigin("http://localhost/4200")
@RequestMapping("/playerActions")
public class PlayerActionsController {
	
	public static int[] humansBetArray;
	GameLiarService gls = new GameLiarService();
	NewRoundController nrc = new NewRoundController();
	
	@PostMapping("/playerBet")
	//player's guess
	public int[] playersBet(@RequestBody int pieces, @RequestBody int dice) {
		int[] betArray = {pieces, dice};
		humansBetArray = betArray;
		return betArray;
	}
	
	@PostMapping("/playerAccuse")
	//call liar, need Computer's betArray
	public boolean callComputerLiar(@RequestBody int pieces, @RequestBody int dice) {
		int[] betArray = {pieces, dice};
		boolean isLiar =  gls.lyingComputer(betArray);
		if(isLiar) {
			nrc.winner = nrc.human;
		} else {
			nrc.winner = nrc.computer;
		}
		return isLiar;
	}

}
