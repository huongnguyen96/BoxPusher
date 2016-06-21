package com.huong.models;

public class Location {
	private int row;
	private int col;

	public Location(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public Location() {
		row = 0;
		col = 0;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
}
