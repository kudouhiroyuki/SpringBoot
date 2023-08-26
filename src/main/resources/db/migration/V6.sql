CREATE TABLE notification (
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

INSERT INTO spring.notification (derivery_started_at, derivery_ended_at, subject, body, is_important, created_employee_number, updated_employee_number, created_at, updated_at) VALUES
('2023-08-01 00:00:00', '2023-12-01 00:00:00', '件名1', '本文', true, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00'),
('2023-08-01 00:00:00', '2023-12-01 00:00:00', '件名2', '本文', false, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00'),
('2022-08-01 00:00:00', '2022-12-01 00:00:00', '件名3', '本文', true, 1, 1, '2010-10-01 00:00:00', '2010-10-01 00:00:00');