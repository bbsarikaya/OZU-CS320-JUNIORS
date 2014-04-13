package controller;

import util.LevelFactory;
import entity.Level;
import graphic.view.GameView;

public class GameController {
	
	private GameView view;
	private Level level;
	
	

	public void run() {
		//TODO : implement
//		while(true) {
			view.repaint();
//		}
		
	}
	
	public GameView getView() {
		return view;
	}

	public void setView(GameView view) {
		this.view = view;
	}

	public Level getLevel() {
		return level;
	}

	public void initilizeLevel(int levelNumber) {
		level = LevelFactory.createLevel(levelNumber);
	}

}

