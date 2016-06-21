package com.huong.models;

public class Map {
	private String[][] arrLocation = new String[4][4];

	public Map() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arrLocation[i][j] = "-";
			}
		}
	}

	public void display() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(arrLocation[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void update(Location playerLocation) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arrLocation[i][j].equals("P"))
					arrLocation[i][j] = "-";
			}
		}
		arrLocation[playerLocation.getRow()][playerLocation.getCol()] = "P";

	}

	public void update(Location playerLocation, Location boxLocation) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arrLocation[i][j].equals("P")
						|| arrLocation[i][j].equals("B"))
					arrLocation[i][j] = "-";
			}
		}
		arrLocation[playerLocation.getRow()][playerLocation.getCol()] = "P";
		arrLocation[boxLocation.getRow()][boxLocation.getCol()] = "B";
	}

}
