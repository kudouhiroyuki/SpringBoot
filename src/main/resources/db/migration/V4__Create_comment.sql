CREATE TABLE comment (
  id INT AUTO_INCREMENT,
  post_id VARCHAR(30) NOT NULL,
  content VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (post_id) REFERENCES post (post_id)
);