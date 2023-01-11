create table if not exists team
(
    team_id  serial primary key,
    team_name varchar not null
);

create table if not exists player
(
    player_id serial primary key,
    player_name varchar not null,
    number  int  not null,
    team_id int  not null,
    constraint fk_team foreign key (team_id) references team (team_id)
);

create table if not exists sponsor
(
    sponsor_id  serial primary key,
    sponsor_name varchar not null
);

create table if not exists have
(
    id      serial
        constraint have_sponsor_pk primary key,
    team_id_sponsored    int not null,
    constraint fk_have_sponsor_team foreign key (team_id_sponsored) references team (team_id),
    sponsor_id int not null,
    constraint fk_have_sponsor_sponsor foreign key (sponsor_id) references sponsor (sponsor_id)
);

create table if not exists play_against
(
    id          serial
        constraint play_against_pk primary key,
    datetime    date    not null,
    stadium     varchar not null,
    team_one     int     not null,
    constraint fk_tone foreign key (team_one) references team (team_id),
    team_two int     not null,
    constraint fk_two foreign key (team_two) references team (team_id)
);

create table if not exists goal (
    match_id serial primary key,
    scored int not null,
    constraint fk_scored foreign key (scored) references  player (player_id),
    isAgainstOwn boolean not null,
    minute int check(minute between 0 and 90)
);

alter table player add column is_goalkeeper boolean;