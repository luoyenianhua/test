CREATE TABLE  userinfo  (
   userId  number(11) NOT NULL primary key,
   userName  varchar2(100) NOT NULL unique,
   dept varchar2(50)  NOT NULL,
   goTime varchar2(50)  NOT NULL,
   reason varchar2(50)  NOT NULL,
   destination varchar2(50)  NOT NULL,
   backTime varchar2(50)  NOT NULL,
   tel varchar2(50) NOT NULL
) ;


