INSERT INTO orders (customer_id, status, pick_up_point_id, order_date)
VALUES (1, 'NOT_PICKED_UP', 1, '2024-02-20 15:30:00'),
       (3, 'NOT_PICKED_UP', 1, '2024-02-20 15:30:00'),
       (3, 'COMPLETED', 1, '2024-03-10 15:30:00'),
       (2, 'COMPLETED', 1, '2024-03-10 15:30:00'),
       (3, 'ACCEPTED', 999, '2024-03-10 16:30:00'),
       (2, 'ACCEPTED', 999, '2024-03-09 18:30:00'),
       (1, 'READY_FOR_PICKUP', 1, '2024-03-08 09:00:00'),
       (1, 'READY_FOR_PICKUP', 1, '2024-03-08 09:30:00');

INSERT INTO products (name_product, description, count, price)
VALUES ('Набор постельного белья', 'Подойдет для 2-х спальной кровати. Состав: 100% сатин.', 100, 1999),
       ('Чехол для телефона', 'Совместимость с iPhone 12 Pro Max', 100, 199),
       ('Футболка мужская', 'Размер: 48-50. Состав: 100% хлопок.', 100, 499),
       ('Футболка женская', 'Размер: 44-46. Состав: 100% хлопок.', 100, 699),
       ('Электро-чайник', 'Объем: 1,8л. Мощьность: 1800 Вт.', 100, 1499),
       ('Автомобильное зарядное устройство', 'Подойдет для мотоциклов и легкового авто.', 100, 1999),
       ('Наушники накладные', 'Отличное звучание. Совместимость с ПК и смартфоном.', 100, 999);

INSERT INTO warehouse (product_id, shelf_number, product_location)
VALUES (6,1,7),
       (7,3,2);

INSERT INTO order_item (orderId, productId, productQuantity, price)
VALUES (1,3, 2, 998),
       (1,4,2,1398),
       (1,6,1,1999),
       (2,5,1,1499),
       (3,1,1,1999),
       (3,2,1,199),
       (4,7,1,999);

INSERT INTO ordersOfCentral (order_id, customer_id, status, pick_up_point_id, order_date)
VALUES (33,1, 'ACCEPTED', 1, '2024-02-20 15:30:00'),
       (44,3, 'ACCEPTED', 1, '2024-02-20 15:30:00'),
       (55,3, 'ACCEPTED', 1, '2024-03-10 15:30:00'),
       (66,2, 'ACCEPTED', 1, '2024-03-10 15:30:00');