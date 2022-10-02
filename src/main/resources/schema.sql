create table issues(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    summary VARCHAR(256) NOT NULL,
    description VARCHAR(256) NOT NULL
);

-- 作成日時カラム追加
ALTER TABLE issues ADD create_datetime datetime NOT NULL;