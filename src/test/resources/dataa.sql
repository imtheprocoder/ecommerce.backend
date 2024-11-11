-- passwords are in the format: Password<UserLetter>123. Unless specified otherwise.
-- Encrypted using https://www.javainuse.com/onlineBcrypt
INSERT INTO
    local_user (
        email,
        first_name,
        last_name,
        password,
        username,
        email_verified
    )
VALUES (
        'UserA@junit.com',
        'UserA-FirstName',
        'UserA-LastName',
        '$2a$10$oCMJxg7il8HFN8I7kJ4BfeuTdIF/aOYFm2hgs2brUONoKCZdABZs6',
        'UserA',
        true
    ),
    (
        'UserB@junit.com',
        'UserB-FirstName',
        'UserB-LastName',
        '$2a$10$6HMOA5xOaGliJLwo1GL8kuqBARM/uhRVba0n47PBjB8oaHPd8T8dS',
        'UserB',
        false
    );