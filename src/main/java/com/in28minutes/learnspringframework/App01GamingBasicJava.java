package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object
		var game = new PackmanGame();
		// var game = new MarioGame(); 
		//var game = new SuperContraGame();
		
		// Object & Wiring of dependencies
		var gameRunner= new GameRunner(game); // can be called injection as well
		gameRunner.run();
		
		
		
	}

}
