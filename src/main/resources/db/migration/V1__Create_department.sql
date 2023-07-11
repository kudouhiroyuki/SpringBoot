CREATE TABLE department (
  department_id INT AUTO_INCREMENT,
  department_name VARCHAR(30) NOT NULL,
  PRIMARY KEY (department_id)
);

INSERT INTO spring.department (department_name) VALUES
('アプリケーション'),
('デザイン');