-- ========================
-- vocabulary 表
-- ========================
INSERT INTO vocabulary (word, location)
VALUES ('apple', NULL),
       ('book', NULL),
       ('cat', NULL),
       ('dog', NULL),
       ('elephant', NULL),
       ('fish', NULL),
       ('guitar', NULL),
       ('house', NULL),
       ('ice', NULL),
       ('juice', NULL);

-- ========================
-- property 表
-- ========================
INSERT INTO property (language, tags, note, vocabulary)
VALUES ('EN', NULL, NULL, 1),
       ('EN', NULL, NULL, 2),
       ('EN', NULL, NULL, 3),
       ('EN', NULL, NULL, 4),
       ('EN', NULL, NULL, 5),
       ('EN', NULL, NULL, 6),
       ('EN', NULL, NULL, 7),
       ('EN', NULL, NULL, 8),
       ('EN', NULL, NULL, 9),
       ('EN', NULL, NULL, 10);

-- ========================
-- explanations 表
-- 每个单词 2 个 explanations
-- ========================
INSERT INTO explanations (part_of_speech, meaning, example_sentence, property)
VALUES ('CN', '苹果', 'I eat an apple every day.', 1),
       ('CN', '苹果', 'She bought a red apple.', 1),
       ('CN', '书', 'I read a book yesterday.', 2),
       ('CN', '书', 'This book is very interesting.', 2),
       ('CN', '猫', 'The cat is sleeping.', 3),
       ('CN', '猫', 'I have a black cat.', 3),
       ('CN', '狗', 'My dog is very cute.', 4),
       ('CN', '狗', 'The dog barked loudly.', 4),
       ('CN', '大象', 'The elephant is huge.', 5),
       ('CN', '大象', 'We saw an elephant at the zoo.', 5),
       ('CN', '鱼', 'I like eating fish.', 6),
       ('CN', '鱼', 'There are many fish in the pond.', 6),
       ('CN', '吉他', 'He plays the guitar.', 7),
       ('CN', '吉他', 'The guitar is out of tune.', 7),
       ('CN', '房子', 'This house is beautiful.', 8),
       ('CN', '房子', 'They are building a new house.', 8),
       ('CN', '冰', 'I put ice in my drink.', 9),
       ('CN', '冰', 'The ice melted quickly.', 9),
       ('CN', '果汁', 'I like orange juice.', 10),
       ('CN', '果汁', 'She poured juice into a glass.', 10);

-- ========================
-- picture 表
-- 每个单词插入一条空记录
-- ========================
INSERT INTO picture (name, url, vocabulary)
VALUES (NULL, NULL, 1),
       (NULL, NULL, 2),
       (NULL, NULL, 3),
       (NULL, NULL, 4),
       (NULL, NULL, 5),
       (NULL, NULL, 6),
       (NULL, NULL, 7),
       (NULL, NULL, 8),
       (NULL, NULL, 9),
       (NULL, NULL, 10);

-- ========================
-- history 表
-- 每个单词一条 history，query_times 为空数组
-- ========================
INSERT INTO history (first_record_time, query_times, last_query_time, vocabulary)
VALUES ('2025-11-19 10:00:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:00:00', 1),
       ('2025-11-19 10:05:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:05:00', 2),
       ('2025-11-19 10:10:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:10:00', 3),
       ('2025-11-19 10:15:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:15:00', 4),
       ('2025-11-19 10:20:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:20:00', 5),
       ('2025-11-19 10:25:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:25:00', 6),
       ('2025-11-19 10:30:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:30:00', 7),
       ('2025-11-19 10:35:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:35:00', 8),
       ('2025-11-19 10:40:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:40:00', 9),
       ('2025-11-19 10:45:00', ARRAY []::TIMESTAMP[], '2025-11-19 10:45:00', 10);
