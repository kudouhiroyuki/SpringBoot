CREATE TABLE notifications (
  id INT AUTO_INCREMENT,
  derivery_started_at DATETIME NOT NULL,
  derivery_ended_at DATETIME NOT NULL,
  subject VARCHAR(50) NOT NULL,
  body VARCHAR(50) NOT NULL,
  is_important BOOLEAN NOT NULL,
  created_employee_number INT NOT NULL,
  updated_employee_number INT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.notifications (derivery_started_at, derivery_ended_at, subject, body, is_important, created_employee_number, updated_employee_number, created_at, updated_at) VALUES
('2023-08-01 00:00:00', '2023-12-01 00:00:00', '件名1', '本文', true, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00'),
('2023-08-01 00:00:00', '2023-12-01 00:00:00', '件名2', '本文', false, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00'),
('2022-08-01 00:00:00', '2022-12-01 00:00:00', '件名3', '本文', true, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00');

CREATE TABLE abbreviations (
  id INT AUTO_INCREMENT,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  department_code VARCHAR(6) NOT NULL,
  department_group_code VARCHAR(6) NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.abbreviations (code, name, department_code, department_group_code) VALUES
('abbre1', '略号名称', 'dep1', 'depGr1'),
('abbre2', '略号名称', 'dep2', 'depGr2');

CREATE TABLE parks (
  id INT AUTO_INCREMENT,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.parks (code, name, is_deleted) VALUES
('CODE11', 'パーク1', true),
('CODE12', 'パーク2', false),
('CODE13', 'パーク3', false);

CREATE TABLE parks_areas (
  id INT AUTO_INCREMENT,
  park_id INT NOT NULL,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.parks_areas (park_id, code, name, is_deleted) VALUES
(1, 'CODE11', 'パークエリア1', true),
(2, 'CODE12', 'パークエリア2', false),
(3, 'CODE13', 'パークエリア3', false);

CREATE TABLE areas_complexes (
  id INT AUTO_INCREMENT,
  park_area_id INT NOT NULL,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.areas_complexes (park_area_id, code, name, is_deleted) VALUES
(1, 'CODE11', 'エリアコンプレックス1', true),
(2, 'CODE12', 'エリアコンプレックス2', false),
(3, 'CODE13', 'エリアコンプレックス3', false);

CREATE TABLE complexes_facilities (
  id INT AUTO_INCREMENT,
  area_complex_id INT NOT NULL,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.complexes_facilities (area_complex_id, code, name, is_deleted) VALUES
(1, 'CODE11', 'コンプレックス施設1', true),
(2, 'CODE12', 'コンプレックス施設2', false),
(3, 'CODE13', 'コンプレックス施設3', false);

CREATE TABLE types (
  id INT AUTO_INCREMENT,
  code VARCHAR(10) NOT NULL,
  name VARCHAR(255) NOT NULL,
  is_deleted BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);
INSERT INTO spring.types (code, name, is_deleted) VALUES
('CODE11', '種類1', true),
('CODE12', '種類2', false),
('CODE13', '種類3', false);