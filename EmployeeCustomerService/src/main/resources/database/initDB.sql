DROP TABLE IF EXISTS pick_up_point;
CREATE TABLE IF NOT EXISTS pick_up_point
(
    pick_up_point_id BIGSERIAL PRIMARY KEY,
    address VARCHAR(150) NOT NULL,
    working_hourse VARCHAR(45) NOT NULL
);

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee
(
    employee_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    position VARCHAR(45) NOT NULL,
    pick_up_point_id BIGSERIAL NOT NULL
);

DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer
(
    customer_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    phone VARCHAR(45) NOT NULL,
    verification_code INT NOT NULL
);