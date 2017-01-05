package com.training.singleton;

public class Singleton {

	private static Singleton instance = null;
	private static ScrabbleTiles scrabbleTiles = new ScrabbleTiles();

	public static void main(String... args) {
		System.out.println(scrabbleTiles.toString());
		System.out.println(scrabbleTiles.countOfTiles());
	}
}
