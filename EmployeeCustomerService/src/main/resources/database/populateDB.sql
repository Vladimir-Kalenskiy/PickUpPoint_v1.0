INSERT INTO pick_up_point (address, working_hourse)
VALUES ('г.Волгоград, ул.Николая Отрады д.12', '10:00 - 21:00');

INSERT INTO employee (name, position, pick_up_point_id)
VALUES ('Владимир', 'Администратор', 1);

INSERT INTO customer (name, phone,verification_code)
VALUES ('Галина', '123456789', 1884),
       ('Андрей', '987654321', 7878),
       ('Борис', '11223344', 9876);