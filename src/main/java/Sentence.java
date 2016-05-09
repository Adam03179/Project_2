package main.java;

import java.util.*;

/**
 * This class contains all sentences from the book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Sentence extends Book {
    /**
     * Array contains all sentences from the book
     */
    private String[] allSentenceInBook;

    /**
     * Creates Sentence object, initializes the array
     */
    public Sentence() {
        this.allSentenceInBook = getBook().split("(?<=([.?!]\\s))(?=[A-Z])");
    }

    public String[] getAllSentenceInBook() {
        return allSentenceInBook;
    }

    public void setAllSentenceInBook(String[] allSentenceInBook) {
        this.allSentenceInBook = allSentenceInBook;
    }

    /**
     * Displays all sentences from the book to the screen, by length
     */
    public void printSentencesByInAscendingOrder() {

        Arrays.sort(allSentenceInBook, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else return 0;
            }
        });

        for (String sentence : allSentenceInBook) {
            System.out.println(sentence);
        }
    }
}
