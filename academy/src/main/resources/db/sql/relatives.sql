create table relatives (
      id bigserial primary key,
      name varchar(30),
      surname varchar(30),
      lastname varchar(30),
      address_id bigint,
      phone_number varchar(20),
      invalid_id bigint,
      relatives_type_id bigint,
      benefit_id bigint
);