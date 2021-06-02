**Database Preparation step**

download mysql repo

```
wget http://repo.mysql.com/mysql-apt-config_0.8.17-1_all.deb_
```

install it
```
sudo apt install ./mysql-apt-config_0.8.17-1_all.deb_
```
Install mysql server

```
sudo apt update
sudo apt install mysql-server_
```

Securing mysql installation
```
_sudo mysql_secure_installation_
```
create user and granting privileges

```
CREATE USER 'basoca'@'localhost' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON * . * TO 'basoca'@'localhost';
FLUSH PRIVILEGES;
```

Create database and import the data

```
sudo mysql
mysql> create database basoca;
mysql> exit;
mysql -u basoca -p basoca < dataset.sql_
```

Create a result table
```
CREATE TABLE result (
    No int,
    Provinsi varchar(100),
    KabKota varchar(100),
    Kecamatan varchar(100),
    Desa varchar(100),
    NIK char(11),
    Nama varchar(100),
    PenerimaBansos varchar(5),
    PRIMARY KEY (NIK)
);

ALTER TABLE `result` ADD UNIQUE( `No`);
ALTER TABLE `result` CHANGE `No` `No` INT(11) NULL DEFAULT NULL AUTO_INCREMENT;
```