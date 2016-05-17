package main.java;

import java.lang.*;

/**
 * This class realizes main-method
 *
 * @author Igor Gerasymenko
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {


        Book book = new Book();

        Sentence sentence = new Sentence(book.getBook());
        sentence.printWords();
    }
}
