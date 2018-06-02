CREATE TABLE IF NOT EXISTS
  users(id VARCHAR(50) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), username VARCHAR(50), email VARCHAR(50),
  phone VARCHAR(50), website VARCHAR(50), address_Id VARCHAR(50), company_id VARCHAR(50));

CREATE TABLE IF NOT EXISTS
  address(address_id VARCHAR(50) PRIMARY KEY AUTO_INCREMENT, street VARCHAR(50), suite VARCHAR(50), city VARCHAR(50),
  zipcode VARCHAR(50), geo_id VARCHAR(50));


CREATE TABLE IF NOT EXISTS
  company(company_id VARCHAR(50) PRIMARY KEY, company_name VARCHAR(50),catch_phrase VARCHAR(50), bs VARCHAR(50));

CREATE TABLE IF NOT EXISTS
  geo( geo_id VARCHAR(50) PRIMARY KEY, lat FLOAT, lng FLOAT);