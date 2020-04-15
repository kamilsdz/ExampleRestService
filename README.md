## Setup
### Without docker:
* `brew tap AdoptOpenJDK/openjdk`
* `brew cask install adoptopenjdk14`

`./mvnw spring-boot:run`

### With docker:
* `docker-compose build`
* `docker-compose up`

## Usage:
Health endpoint: `localhost:8080/health`

