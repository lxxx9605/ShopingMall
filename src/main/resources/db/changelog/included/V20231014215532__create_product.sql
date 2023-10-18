CREATE TABLE product
(
    id     BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(255)              NOT NULL,
    price  BIGINT,
    status ENUM ('VALID', 'INVALID') NOT NULL
)