/*Seed Data for Products*/
INSERT INTO product (name, description, price, available, imageURL) VALUES
('SpaceX Starship', 'Designed by Elon Musk!', 900000000, 1, 'SpaceX-Starship.png'),
('LauncherOne', 'The safest rocket ship known to man!', 450000000, 1, 'LauncherOne.png'),
('Vulcan Centaur', 'Made from rare materials!', 700000000, 1, 'Vulcan-Centaur.png'),
('MX-774', 'Vintage rocket ship designed to be cost efficient!', 1000000000, 1, 'MX-774.png'),
('PGM-11 Redstone', 'The most operator-friendly rocket ship!', 200000000, 1, 'PGM-11-Redstone.png'),
('New Shepherd', 'Our most unique lightweight design!', 300000000, 1, 'Titan-IIID.png');
/*
Data for ShippingType
*/

INSERT INTO shipping_Types (shipping_Type, price, description) VALUES
('Overnight', 29, 'Product will arrive within the next 24 hours to your address'),
('3-Day', 19, 'Product will arrive within the next 3-Business Days to your address'),
('Ground', 0, 'Product will arrive within the next 14-Business Days to your address');

/*Data for Administrators*/
INSERT INTO Customers (FIRST_Name, LAST_Name, email, PHONE_Number, username, password, is_Admin, address_Line, state, country, zip_Code) VALUES
('Diego', 'Frausto Ramirez', 'dfraust4@students.kennesaw.edu', '333-333-3333', 'dram2023', 'fraustox91*', 1, '1100 South Marietta Pkwy SE', 'Georgia', 'United States', '30127'),
('Jeff', 'Adkisson', 'jadkisson@kennesaw.edu', '444-444-4444', 'jeffadkisson1', 'professorJeff123', 1, '1100 South Marietta Pkwy SE', 'Georgia', 'United States', '30127'),
('Matthew', 'Elledge', 'melledge@students.kennesaw.edu', '555-555-5555', 'w00tam', 'mell87msb', 1, '1100 South Marietta Pkwy SE', 'Georgia', 'United States', '30127'),
('David', 'Lowe', 'dlowe23@students.kennesaw.edu', '777-777-7777', 'dLowe2023', 'Wol73x3d', 1, '1100 South Marietta Pkwy SE', 'Georgia', 'United States', '30127'),
('Eunsu', 'You', 'eyou1@students.kennesaw.edu', '888-888-8888', 'eYou2023', 'Ouy25x7F', 1, '1100 South Marietta Pkwy SE', 'Georgia', 'United States', '30127');









