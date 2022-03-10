package com.pcwk.ex07.enum9;

public class DirectionMain {

	public static void main(String[] args) {
		Direction d01 = Direction.EAST;
		Direction d02 = Direction.valueOf("WEST");
		System.out.println("d01 : " + d01);
		System.out.println("d02 : " + d02);
		
		Direction[] directionArray = Direction.values();
		for(Direction d : directionArray) {
			System.out.println(d.name() + " = " + d.ordinal());
		}
	}
}
//d01 : EAST
//d02 : WEST
//EAST = 0
//SOUTH = 1
//WEST = 2
//NORTH = 3