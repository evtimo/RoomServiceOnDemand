# RoomServiceOnDemand

### Pre-request
1. Install Git
2. Install PostgreSQL (<a href="http://postgresguide.com/setup/install.html"> instructions </a>)
3. Install Java 8
4. Install Maven (<a href="https://maven.apache.org/install.html"> instructions </a>)
5. Install IntelliJ IDEA
6. Create database (instruction below)

### Database creation
Database properties are stored in `/src/main/resources/application.properties` file </br>
More detailed instructions hot to create database in PostgreSQL your can find here: <a href="https://www.microfocus.com/documentation/idol/IDOL_12_0/MediaServer/Guides/html/English/Content/Getting_Started/Configure/_TRN_Set_up_PostgreSQL.htm"> Windows </a> / <a href="https://www.digitalocean.com/community/tutorials/postgresql-ubuntu-16-04-ru"> Linux </a>

Create database by command in terminal `sudo -u postgres createdb innoroomservice`

If you don't know the password of your *postgres* user, do the following:
1. Open `psql` tool in your terminal from default postgres user 
2. Execute command `\password postgres`
3. Type password "admin"


## Building the project  

### IntelliJ IDEA building
1. Clone repo `git clone https://github.com/SeregaKuznetsov/RoomServiceOnDemand.git`
2. Open IntelliJ IDEA
3. Choose Import project from existing sources
4. Choose Import project from external mode - Maven or just choose pom.xml file
5. Confirm all the next stages
6. After all dependencies are imported, open Run -> Edit configuration
7. Add Spring Boot configuration
8. Choose available Main class from list
9. If your password for *postgres* user is not "admin", change it in file  `/src/main/resources/application.properties` in field `spring.datasource.password`
10. Run the created configuration


## Run Application

- To use application open URL in browser: localhost:8080
- To use ordinary user features you need create new account by Sign Up and then Sing In
- To use admin panel features you need to create new user account by Sign Up and than manually change the `role` atribute in `users` table of database for created user to `ADMIN`
