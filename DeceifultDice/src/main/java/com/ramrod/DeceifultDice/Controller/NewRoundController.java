package com.ramrod.DeceifultDice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramrod.DeceifultDice.models.PlayerItems;
import com.ramrod.DeceifultDice.service.GameRollsService;

@Controller
@CrossOrigin("http://localhost:4200")
@RequestMapping("/newRound")
public class NewRoundController {
	
	@PostMapping("/new")
	public PlayerItems newGame(@RequestBody PlayerItems pi) {
		GameRollsService gs = new GameRollsService();
		gs.playerNewRoll(pi, 5);
		return pi;
	}
	
	@PutMapping("/next")
	public PlayerItems nextRound(@RequestBody PlayerItems pi) {
		return null;
	}
	
	@GetMapping("/winner/{id}")
	public int roundWinner(@PathVariable(value = "id") int id) {
		return 0;
	}

}
