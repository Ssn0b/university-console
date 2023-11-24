-- Lectors
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('abf4e505-3d7b-4a5f-810e-9295d819b40c', 'Oleh', 'Doe', 'ASSISTANT', 50000);
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('ff47c67f-11cc-42a1-9d0e-f21642479d5e', 'Olha', 'Smith', 'PROFESSOR', 80000);
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('e68bb8e1-4861-4b47-9abf-8502f48cda6d', 'Olena', 'Johnson', 'ASSOCIATE_PROFESSOR', 65000);
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('bbf4e505-3d7b-4a5f-810e-9295d819b40c', 'Vlad', 'Brown', 'ASSISTANT', 40000);
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('cc47c67f-11cc-42a1-9d0e-f21642479d5e', 'Dmytro', 'Green', 'ASSOCIATE_PROFESSOR', 15000);
INSERT INTO _lectors (id, first_name, last_name, degree, salary) VALUES ('dd8bb8e1-4861-4b47-9abf-8502f48cda6d', 'Ivan', 'Gray', 'ASSOCIATE_PROFESSOR', 35000);

-- Departments
INSERT INTO _departments (id, name, head_of_department) VALUES ('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'Computer Science','abf4e505-3d7b-4a5f-810e-9295d819b40c');
INSERT INTO _departments (id, name, head_of_department) VALUES ('28d4eab6-9fc3-4f92-810d-3d2c7a6da0d0', 'Mathematics', 'ff47c67f-11cc-42a1-9d0e-f21642479d5e');
INSERT INTO _departments (id, name, head_of_department) VALUES ('e4eaaaf2-631c-41e1-8d8c-ba62b0735f5f', 'Physics', 'e68bb8e1-4861-4b47-9abf-8502f48cda6d');

-- Assign lectors to departments
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('abf4e505-3d7b-4a5f-810e-9295d819b40c', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11');
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('ff47c67f-11cc-42a1-9d0e-f21642479d5e', '28d4eab6-9fc3-4f92-810d-3d2c7a6da0d0');
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('e68bb8e1-4861-4b47-9abf-8502f48cda6d', 'e4eaaaf2-631c-41e1-8d8c-ba62b0735f5f');
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('bbf4e505-3d7b-4a5f-810e-9295d819b40c', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11');
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('cc47c67f-11cc-42a1-9d0e-f21642479d5e', '28d4eab6-9fc3-4f92-810d-3d2c7a6da0d0');
INSERT INTO lectors_departments (lector_id, department_id) VALUES ('dd8bb8e1-4861-4b47-9abf-8502f48cda6d', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11');