DROP TABLE IF EXISTS orders;
CREATE TABLE IF NOT EXISTS orders
(
    order_id BIGSERIAL PRIMARY KEY,
    customer_id BIGSERIAL NOT NULL,
    status VARCHAR(45) NOT NULL,
    pick_up_point_id BIGSERIAL NOT NULL,
    order_date TIMESTAMP
);

DROP TABLE IF EXISTS products;
CREATE TABLE IF NOT EXISTS products
(
    productId BIGSERIAL PRIMARY KEY,
    name_product VARCHAR(55) NOT NULL,
    description VARCHAR(245) NOT NULL,
    count INT NOT NULL,
    price DOUBLE PRECISION NOT NULL
);

DROP TABLE IF EXISTS warehouse;
CREATE TABLE IF NOT EXISTS warehouse
(
    product_id BIGSERIAL NOT NULL,
    shelf_number INT NOT NULL,
    product_location INT NOT NULL
);

DROP TABLE IF EXISTS order_item;
CREATE TABLE IF NOT EXISTS order_item
(
    id BIGSERIAL PRIMARY KEY,
    orderId BIGSERIAL NOT NULL,
    productId BIGSERIAL NOT NULL,
    productQuantity INT NOT NULL,
    price DOUBLE PRECISION NOT NULL
);

DROP TABLE IF EXISTS ordersOfCentral;
CREATE TABLE IF NOT EXISTS ordersOfCentral
(
    order_id BIGSERIAL PRIMARY KEY,
    customer_id BIGSERIAL NOT NULL,
    status VARCHAR(45) NOT NULL,
    pick_up_point_id BIGSERIAL NOT NULL,
    order_date TIMESTAMP
);