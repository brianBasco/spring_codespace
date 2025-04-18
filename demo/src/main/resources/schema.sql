-- Create the books table
CREATE TABLE IF NOT EXISTS BOOKS (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255),
                       author VARCHAR(255)
);