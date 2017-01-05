package com.training.singleton;

/**
 * Tile object containing attributes of a Scrabble Tile
 */
public class Tile {
    private String letter;
    private Integer value;

    /**
     * Creates a tile with a given letter and value
     *
     * @param letter  the letter associated with the tile
     * @param value  the value associated with the letter
     */
    public Tile(String letter, Integer value) {
        this.value = value;
        this.letter = letter;
    }

    /**
     * Gets the value of the tile
     *
     * @return  the integer value of the tile
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Gets the letter of the tile.
     *
     * @return  the letter of the tile.
     */
    public String getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter='" + letter + '\'' +
                ", value=" + value +
                '}';
    }
}
