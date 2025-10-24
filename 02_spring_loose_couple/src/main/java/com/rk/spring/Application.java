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

//		Use same game runner class but still both game worked, This is loose coupled to single game
		
		MarioGame marioGame = new MarioGame();
		GameRunner marioGameRunner = new GameRunner(marioGame);
		marioGameRunner.run();
		
		
		SuperContraGame superContraGame = new SuperContraGame(); 
		GameRunner superContraGameRunner = new GameRunner(superContraGame);
		superContraGameRunner.run();
	}

}
