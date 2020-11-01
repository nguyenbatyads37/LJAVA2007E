CREATE DATABASE demoLjava2007a;

USE demoLjava2007a;

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (`customerName` varchar(100));
INSERT INTO customer VALUES ('long');

DROP PROCEDURE getCustomerName;
DELIMITER $$

CREATE PROCEDURE getCustomerName(
	IN prefix VARCHAR(100), -- Parameter 
	OUT result VARCHAR(100) -- Ouput
)
BEGIN
	DECLARE cust VARCHAR(100); -- Khai bao bien cust
    DECLARE `count` INT DEFAULT 0;
    
    -- CURSOR
	SELECT `customerName` INTO cust -- Gan gia tri cho cust
    FROM customer;
    
    IF cust IS NULL THEN -- Dieu kien
		SET result = 'Name not found';
	ELSE
		SET result = CONCAT(prefix, ' - ',cust);
	END IF;
    
    number_loop: LOOP -- Vong lap --WHILE
		IF `count` < 5 THEN
			SET result = concat(result, `count`);
        ELSE
			LEAVE number_loop;
        END IF;
        SET `count` = `count` + 1;
    END LOOP;
END$$
DELIMITER ;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM customer WHERE 1=1;

CALL getCustomerName('T3H', @result);
SELECT @result;

-- function
SET GLOBAL log_bin_trust_function_creators = 1;
DELIMITER //
CREATE FUNCTION getCustomer(limitRecord INT)
RETURNS INT
BEGIN
	DECLARE result INT;
	SELECT COUNT(*) INTO result FROM customer;
    RETURN result;
END; //
DELIMITER ;

SELECT getCustomer(3);

-- trigger
DELIMITER $$

CREATE TRIGGER customerTrigger
BEFORE INSERT
ON customer FOR EACH ROW
BEGIN
	IF NEW.customerName = '' THEN
		SET NEW.customerName = 'Empty';
    END IF;
END$$
DELIMITER ;

INSERT INTO customer VALUES
('');

SELECT * FROM customer;

-- View
CREATE VIEW queryAllCustomer
AS
	SELECT `customerName` as `name`
    FROM customer;

SELECT * FROM queryAllCustomer;