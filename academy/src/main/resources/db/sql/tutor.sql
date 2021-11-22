create table tutor (
                         id bigserial primary key,
                         surname varchar(30),
                         name varchar(30),
                         lastname varchar(30),
                         birth_date date,
                         address_id bigint,
                         temporal_address_id bigint,
                         phone_number varchar(15),
                         education_id bigint,
                         gender_id bigint,
                         nationality_id bigint,
                         passport_data varchar(20),
                         experience int,
                         group_id bigint,
                         attachment_id bigint
);