# Basic Spring Feign Client Application

(Spring Boot + Spring Data JPA + Spring Cloud Feign Client) Basic Spring Boot Feign Client Application

## Profiles
* dev

## Prepare DB
```
docker pull mysql
docker run --name=mysql -d -p 3306:3306 -e "MYSQL_ROOT_PASSWORD=root" -e "MYSQL_DATABASE=main" -e "MYSQL_USER=test" -e "MYSQL_PASSWORD=test" mysql:latest
```

## Build
```
mvn clean install
```

## Usage
```
java -jar basic-spring-feign-client.jar
```

## Authors - Version 4.0
* Emin İnal
