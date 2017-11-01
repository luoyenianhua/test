CREATE TABLE  userinfo  (
   userId  number(11) NOT NULL primary key,
   userName  varchar2(100) NOT NULL unique,
   pwd  varchar2(50) NOT NULL,
   dept varchar2(50)  NOT NULL
   
) ;

insert into  userinfo  ( userId , userName , pwd , dept  )
values (seq_userinfo.nextval,'张三','0000','市场部');
insert into  userinfo  ( userId , userName , pwd , dept )
values(seq_userinfo.nextval,'李四','0000','研发部');

