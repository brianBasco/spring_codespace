-- Drop the table if it exists (useful for development purposes)
DROP TABLE IF EXISTS BOOKS;

-- Create the books table
CREATE TABLE BOOKS (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       author VARCHAR(255) NOT NULL
);