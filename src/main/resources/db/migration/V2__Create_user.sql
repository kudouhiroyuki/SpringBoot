CREATE TABLE user (
  id INT AUTO_INCREMENT,
  user_name VARCHAR(191) NOT NULL,
  password VARCHAR(191) NOT NULL,
  address VARCHAR(191) NOT NULL,
  age VARCHAR(191) NOT NULL, 
  department_id VARCHAR(191) NOT NULL,
  point INT,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (department_id) REFERENCES department (department_id)
);