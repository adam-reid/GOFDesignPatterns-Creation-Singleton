package com.training.singleton;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Collection of Tiles - assigns values and specific tiles.
 * <p>
 *     This is currently arranged using the English version as provided
 *     at WikiPedia.
 *
 * @see <a href=https://en.wikipedia.org/wiki/Scrabble_letter_distributions#English>
 *     https://en.wikipedia.org/wiki/Scrabble_letter_distributions#English</a>
 */
public class ScrabbleTiles {
    private LinkedList<Tile> tiles = new LinkedList<>();

    /**
     * Configures an English version of scrabble.
     */
    public ScrabbleTiles() {
        //TODO load from XML; configure enumeration; allow multiple types of scrabble tiles.
        addLetter("A",1, 9);
        addLetter("B",3, 2);
        addLetter("C",3, 2);
        addLetter("D",2, 4);
        addLetter("E",1, 12);
        addLetter("F",4, 2);
        addLetter("G",2, 3);
        addLetter("H",4, 2);
        addLetter("I",1, 9);
        addLetter("J",8, 1);
        addLetter("K",5, 1);
        addLetter("L",1, 4);
        addLetter("M",3, 2);
        addLetter("N",1, 6);
        addLetter("O",1, 8);
        addLetter("P",3, 2);
        addLetter("Q",10, 1);
        addLetter("R",1, 6);
        addLetter("S",1, 4);
        addLetter("T",1, 6);
        addLetter("U",1, 4);
        addLetter("V",4, 2);
        addLetter("W",4, 2);
        addLetter("X",8, 1);
        addLetter("Y",4, 2);
        addLetter("Z",10, 1);
        addLetter(" ",0, 2);
    }

    /**
     * Configures the scrabble tiles with a provided collection.
     *
     * @param tiles  a list of the tiles to use with scrabble.
     */
    public ScrabbleTiles(LinkedList<Tile> tiles) {
        this.tiles = tiles;
    }

    /**
     * Gets the complete set of tiles.
     *
     * @return  the list of tiles to use for scrabble
     */
    public LinkedList<Tile> getTiles() {
        return tiles;
    }

    /**
     * Adds a specific letter to the scrabble collection.
     *
     * <p>This makes a {@link Tile} with the respective value and letter and
     * adds it to the collection. Users will not be allowed to add tiles once
     * the game has begun, so this is private.
     *
     * @param letter  the letter to add
     * @param value  the value of the letter to add
     * @param count  the number of times to add the tile
     */
    private void addLetter(String letter, Integer value, Integer count) {
        while(count > 0) {
            tiles.add(new Tile(letter, value));
            count--;
        }
    }

    /**
     * Sometimes you just need to know how many tiles exist.
     *
     * @return  the number of tiles in the collection
     */
    public Integer countOfTiles() {
        return tiles.size();
    }

    public void shuffle() {
        Collections.shuffle(tiles);
    }

    @Override
    public String toString() {
        return "ScrabbleTiles{" +
                "tiles=" + tiles +
                '}';
    }
}
