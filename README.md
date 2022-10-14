# Updated 14/10/2022
## What's new
1. simple html pages
2. user session and logs when succeefully login
3. redirection when successfully login
4. automaticlly logout and redirect when expire login duration
5. basic password validate
6. new user status and columns
7. input space is banned now
# Record 7/10/2022
## Finished
1. fixed path error
2. add new login record table and related work
3. reply json objects to postman
4. add different branches of signup/login
5. chang password api done
# Record 6/10/2022
1. database connection
2. very basic login check
3. very basic signup
4. duplicated username restriction
## Mysql creation query:
> create table User_main(uid int not null AUTO_INCREMENT primary key, username varchar(255) not null unique, active boolean, active_code int);  
> create table User_password(uid int not null primary key, password varchar(255) not null);  
> create table User_login(login_id int not null auto_increment primary key, uid int, ip_address varchar(255), timestamp timestamp, active boolean);  





