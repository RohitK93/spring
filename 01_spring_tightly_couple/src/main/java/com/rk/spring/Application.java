package com.rk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rk.spring.bean.GameRunner;
import com.rk.spring.bean.MarioGame;
import com.rk.spring.bean.SuperContraGame;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		
		MarioGame game = new MarioGame();
		SuperContraGame superContraGame = new SuperContraGame(); 
		
//		GameRunner is tightly coupled to single game 
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = new GameRunner(superContraGame);
		runner.run();
		
		
	}

}
