DROP TABLE IF EXISTS vocabulary CASCADE;
DROP TABLE IF EXISTS explanation CASCADE;
DROP TABLE IF EXISTS property CASCADE;
DROP TABLE IF EXISTS history CASCADE;
DROP TABLE IF EXISTS picture CASCADE;

DROP TYPE IF EXISTS language_enum CASCADE;
CREATE TYPE language_enum AS ENUM ('EN', 'ZH', 'DE', 'JP', 'FR', 'ES', 'CUSTOM');

DROP TYPE IF EXISTS part_of_speech_enum CASCADE;
CREATE TYPE part_of_speech_enum AS ENUM (
    'CN', 'UCN', 'V', 'ADJ', 'ADV', 'PREP', 'CONJ', 'PRON', 'PHRASE', 'OTHER'
    );


CREATE TABLE picture
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    url  VARCHAR(1024)
);

CREATE TABLE history
(
    id                BIGSERIAL PRIMARY KEY,
    first_record_time TIMESTAMP   NOT NULL,
    query_times       TIMESTAMP[] NOT NULL,
    last_query_time   TIMESTAMP   NOT NULL
);


CREATE TABLE property
(
    id       BIGSERIAL PRIMARY KEY,
    language language_enum NOT NULL,
    note     TEXT,
    tags     TEXT[]
);


CREATE TABLE explanation
(
    id               BIGSERIAL PRIMARY KEY,
    property_id      BIGINT              NOT NULL REFERENCES property (id) ON DELETE CASCADE,
    part_of_speech   part_of_speech_enum NOT NULL,
    meaning          TEXT                NOT NULL,
    example_sentence TEXT
);


CREATE TABLE vocabulary
(
    id          BIGSERIAL PRIMARY KEY,
    word        VARCHAR(255) UNIQUE NOT NULL,
    property_id BIGINT              NOT NULL UNIQUE REFERENCES property (id) ON DELETE CASCADE,
    history_id  BIGINT              NOT NULL UNIQUE REFERENCES history (id) ON DELETE CASCADE,
    location    VARCHAR(255),
    picture_id  BIGINT              REFERENCES picture (id) ON DELETE SET NULL
);
