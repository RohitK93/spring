package com.rk.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	/**
	 * Field injection
	 */
	/*
	 * @Autowired private GamingConsole game;
	 */
	
	
	private GamingConsole game;
	
	/**
	 * Constructor injection
	 */
	/*
	 * @Autowired public GameRunner(GamingConsole game) { this.game = game; }
	 */
	
	/**
	 * setter injection
	 */
	@Autowired
	public void setGame(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
