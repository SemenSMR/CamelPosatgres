DROP TABLE IF EXISTS books;

CREATE TABLE books (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(100),
                       author VARCHAR(100)
);

INSERT INTO books (title, author) VALUES
                                      ('Dune', 'Frank Herbert'),
                                      ('1984', 'George Orwell'),
                                      ('The Hobbit', 'J.R.R. Tolkien'),
                                      ('Fahrenheit 451', 'Ray Bradbury');
