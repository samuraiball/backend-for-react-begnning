ALTER TABLE users ADD company_name VARCHAR(50) NOT NULL DEFAULT 'Romaguera-Crona';
ALTER TABLE users ADD CONSTRAINT FK_USERS_COMPANY_NAME FOREIGN KEY (company_name) REFERENCES company;

ALTER TABLE users ADD address_id VARCHAR(50) NOT NULL DEFAULT '1';
ALTER TABLE users ADD CONSTRAINT FK_USERS_ADDRESS_ID FOREIGN KEY (address_id) REFERENCES address;

ALTER TABLE address ADD lat FLOAT NOT NULL DEFAULT -37.3159;
ALTER TABLE address ADD CONSTRAINT FK_ADDRESS_GEO FOREIGN KEY (lat) REFERENCES geo;