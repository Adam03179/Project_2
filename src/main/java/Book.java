package main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * This class contains a book
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Book {

    /**
     * Contains all text from book, as it was in original
     */
    private String book;

    /**
     * Contains all sentences from the book
     */
    private List<Sentence> sentences;

    /**
     * Contains all words from the book
     */
    private List<Word> words;

    /**
     * Creates Book-object, loading text with loadFromFile() help
     * initializes all private lists
     */
    public Book() {
        this.book = loadFromFile();

        String[] temp = getBook().split("(?<=([.?!]\\s))(?=[A-Z])");

        this.sentences = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            sentences.add(new Sentence(temp[i]));
        }

        String tempStr = getBook().replaceAll("[^\\w|\\s]|\\\\|_|\\||\\d", "");
        tempStr = tempStr.replaceAll("\\s+", " ");

        temp = tempStr.split(" ");
        this.words = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            words.add(new Word(temp[i]));
        }


    }

    /**
     * Gets the book without extra dots and whitespaces
     *
     * @return The book without extra dots and whitespaces
     */
    public String getBook() {
        book = book.replaceAll("[.]{4,}|\\s+", " ");
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }


    /**
     * Displays all sentences from the book to the screen, by length
     */
    public void printSentencesByInAscendingOrder() {
        Collections.sort(sentences);

        for (Sentence sentence : sentences) {
            System.out.println(sentence.getStrSent());
        }
    }

    /**
     * Displays all words from the book to the screen, by alphabet
     */
    public void printWordsByAlphabet() {
        String[] temp = new String[words.size()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = words.get(i).getStrWord().toLowerCase();
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


    /**
     * Method reads text from a file, and writes it in String
     *
     * @return text from the book
     */
    private String loadFromFile() {
        String book = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\ebook.txt"));

            while (reader.ready()) {
                book += reader.readLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with reader");
        }
        return book;
    }


}
