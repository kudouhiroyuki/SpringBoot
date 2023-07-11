CREATE TABLE designation (
  designation_id INT AUTO_INCREMENT,
  designation_name VARCHAR(30) NOT NULL,
  PRIMARY KEY (designation_id)
);

INSERT INTO spring.designation (designation_name) VALUES
('代表取締役社長'),
('一般社員');