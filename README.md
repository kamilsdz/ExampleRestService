## Setup
### Without docker:
* `brew tap AdoptOpenJDK/openjdk`
* `brew cask install adoptopenjdk14`

`./mvnw spring-boot:run`

### With docker:
* `docker-compose build`
* `docker-compose up`

## Tests:
### Without docker:
`./mvnw test`

### With docker:
`docker-compose run app ./mvnw test`

## Usage:
Health endpoint: `localhost:8080/health`

## To do:
* Hot-Reload - now we have to run `./mvnw compile` in the second tab
