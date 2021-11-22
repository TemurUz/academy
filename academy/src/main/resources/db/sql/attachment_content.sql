create table attachment_content (
      id bigserial primary key,
      value bytea,
      attachment_id bigint
);