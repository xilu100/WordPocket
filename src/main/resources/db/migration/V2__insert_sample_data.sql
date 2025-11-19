-- V2__insert_sample_data.sql

-------------------------------------
-- 插入 Picture
-------------------------------------
INSERT INTO picture (id, name, url)
VALUES (1, 'AI Icon', 'https://example.com/ai.png'),
       (2, 'Food Icon', 'https://example.com/food.png'),
       (3, 'Adjective Icon', 'https://example.com/adj.png');

-------------------------------------
-- 插入 History（15 条）
-------------------------------------
INSERT INTO history (id, first_record_time, query_times, last_query_time)
VALUES (1, NOW(), ARRAY [NOW()], NOW()),
       (2, NOW(), ARRAY [NOW()], NOW()),
       (3, NOW(), ARRAY [NOW()], NOW()),
       (4, NOW(), ARRAY [NOW()], NOW()),
       (5, NOW(), ARRAY [NOW()], NOW()),
       (6, NOW(), ARRAY [NOW()], NOW()),
       (7, NOW(), ARRAY [NOW()], NOW()),
       (8, NOW(), ARRAY [NOW()], NOW()),
       (9, NOW(), ARRAY [NOW()], NOW()),
       (10, NOW(), ARRAY [NOW()], NOW()),
       (11, NOW(), ARRAY [NOW()], NOW()),
       (12, NOW(), ARRAY [NOW()], NOW()),
       (13, NOW(), ARRAY [NOW()], NOW()),
       (14, NOW(), ARRAY [NOW()], NOW()),
       (15, NOW(), ARRAY [NOW()], NOW());

-------------------------------------
-- 插入 Property（15 条）
-------------------------------------
INSERT INTO property (id, language, note, tags)
VALUES
-- EN (AI)
(1, 'EN', '人工智能相关词汇', ARRAY ['AI', 'Tech']),
(2, 'EN', '人工智能相关词汇', ARRAY ['AI', 'Tech']),
(3, 'EN', '人工智能相关词汇', ARRAY ['AI', 'Tech']),
(4, 'EN', '人工智能相关词汇', ARRAY ['AI', 'Tech']),
(5, 'EN', '人工智能相关词汇', ARRAY ['AI', 'Tech']),

-- ZH (Food)
(6, 'ZH', '食物类名词', ARRAY ['Food']),
(7, 'ZH', '食物类名词', ARRAY ['Food']),
(8, 'ZH', '食物类名词', ARRAY ['Food']),
(9, 'ZH', '食物类名词', ARRAY ['Food']),
(10, 'ZH', '食物类名词', ARRAY ['Food']),

-- DE (Adjectives)
(11, 'DE', '德语形容词', ARRAY ['Adjective']),
(12, 'DE', '德语形容词', ARRAY ['Adjective']),
(13, 'DE', '德语形容词', ARRAY ['Adjective']),
(14, 'DE', '德语形容词', ARRAY ['Adjective']),
(15, 'DE', '德语形容词', ARRAY ['Adjective']);

-------------------------------------
-- 插入 Explanation
-------------------------------------

-------------------------------------
-- 英语 AI（每个 3 条，不同词性或不同用法）
-------------------------------------

-- Artificial Intelligence
INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (1, 1, 'CN', '人工智能', 'Artificial Intelligence is transforming industries.'),
       (2, 1, 'CN', '智能系统的总称', 'AI systems can learn from data.'),
       (3, 1, 'OTHER', 'AI 的研究领域', 'AI is a major field in computer science.');

-- Machine Learning
INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (4, 2, 'CN', '机器学习', 'Machine learning improves through experience.'),
       (5, 2, 'CN', '一种让模型自动学习的技术', 'ML models learn patterns from datasets.'),
       (6, 2, 'OTHER', 'AI 的一个重要分支', 'Machine learning powers many AI applications.');

-- Neural Network
INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (7, 3, 'CN', '神经网络', 'Neural networks mimic the human brain.'),
       (8, 3, 'CN', '深度学习的核心结构', 'Deep learning relies heavily on neural networks.'),
       (9, 3, 'OTHER', '由多层节点构成的模型', 'A neural network contains interconnected nodes.');

-- Algorithm
INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (10, 4, 'CN', '算法', 'An algorithm solves a specific problem.'),
       (11, 4, 'V', '按步骤处理数据的方式', 'We algorithmically process millions of rows.'),
       (12, 4, 'OTHER', '计算过程的描述', 'Good algorithms ensure efficiency.');

-- Data Mining
INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (13, 5, 'CN', '数据挖掘', 'Data mining discovers patterns in data.'),
       (14, 5, 'CN', '从大数据中提取信息的技术',
        'Companies use data mining to understand customers.'),
       (15, 5, 'OTHER', '分析数据的过程', 'Data mining often uses machine learning.');

-------------------------------------
-- 中文（食物，每个 1 条，meaning 英文）
-------------------------------------

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (16, 6, 'CN', 'apple', '我喜欢吃苹果。'),
       (17, 7, 'CN', 'bread', '面包很容易消化。'),
       (18, 8, 'UCN', 'rice', '米饭是亚洲主食。'),
       (19, 9, 'CN', 'tomato', '西红柿可以做汤。'),
       (20, 10, 'CN', 'banana', '香蕉很甜。');

-------------------------------------
-- 德语（形容词，每个 2 条 ADJ，不同含义，德文例句）
-------------------------------------

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (21, 11, 'ADJ', '高兴的', 'Ich bin glücklich.'),
       (22, 11, 'ADJ', '令人满意的', 'Das Ergebnis ist glücklich.');

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (23, 12, 'ADJ', '快速的', 'Der Hund ist schnell.'),
       (24, 12, 'ADJ', '灵敏的', 'Er reagiert schnell.');

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (25, 13, 'ADJ', '美丽的', 'Das Bild ist schön.'),
       (26, 13, 'ADJ', '令人愉快的', 'Wir hatten einen schönen Tag.');

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (27, 14, 'ADJ', '冷的', 'Es ist kalt.'),
       (28, 14, 'ADJ', '冷淡的', 'Seine Reaktion war kalt.');

INSERT INTO explanation (id, property_id, part_of_speech, meaning, example_sentence)
VALUES (29, 15, 'ADJ', '聪明的', 'Sie ist sehr klug.'),
       (30, 15, 'ADJ', '机智的', 'Er hat eine kluge Lösung gefunden.');

-------------------------------------
-- Vocabulary（15 条）
-------------------------------------
INSERT INTO vocabulary (id, word, property_id, history_id, location, picture_id)
VALUES
-- EN
(1, 'Artificial Intelligence', 1, 1, NULL, 1),
(2, 'Machine Learning', 2, 2, NULL, 1),
(3, 'Neural Network', 3, 3, NULL, 1),
(4, 'Algorithm', 4, 4, NULL, 1),
(5, 'Data Mining', 5, 5, NULL, 1),

-- ZH
(6, '苹果', 6, 6, NULL, 2),
(7, '面包', 7, 7, NULL, 2),
(8, '米饭', 8, 8, NULL, 2),
(9, '西红柿', 9, 9, NULL, 2),
(10, '香蕉', 10, 10, NULL, 2),

-- DE
(11, 'glücklich', 11, 11, NULL, 3),
(12, 'schnell', 12, 12, NULL, 3),
(13, 'schön', 13, 13, NULL, 3),
(14, 'kalt', 14, 14, NULL, 3),
(15, 'klug', 15, 15, NULL, 3);
