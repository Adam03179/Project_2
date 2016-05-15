package main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
    private Sentence sentences;

    /**
     * Contains all words from the book
     */
    private Word words;

    /**
     * Creates Book-object, loading text with loadFromFile() help
     */
    public Book() {
        this.book = loadFromFile();
        this.sentences = new Sentence(this);
        this.words = new Word(this);

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

    public Sentence getSentences() {
        return sentences;
    }

    public void setSentences(Sentence sentences) {
        this.sentences = sentences;
    }

    public Word getWords() {
        return words;
    }

    public void setWords(Word words) {
        this.words = words;
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
