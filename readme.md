Hello

Steps for docker
Check Docker version:
docker --version

Check Docker system information:
docker info

List all Docker images on the local system:
docker images

Search for an image in Docker Hub:
docker search <image_name>

Pull an image from Docker Hub:
docker pull <image_name>

Build an image from a Dockerfile:
docker build -t <image_name>:<tag> .

Tag an image (for versioning or renaming):
docker tag <image_id> <repository_name>:<tag>

Remove an image:
docker rmi <image_name>

List all running containers:
docker ps

List all containers (including stopped ones):
docker ps -a

Run a container from an image:
docker run -d -p <host_port>:<container_port> <image_name>

Run a container in interactive mode:
docker run -it <image_name> /bin/bash

Stop a running container:
docker stop <container_id>

Start a stopped container:
docker start <container_id>

Restart a running container:
docker restart <container_id>

Remove a stopped container:
docker rm <container_id>

Remove all stopped containers:
docker container prune

View container logs:
docker logs <container_id>

Execute a command inside a running container:
docker exec -it <container_id> <command>

Copy files from container to host:
docker cp <container_id>:/path_in_container /path_on_host

Copy files from host to container:
docker cp /path_on_host <container_id>:/path_in_container

View the container's stats (resource usage):
docker stats

Display Docker container processes (similar to top command):
docker top <container_id>

List Docker volumes:
docker volume ls

Remove a Docker volume:
docker volume rm <volume_name>

Run a container and remove it once it's stopped:
docker run --rm <image_name>

View network details of Docker:
docker network ls

Create a Docker network:
docker network create <netwo













************* to create docker web application 

Dockerfile code =>
# Use an official Node.js runtime as the base image
FROM node:14-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the package.json and package-lock.json to the working directory
COPY package*.json ./

# Install Node.js dependencies
RUN npm install

# Copy the rest of the application code to the container
COPY . .

# Expose port 3000 for the application
EXPOSE 3000

# Define the command to run the application
CMD ["node", "app.js"]


2) app.js
   const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Hello, Docker!');
});

app.get('/hello', (req, res) => {
    res.send('Hello, World!');
});

app.get('/docker', (req, res) => {
    res.send('This is a Dockerized Express.js application!');
});

app.listen(3000, () => {
    console.log(`App running on port 4000`);
});
