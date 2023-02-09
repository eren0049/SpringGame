package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		var game = new PackmanGame();
		// var game = new MarioGame(); 
		//var game = new SuperContraGame();
		var gameRunner= new GameRunner(game);
		gameRunner.run();
		
		
		
	}

}
