package com.huong.controllers;

import com.huong.models.GameObject;
import com.huong.models.Location;
import com.huong.models.Map;
import com.huong.models.MoveableGameObject;

public class GameController {
	private Map map;
	private MoveableGameObject player;
	private MoveableGameObjectController playerController;
	private MoveableGameObject box;
	private MoveableGameObjectController boxController;
	private GameObject storage;
	public void play(){
		initGame();
	}
	
	private void initGame(){
		initGameObject();
		map = new Map();
		map.initScene(player.getLocation(), box.getLocation(), storage.getLocation());
	}
	
	private void initGameObject(){
		player = new MoveableGameObject();
		player.setLocation(new Location(1,1));
		playerController = new MoveableGameObjectController(player);
		box = new MoveableGameObject();
		box.setLocation(new Location(2,2));
		boxController = new MoveableGameObjectController(box);
		storage = new MoveableGameObject();
		storage.setLocation(new Location(3,2));
	}

}
