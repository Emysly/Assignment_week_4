package com.emysilva.interfaces;

import com.emysilva.model.Book;

import java.io.IOException;
import java.util.List;

public interface LibraryUtil {
    void makeRequestByPriority(String memberType);
    void lendBookByPriority(int bookId) throws IOException;
    void makeRequestByFifo(String memberType);
    void lendBookByFifo(int bookId);
    void returnBook(int bookId);
    List<Book> getBooks();
    void addBook(Book book);
    void getBooksByTitle(String title);
    void removeBook(Book book);
    boolean getStatus();
}
