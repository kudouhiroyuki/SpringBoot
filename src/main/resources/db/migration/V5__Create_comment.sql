CREATE TABLE comment (
  id INT AUTO_INCREMENT,
  post_id INT NOT NULL,
  content VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (post_id) REFERENCES post (id)
);

INSERT INTO spring.comment (post_id, content, created_at, updated_at) VALUES
(1, 'コメント1', '2010-10-01 00:00:00', '2010-10-01 00:00:00'),
(1, 'コメント2', '2010-10-01 00:00:00', '2010-10-01 00:00:00');