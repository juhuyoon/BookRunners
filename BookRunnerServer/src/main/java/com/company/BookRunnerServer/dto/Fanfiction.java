package com.company.BookRunnerServer.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;

public class Fanfiction {
    private int isbn;
    @NotBlank(message = "Title must not be blank")
    private String title;
    @NotEmpty(message = "Must note a chapter")
    @Size(min = 1, message = "chapter must start at 1")
    private int chapter;
    @NotBlank(message = "Must list the author")
    private String author;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;
    @NotEmpty(message = "must hold book content")
    private String book_content;

    public Fanfiction(int isbn, @NotBlank(message = "Title must not be blank") String title, @NotEmpty(message = "Must note a chapter") @Size(min = 1, message = "chapter must start at 1") int chapter, @NotBlank(message = "Must list the author") String author, @NotNull LocalDate date, @NotEmpty(message = "must hold book content") String book_content) {
        this.isbn = isbn;
        this.title = title;
        this.chapter = chapter;
        this.author = author;
        this.date = date;
        this.book_content = book_content;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBook_content() {
        return book_content;
    }

    public void setBook_content(String book_content) {
        this.book_content = book_content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fanfiction that = (Fanfiction) o;
        return isbn == that.isbn &&
                chapter == that.chapter &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(date, that.date) &&
                Objects.equals(book_content, that.book_content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, chapter, author, date, book_content);
    }

    @Override
    public String toString() {
        return "Fanfiction{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", chapter=" + chapter +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", book_content='" + book_content + '\'' +
                '}';
    }
}
