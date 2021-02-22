package com.ramrod.DeceifultDice.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Score {
	@OneToOne
	@JoinColumn(name = "playerId")
	private int playerId;
	private int wins;
	private int losses;
	private double ratio;
	
	public Score() {}

	public Score(int playerId, int wins, int losses, double ratio) {
		super();
		this.playerId = playerId;
		this.wins = wins;
		this.losses = losses;
		this.ratio = ratio;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	@Override
	public String toString() {
		return "Score [playerId=" + playerId + ", wins=" + wins + ", losses=" + losses + ", ratio=" + ratio + "]";
	}
	
	

}
