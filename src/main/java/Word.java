package main.java;

import java.util.Arrays;

/**
 * This class contains all words from the book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Word {

    /**
     * Array consist from all characters in this word
     */
    private Character[] characters;

    /**
     * This word in String format
     */
    private String strWord;

    /**
     * Creates Word object, initializes the array
     */
    public Word(String str) {

        this.strWord = str;

        this.characters = new Character[strWord.length()];

        for(int i = 0; i < characters.length; i++){

            characters[i] = new Character(strWord.charAt(i));
        }

    }

    public String getStrWord() {
        return strWord;
    }

    public void setStrWord(String strWord) {
        this.strWord = strWord;
    }


}
