package com.huong.controllers;

import com.huong.models.MoveableGameObject;

public class MoveableGameObjectController {
	public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;
	public static final int UP = 4;
	private MoveableGameObject moveableGameObject;

	public MoveableGameObjectController(MoveableGameObject moveableGameObject) {
		this.moveableGameObject = moveableGameObject;
	}

	public MoveableGameObject getMoveableGameObject() {
		return moveableGameObject;
	}

	public void setMoveableGameObject(MoveableGameObject moveableGameObject) {
		this.moveableGameObject = moveableGameObject;
	}

	public void move(int orientation) {
		switch (orientation) {
		case LEFT:
			moveableGameObject.moveLeft();
			break;
		case RIGHT:
			moveableGameObject.moveRight();
			break;
		case DOWN:
			moveableGameObject.moveDown();
			break;
		case UP:
			moveableGameObject.moveUp();
			break;
		default:
			System.out.println("cannot detect orientation");
			break;
		}
	}

}
