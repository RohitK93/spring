package com.rk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.spring.bean.GameRunner;
import com.rk.spring.bean.MarioGame;
import com.rk.spring.bean.SuperContraGame;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		GameRunner game = context.getBean(GameRunner.class);
		game.run();
	}

}
