CREATE TABLE user (
  id INT AUTO_INCREMENT,
  user_name VARCHAR(60) NOT NULL,
  password VARCHAR(100) NOT NULL,
  address VARCHAR(255) NOT NULL,
  age INT NOT NULL, 
  department_id VARCHAR(30) NOT NULL,
  point INT,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (department_id) REFERENCES department (department_id)
);