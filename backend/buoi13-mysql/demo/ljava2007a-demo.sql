CREATE DATABASE `quanlysinhvien`;

USE `quanlysinhvien`;
-- Tao table
CREATE TABLE `subject` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(200),
    `description` VARCHAR(200)
);

-- Sua table
ALTER TABLE `subject`
ADD COLUMN `money` INT;

ALTER TABLE `subject`
MODIFY COLUMN `money` VARCHAR(200);

ALTER TABLE `subject`
DROP COLUMN `money`;

-- Them du lieu vao bang
INSERT INTO `subject`
VALUES
(1, 'toan', 'mon toan'),
(2, 'van', 'mon van'),
(3, 'anh', 'mon anh'),
(4, 'su', 'mon su'),
(5, 'dia', 'mon dia');

-- Chinh sua du lieu trong table
UPDATE `subject`
SET `name` = 'toan hinh'
WHERE `id` = 1;

-- Xoa du lieu trong table
DELETE FROM `subject`
WHERE `id` = 5;

-- Cac cau lenh select
SELECT * FROM `subject`;

SELECT * FROM `subject`
WHERE `id` = 1 AND `name` = 'toan';

SELECT * FROM `subject`
WHERE `id` IN (1, 2);

SELECT * FROM `subject`
WHERE `id` BETWEEN 2 AND 5;

SELECT * FROM `subject`
WHERE `name` LIKE '%a%';

SELECT * FROM `subject`
WHERE `name` IS NOT NULL;

-- Sap xep su dung order by
SELECT * FROM `subject` ORDER BY `id` ASC;

-- Nhom cac ban ghi su dung id
SELECT * FROM `subject` GROUP BY `id`;

-- Su dung group by voi ham cua sql
SELECT COUNT(*) FROM `subject`
WHERE `id` != 5 GROUP BY `id`;

-- Lay 1 ban ghi neu gia tri bi lap lai
INSERT INTO `subject` 
VALUES (5, 'toan hinh', 'demo distinct');
SELECT DISTINCT `name` FROM `subject`;

-- Su dung having sau group by
SELECT * FROM `subject`
GROUP BY `id`
HAVING `id` = 1;

-- Xoa table
DROP TABLE IF EXISTS `sinhvien`;
CREATE TABLE `sinhvien` (
	`id` INT,
    `name` VARCHAR(100),
    `age` INT,
    `subject` INT,
    FOREIGN KEY subjectkey (subject)
    REFERENCES subject(id)
);

INSERT INTO `sinhvien`
VALUES
(1, 'Nguyen Van A', 20, 1),
(2, 'Hoang Thu Ha', 21, 2),
(3, 'Le Hong Phong', 22, 3);

-- Subquery
-- Trong bang sinh vien co bao nhieu ban gi
-- -> tra ve so luong subject tuong ung;
SELECT * FROM `subject`
WHERE id
IN (SELECT `subject` FROM `sinhvien`);

-- LIMIT lay ra 3 ban ghi
SELECT * FROM `subject` LIMIT 3;

ALTER TABLE `sinhvien`
DROP COLUMN `age`;
-- UNION nhom ket qua cua 2 cau select
SELECT * FROM `sinhvien`
UNION
SELECT * FROM `subject`;

-- Xoa database
DROP DATABASE `databasename`;
DROP TABLE `tablename`;

-- Xoa thong tin lien quan den table
TRUNCATE TABLE `tablename`;

-- Inner join
SELECT sv.name FROM `sinhvien` sv
JOIN `subject` sb ON sv.`subject` = sb.`id`;

-- Left join
SELECT * FROM `sinhvien` sv
LEFT JOIN `subject` sb 
ON sv.`subject` = sb.`id`;

-- Right join
SELECT * FROM `sinhvien` sv
RIGHT JOIN `subject` sb 
ON sv.`subject` = sb.`id`;

-- Cross join
SELECT * FROM `sinhvien` sv
CROSS JOIN `subject`;