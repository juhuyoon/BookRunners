package com.company.BookRunnerServer.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class Posts {
    private int post_id;
    @NotBlank
    private int isbn;
    @NotEmpty(message = "Must enter poster")
    private String post_author;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate post_date;
    @NotBlank(message = "must leave a message")
    private String post_content;

    public Posts(int post_id, @NotBlank int isbn, @NotEmpty(message = "Must enter poster") String post_author, @NotNull LocalDate post_date, @NotBlank(message = "must leave a message") String post_content) {
        this.post_id = post_id;
        this.isbn = isbn;
        this.post_author = post_author;
        this.post_date = post_date;
        this.post_content = post_content;
    }

    public Posts(@NotBlank int isbn, @NotEmpty(message = "Must enter poster") String post_author, @NotNull LocalDate post_date, @NotBlank(message = "must leave a message") String post_content) {
        this.isbn = isbn;
        this.post_author = post_author;
        this.post_date = post_date;
        this.post_content = post_content;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getPost_author() {
        return post_author;
    }

    public void setPost_author(String post_author) {
        this.post_author = post_author;
    }

    public LocalDate getPost_date() {
        return post_date;
    }

    public void setPost_date(LocalDate post_date) {
        this.post_date = post_date;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posts posts = (Posts) o;
        return post_id == posts.post_id &&
                isbn == posts.isbn &&
                Objects.equals(post_author, posts.post_author) &&
                Objects.equals(post_date, posts.post_date) &&
                Objects.equals(post_content, posts.post_content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post_id, isbn, post_author, post_date, post_content);
    }

    @Override
    public String toString() {
        return "Posts{" +
                "post_id=" + post_id +
                ", isbn=" + isbn +
                ", post_author='" + post_author + '\'' +
                ", post_date=" + post_date +
                ", post_content='" + post_content + '\'' +
                '}';
    }
}
