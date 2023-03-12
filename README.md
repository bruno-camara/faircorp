# Faircorp
Backend developed in Spring (Java) for the Web Programming course at École des Mines de Saint-Étienne

## Specifications
The application manages a Building. There are 4 main classes:
- Building
- Rooms
- Heaters
- Windows

Each class has its own methods and properties.

## Security
To access all the functionalities:
- Username: admin
- Password: myPassword

To regular users:
- Username: user
- Password: myPassword

## Deploy
The application is deployed using a cloud service called Clever Cloud.

The following link leads to the app: https://faircorp-bruno-camara.cleverapps.io

### Local deployment
You can also run it locally using Docker with following commands:
```bash
docker build --build-arg JAR_FILE=build/libs/faircorp-0.0.1-SNAPSHOT.jar -t springio/gs-spring-boot-docker .

docker run -p 8080:8080 springio/gs-spring-boot-docker
```

## API Structure
To check the API structure, click on the following link:
https://faircorp-bruno-camara.cleverapps.io/swagger-ui/index.html#/
