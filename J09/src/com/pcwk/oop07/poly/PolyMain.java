package com.pcwk.oop07.poly;

public class PolyMain {

	public static void main(String[] args) {
		Lion lion = new Lion();
		ZooKeeper zooK = new ZooKeeper();
		zooK.feed(lion);
		
		zooK.feed(new Rabbit());
		zooK.feed(new Monkey());
	}
}