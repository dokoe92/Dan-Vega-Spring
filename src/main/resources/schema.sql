CREATE TABLE IF NOT EXISTS Content (
    id integer AUTO_INCREMENT,
    title varchar(255)  NOT NULL,
    description text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url varchar(255),
    primary key (id)
);

INSERT INTO Content(title, description, status, content_type, date_created)
VALUES ('My Spring Data Blog Post', 'A post about spring data', 'IDEA', 'ARTICLE', CURRENT_TIMESTAMP);

