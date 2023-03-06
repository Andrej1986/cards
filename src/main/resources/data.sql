DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
    `card_id` int AUTO_INCREMENT,
    `card_number` VARCHAR(100) NOT NULL,
    `customer_id` int NOT NULL,
    `card_type` VARCHAR(100) NOT NULL,
    `total_limit` int NOT NULL,
    `amount_used` int NOT NULL,
    `available_amount` int NOT NULL,
    `create_dt` DATE DEFAULT NULL,
    PRIMARY KEY (`card_id`)
);

INSERT INTO `cards` (`card_number`, `customer_id`, `card_type`, `total_limit`, `amount_used`, `available_amount`, `create_dt`)
    VALUES ('CZ10 1111 1111 1111 1111', 1, 'Credit', 10000, 500, 9500, CURRENT_DATE);

INSERT INTO `cards` (`card_number`, `customer_id`, `card_type`, `total_limit`, `amount_used`, `available_amount`, `create_dt`)
    VALUES ('CZ20 2222 2222 2222 2222', 1, 'Credit', 7500, 600, 6900, CURRENT_DATE);

INSERT INTO `cards` (`card_number`, `customer_id`, `card_type`, `total_limit`, `amount_used`, `available_amount`, `create_dt`)
    VALUES ('CZ30 3333 3333 3333 3333', 1, 'Credit', 20000, 4000, 16000, CURRENT_DATE);