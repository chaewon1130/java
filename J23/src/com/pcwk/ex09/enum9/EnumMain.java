package com.pcwk.ex09.enum9;

public class EnumMain {

	public static void main(String[] args) {
		for(Direction d : Direction.values()) {
			System.out.println(d.name() + " : " + d.getValue() + ", " + d.getSymbol());
		}
		
		Direction d01 = Direction.EAST;
		System.out.println("d01 : " + d01.toString());
		
		Direction d02 = Direction.valueOf("EAST");
		System.out.println("d02 : " + d02);
	}
}
//EAST : 1, →
//SOUTH : 2, ↓
//WEST : 3, ←
//NORTH : 4, ↑
//d01 : EAST→
//d02 : EAST→