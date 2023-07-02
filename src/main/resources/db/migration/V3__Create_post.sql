CREATE TABLE post (
  post_id VARCHAR(30) NOT NULL,
  title VARCHAR(60) NOT NULL,
  content VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (post_id)
);