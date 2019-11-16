create schema if not exists book_runner_books;
  use book_runner_books;

  create table if not exists fanfiction (
      isbn int(11) NOT NULL PRIMARY KEY,
      title varchar(50) NOT NULL,
      chapter int(5) NOT NULL,
      author varchar(50) NOT NULL,
      publish_date date NOT NULL,
      book_content TEXT NOT NULL
  );

  create table if not exists posts (
    post_id int(11) NOT NULL PRIMARY KEY,
    post_author varchar(50) NOT NULL,
    post_date varchar(50) NOT NULL,
    post_content TEXT NOT NULL
  );
