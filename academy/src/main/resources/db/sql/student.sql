create table student (
    id bigserial primary key,
    name varchar(30),
    surname varchar(30),
    lastname varchar(30),
    birth_date date,
    address_id bigint,
    temporal_address_id bigint,
    family_status_id bigint,
    phone_number varchar(15),
    education_id bigint,
    gender_id bigint,
    nationality_id bigint,
    telegram_phone_number varchar(20),
    passport_data varchar(20),
    relatives_id bigint,
    creative_potential_id bigint,
    rating_status_id bigint
    );