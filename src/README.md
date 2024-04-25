# DOCKER DB INSTALLATION
run this string on terminal
**docker run --name ptDatabase1 -e "SA_PASSWORD=MyPassword123!" -e "ACCEPT_EULA=Y" -p 1433:1433 -d mcr.microsoft.com/mssql/server**
after that use a DBMS and run this sql query: CREATE DATABASE ptDatabase1;