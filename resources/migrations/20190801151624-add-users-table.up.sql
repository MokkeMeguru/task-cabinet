CREATE TABLE users
(id VARCHAR(20) PRIMARY KEY,
 first_name VARCHAR(30),
 last_name VARCHAR(30),
 email VARCHAR(30),
  admin BOOLEAN,
 last_login TIMESTAMP,
 is_active BOOLEAN,
 pass VARCHAR(300));

CREATE TABLE tasks
(id VARCHAR(20) PRIMARY KEY,
nickname VARCHAR (30),
task_name VARCHAR(300),
deadline TIMESTAMP,
condition VARCHAR(30)
)
