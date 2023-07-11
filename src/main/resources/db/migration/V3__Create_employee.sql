CREATE TABLE employee (
  id INT AUTO_INCREMENT,
  user_name VARCHAR(60) NOT NULL,
  password VARCHAR(100) NOT NULL,
  address VARCHAR(255) NOT NULL,
  age INT NOT NULL, 
  department_id INT NOT NULL,
  designation_id INT NOT NULL,
  point INT,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (department_id) REFERENCES department (department_id),
  FOREIGN KEY (designation_id) REFERENCES designation (designation_id)
);

INSERT INTO spring.employee (user_name, password, address, age, department_id, designation_id, point, created_at, updated_at) VALUES
('名前', 'password', 'address', 30, 1, 1, 0, '2010-10-01 00:00:00', '2010-10-01 00:00:00');