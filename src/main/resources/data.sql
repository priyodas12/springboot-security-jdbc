INSERT INTO users(username,password,enabled)
values ('prod','pass123',true);

INSERT INTO users(username,password,enabled)
values ('dev','pass123',true);

INSERT INTO users(username,password,enabled)
values ('test','pass123',true);

INSERT INTO authorities(username,authority)
values ('prod','ROLE_PROD');

INSERT INTO authorities(username,authority)
values ('dev','ROLE_DEV');

INSERT INTO authorities(username,authority)
values ('test','ROLE_DEV');