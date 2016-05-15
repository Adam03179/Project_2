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
     * Array contains all words from the book
     */
    private String[] allWordsFromBook;

    /**
     * Creates Word object, initializes the array
     */
    public Word(Book book) {

        String temp = book.getBook().replaceAll("[^\\w|\\s]|\\\\|_|\\||\\d", "");
        temp = temp.replaceAll("\\s+", " ");
        allWordsFromBook = temp.split(" ");
    }

    public String[] getAllWordsFromBook() {
        return allWordsFromBook;
    }

    public void setAllWordsFromBook(String[] allWordsFromBook) {
        this.allWordsFromBook = allWordsFromBook;
    }

    /**
     * Displays all words from the book to the screen, by alphabet
     */
    public void printWordsByAlphabet() {
        String[] temp = new String[allWordsFromBook.length];

        for (int i = 0; i < allWordsFromBook.length; i++) {
            temp[i] = allWordsFromBook[i].toLowerCase();
        }

        Arrays.sort(temp);

        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i].toCharArray()[0] == temp[i + 1].toCharArray()[0]) {
                System.out.print(temp[i] + " ");
            } else {
                System.out.println();
            }

        }

    }
}
