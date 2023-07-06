CREATE TABLE mst_department (
  department_id VARCHAR(30) NOT NULL,
  department_name VARCHAR(30) NOT NULL,
  PRIMARY KEY (department_id)
);

INSERT INTO spring.mst_department (department_id, department_name) VALUES
('A0001', 'アプリケーション'),
('B0001', 'デザイン');