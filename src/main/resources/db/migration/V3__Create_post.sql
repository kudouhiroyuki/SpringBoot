CREATE TABLE post (
  id INT AUTO_INCREMENT,
  title VARCHAR(60) NOT NULL,
  content VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO spring.post (title, content, created_at, updated_at) VALUES
('タイトル', '本文', '2010-10-01 00:00:00', '2010-10-01 00:00:00');