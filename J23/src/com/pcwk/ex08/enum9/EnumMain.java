package com.pcwk.ex08.enum9;

public class EnumMain {

	public static void main(String[] args) {
		Direction[] directionArray = Direction.values();
		for(Direction d : directionArray) {
			System.out.println(d.name() + ", " + d.getValue());
		}
	}
}
//EAST, 1
//SOUTH, 5
//WEST, -1
//NORTH, 10