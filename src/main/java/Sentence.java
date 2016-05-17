package main.java;

import java.lang.*;


/**
 * This class contains all sentences from the book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Sentence implements Comparable {

    /**
     * Array that consists from all words from sentence
     */
    private Word[] words;

    /**
     * Array that consists from all symbols from sentence
     */
    private Character[] symbols;


    /**
     * The sentence in String format
     */
    private String strSent;

    /**
     * Initializes all arrays, uses String from parameter
     *
     * @param strSent Sentence in String form
     */
    public Sentence(String strSent) {
        this.strSent = strSent;


        String exceptWords = this.strSent.replaceAll("[\\p{Alpha}\\s]", "");

        this.symbols = new Character[exceptWords.length()];

        for (int i = 0; i < this.symbols.length; i++) {
            symbols[i] = new Character(exceptWords.charAt(i));
        }


        String exceptSymbols = this.strSent.replaceAll("\\W"," ");
        exceptSymbols = exceptSymbols.replaceAll("\\d+", " ");
        exceptSymbols = exceptSymbols.replaceAll("\\s+", " ");

        String[] temp = exceptSymbols.split(" ");

        words = new Word[temp.length];

        for (int i = 0; i < temp.length; i++) {
            words[i] = new Word(temp[i]);
        }
    }

    /**
     * Displays all words from sentence
     */
    public void printWords() {

        for (Word word : words)
            System.out.println(word.getStrWord());

    }

    /**
     * Displays all symbols from sentence
     */
    public void printCharacters() {

        for (Character character : symbols)
            System.out.println(character.getCharacter());

    }


    public String getStrSent() {
        return strSent;
    }

    public void setStrSent(String strSent) {
        this.strSent = strSent;
    }

    /**
     * Compares Sentences by length
     * @param obj another Sentence
     * @return -1 if this Sentence shorter than another sentence,
     *          1 if this Sentence longer than another sentence,
     *          0 if this Sentence has the same length with another sentence.
     */
    @Override
    public int compareTo(Object obj) {
        Sentence tmp = (Sentence) obj;
        if (this.strSent.length() < tmp.strSent.length()) {
            return -1;
        } else if (this.strSent.length() > tmp.strSent.length()) {
            return 1;
        }
        return 0;
    }
}
