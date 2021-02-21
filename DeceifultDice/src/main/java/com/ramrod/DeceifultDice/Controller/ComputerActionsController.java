package com.ramrod.DeceifultDice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramrod.DeceifultDice.service.GameLiarService;

@Controller
@CrossOrigin("http://localhost/4200")
@RequestMapping("/computerActions")
public class ComputerActionsController {
	
	GameLiarService gls = new GameLiarService();
	NewRoundController nrc = new NewRoundController();
	
	@PostMapping("/computerBet")
	//computer's guess
	public int[] computersBet() {
		return null;
	}
	
	@PostMapping("/computerAccuse")
	//call liar, need Computer's betArray
	public boolean callHumanLiar(@RequestBody int pieces, @RequestBody int dice) {
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
