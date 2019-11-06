# RoomServiceOnDemand

## Building the project  

### Manual building (default props)
1. In terminal, execute: mvnw clean package (Build and package jar file)  
   The resulting jar: target/roomserviceondemand-0.0.1-SNAPSHOT.jar
1. Run the project: java -jar target/roomserviceondemand-0.0.1-SNAPSHOT.jar

### IntelliJ IDEA
1. Clone repo
1. Open IntelliJ IDEA
1. Choose import project from existing sources
1. Choose maven build system
1. Choose pom.xml file
1. After dependencies import, open run->edit configuration
1. Add Spring Boot configuration
1. Run the created configuration

### Database
Project uses PostgreSQL DBMS  
You can find database properties in application.properties file 

### Application properties

spring.datasource.url // database connection url  
spring.datasource.username // database user  
spring.datasource.password // database user paasword  

### Application
Open URL in browser: localhost:8080/ (default)
