package com.pcwk.ex09.enum9;

public enum Direction {
	EAST(1,"→"), SOUTH(2, "↓"), WEST(3, "←"), NORTH(4, "↑");
	private final int value;
	private final String symbol; 
	Direction(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return name() + getSymbol();
	}
}
