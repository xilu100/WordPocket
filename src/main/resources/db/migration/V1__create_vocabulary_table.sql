DROP TABLE IF EXISTS explanations CASCADE;
DROP TABLE IF EXISTS picture CASCADE;
DROP TABLE IF EXISTS history CASCADE;
DROP TABLE IF EXISTS property CASCADE;
DROP TABLE IF EXISTS vocabulary CASCADE;

CREATE TYPE language_enum AS ENUM ('EN', 'ZH', 'DE', 'JP', 'FR', 'ES', 'CUSTOM');
CREATE TYPE part_of_speech_enum AS ENUM (
    'CN', 'UCN', 'V', 'ADJ', 'ADV',
    'PREP', 'CONJ', 'PRON', 'PHRASE', 'OTHER'
    );
CREATE TABLE IF NOT EXISTS vocabulary
(
    id       SERIAL PRIMARY KEY,
    word     TEXT UNIQUE NOT NULL,
    location TEXT
);
CREATE TABLE IF NOT EXISTS property
(
    id         SERIAL PRIMARY KEY,
    language   language_enum NOT NULL,
    tags       TEXT[],
    note       TEXT,
    vocabulary INTEGER REFERENCES vocabulary (id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS history
(
    id                SERIAL PRIMARY KEY,
    first_record_time TIMESTAMP NOT NULL,
    query_times       TIMESTAMP[],
    last_query_time   TIMESTAMP NOT NULL,
    vocabulary        INTEGER REFERENCES vocabulary (id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS picture
(
    id         SERIAL PRIMARY KEY,
    name       TEXT,
    url        TEXT,
    vocabulary INTEGER REFERENCES vocabulary (id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS explanations
(
    id               SERIAL PRIMARY KEY,
    part_of_speech   part_of_speech_enum NOT NULL,
    meaning          TEXT                NOT NULL,
    example_sentence TEXT                NOT NULL,
    property         INTEGER REFERENCES property (id) ON DELETE CASCADE,
    property_key     INTEGER
);