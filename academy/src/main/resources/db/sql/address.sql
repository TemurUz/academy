create table address (
      id bigserial primary key,
      region_id bigint,
      district_id bigint,
      description text
);