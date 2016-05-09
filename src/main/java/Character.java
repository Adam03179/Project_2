package main.java;

/**
 * This class contains all characters from the book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Character extends Book {

    /**
     * Array contains all characters from the book
     */
    private char[] allCharactersFromText;

    /**
     * Creates Character object, initializes the array
     */
    public Character() {
        allCharactersFromText = getBook().toCharArray();
    }

    public char[] getAllCharactersFromText() {
        return allCharactersFromText;
    }

    public void setAllCharactersFromText(char[] allCharactersFromText) {
        this.allCharactersFromText = allCharactersFromText;
    }
}
