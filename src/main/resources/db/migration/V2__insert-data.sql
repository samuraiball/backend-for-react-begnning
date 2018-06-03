INSERT INTO geo (geo_id, lat, lng) VALUES (1, -37.3159, 81.1496);
INSERT INTO geo (geo_id, lat, lng) VALUES (2, -43.9509, -34.4618);
INSERT INTO geo (geo_id, lat, lng) VALUES (3, -68.6102, -47.0653);


INSERT INTO address (address_id, street, suite, city, zipcode, geo_id)
VALUES (1, 'Kulas Light', 'Apt. 556', 'Gwenborough', '92998-3874', '1');

INSERT INTO address (address_id, street, suite, city, zipcode, geo_id)
VALUES (2, 'Victor Plains', 'Suite 879', 'Wisokyburgh', '90566-7771', '2');

INSERT INTO address (address_id, street, suite, city, zipcode, geo_id)
VALUES (3, 'Douglas Extension', 'Suite 879', 'McKenziehaven', '59590-4157', '3');

INSERT INTO company (company_id, company_name, catch_phrase, bs)
VALUES (1, 'Romaguera-Crona', 'Multi-layered client-server neural-net', 'harness real-time e-markets');

INSERT INTO company (company_id, company_name, catch_phrase, bs)
VALUES (2, 'Deckow-Crist', 'Proactive didactic contingency', 'synergize scalable supply-chainsl');

INSERT INTO company (company_id, company_name, catch_phrase, bs)
VALUES (3, 'Romaguera-Jacobson', 'Face to face bifurcated interface', 'e-enable strategic applications');


INSERT INTO users (id, name, username, email, phone, website, address_id, company_id)
VALUES (1, 'Leanne Graham', 'Bret', 'Sincere@april.biz', '1-770-736-8031 x56442', 'hildegard.org', '1', '1');

INSERT INTO users (id, name, username, email, phone, website, address_id, company_id)
VALUES (2, 'Ervin Howell', 'Antonette', 'Shanna@melissa.tv', '010-692-6593 x09125', 'anastasia.net', '2', '2');

INSERT INTO users (id, name, username, email, phone, website, address_id, company_id)
VALUES (3, 'Clementine Bauch', 'amantha', 'Nathan@yesenia.net', '1-463-123-4447', 'ramiro.info', '3', '3');
