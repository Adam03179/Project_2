package main.java;

/**
 * This class contains all characters from the book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Character {

    private char character;

    /**
     * Creates Character object
     */
    public Character(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}
