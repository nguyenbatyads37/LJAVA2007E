USE demoljava2007a;

CREATE TABLE `order` (
	`id` INT PRIMARY KEY,
    `name` VARCHAR(100) UNIQUE NOT NULL,
    `product` VARCHAR(200) NOT NULL,
    `ordertime` DATETIME
);

DELIMITER $$

CREATE PROCEDURE checkOrder(
	OUT result VARCHAR(100)
)
BEGIN
	SELECT COUNT(`id`) INTO result
    FROM `order`;
    
    IF result < 10 THEN
		SET result = 'Con trong';
	END IF;
    
	IF result > 10 THEN
		SET result = 'Qua tai';
	END IF;
END $$

DELIMITER ;

INSERT INTO `demoljava2007a`.`order`
(`id`, `name`, `product`)
VALUES
(22, 'NGuyen van X', 'Samsung'),
(5, 'NGuyen van E', 'Samsung', NOW()),
(6, 'NGuyen van F', 'Samsung', NOW()),
(7, 'NGuyen van G', 'Samsung', NOW()),
(8, 'NGuyen van L', 'Samsung', NOW()),
(9, 'NGuyen van M', 'Samsung', NOW()),
(10, 'NGuyen van J', 'Samsung', NOW()),
(11, 'NGuyen van K', 'Samsung', NOW()),
(12, 'NGuyen van O', 'Samsung', NOW()),
(13, 'NGuyen van Q', 'Samsung', NOW());

CALL checkOrder(@result);
SELECT @result;

DELIMITER $$
	CREATE TRIGGER modifyOrderTime
    BEFORE INSERT
    ON `order` FOR EACH ROW
    BEGIN
		SET NEW.ordertime = NOW();
    END$$
DELIMITER ;

INSERT INTO `demoljava2007a`.`order`
(`id`,
`name`,
`product`)
VALUES
(100, 'demo trigger', 'demo trigger');
