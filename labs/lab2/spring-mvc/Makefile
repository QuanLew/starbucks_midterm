clean:
	gradle clean

compile:
	mvn compile

run:
	mvn spring-boot:run

build:
	mvn packagejar

run-jar:
	java -jar target/spring-mvc-1.0.jar

# Docker

docker-clean:
	docker rm spring-mvc-docker-runfile

#build a docker image named spring-mvc-docker (Add Dockerfile run same time, check path & name of java -jar target/spring-mvc-1.0.jar)
docker-build: build
	docker build --platform=linux/amd64 -t spring-mvc-docker .
	docker images

#build a container or multiple container, use a image 
docker-run: docker-build
	docker run --name spring-mvc-docker-runfile --platform=linux/amd64 -td -p 81:8080 spring-mvc-docker	
	docker ps

docker-clean:
	docker stop spring-demo
	docker rm spring-demo
	docker rmi spring-demo

#check a java file which is lib named .jar if exist in container(token) -> srv.
docker-shell:
	docker exec -it spring-mvc-docker-runfile bash 