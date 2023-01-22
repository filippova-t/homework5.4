CREATE TABLE employee (
                          name TEXT,
                          department TEXT,
                          salary INTEGER
);

ALTER TABLE employee DROP COLUMN department;
ALTER TABLE employee ADD COLUMN department INTEGER;

SELECT MAX (salary), department FROM employee GROUP BY department
HAVING COUNT (department) >1 ORDER BY department;

SELECT AVG (salary), department FROM employee GROUP BY department
HAVING COUNT (department) >1 ORDER BY department