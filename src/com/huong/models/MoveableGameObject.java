package com.huong.models;

public class MoveableGameObject extends GameObject implements Moveable {

	@Override
	public void moveLeft() {
		location.setRow(location.getRow() - 1);

	}

	@Override
	public void moveRight() {
		location.setRow(location.getRow() + 1);

	}

	@Override
	public void moveDow() {
		location.setCol(location.getCol() + 1);

	}

	@Override
	public void moveUp() {
		location.setCol(location.getCol() - 1);

	}

}
