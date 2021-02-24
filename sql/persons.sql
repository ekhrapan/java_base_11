CREATE TABLE persons (
	id INT AUTO_INCREMENT,
    last_name VARCHAR(255) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    address VARCHAR(255),
    city VARCHAR(255) DEFAULT 'Minsk',
    email VARCHAR(255) UNIQUE NOT NULL,
    age INT,
    PRIMARY KEY(id),
    CHECK(age >= 0)
);