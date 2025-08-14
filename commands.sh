#[+] for build the image  
sudo docker compose up --build

#[+] for run the container in interactive mode :
sudo docker compose run --rm --service-ports techleef-service bash


docker compose build --no-cache
docker compose run --rm --user $(id -u):$(id -g) techleef-service bash