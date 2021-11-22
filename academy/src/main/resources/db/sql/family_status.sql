create table family_status(
      id bigserial primary key,
      family_condition_id bigint,
      low_income boolean,
      lost_breadwinner_id bigint,
      invalid_id bigint
);