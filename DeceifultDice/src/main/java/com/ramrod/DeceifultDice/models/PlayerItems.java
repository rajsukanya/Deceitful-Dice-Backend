package com.ramrod.DeceifultDice.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlayerItems {
	
	@Id
	@GeneratedValue
	private int playerId;
	
	private String player; //human or computer
	
	List<Integer> numOfPieces; //max number of pieces is 5
	
	public PlayerItems() {}
	
	public PlayerItems(int playerId, String player, List<Integer> numOfPieces) {
		super();
		this.playerId = playerId;
		this.player = player;
		this.numOfPieces = numOfPieces;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public List<Integer> getNumOfPieces() {
		return numOfPieces;
	}

	public void setNumOfPieces(List<Integer> numOfPieces) {
		this.numOfPieces = numOfPieces;
	}

	@Override
	public String toString() {
		return "Pieces [playerId=" + playerId + ", player=" + player + ", numOfPieces=" + numOfPieces + "]";
	}

}
