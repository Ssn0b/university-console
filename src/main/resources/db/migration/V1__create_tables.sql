-- Create Lectors Table
CREATE TABLE IF NOT EXISTS _lectors
(
    id         UUID PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    degree     VARCHAR(50),
    salary     FLOAT
);

-- Create Departments Table
CREATE TABLE IF NOT EXISTS _departments
(
    id                 UUID PRIMARY KEY,
    name               VARCHAR(255),
    head_of_department_id UUID,
    FOREIGN KEY (head_of_department_id) REFERENCES _lectors (id)
);

-- Create Association Table for Lectors and Departments
CREATE TABLE IF NOT EXISTS lectors_departments
(
    lector_id     UUID,
    department_id UUID,
    FOREIGN KEY (lector_id) REFERENCES _lectors (id),
    FOREIGN KEY (department_id) REFERENCES _departments (id)
);