# Desafio Docker - 1
Desafio 1
Crie um programa utilizando sua linguagem de programação favorita que faça uma listagem simples do nome de alguns módulos do curso Full Cycle os trazendo de um banco de dados MySQL. Gere a imagem desse container e a publique no DockerHub.

Gere uma imagem do nginx que seja capaz que receber as solicitações http e encaminhá-las para o container.

Crie um repositório no github com todo o fonte do programa e das imagens geradas.

Crie um arquivo README.md especificando quais comandos precisamos executar para que a aplicação funcione recebendo as solicitações na porta 8888 de nosso computador. Lembrando que NÃO utilizaremos Docker-compose nesse desafio.


docker create network pfa-network

docker run  --name pfa-db --network pfa-network igor86/pfa-db

docker run  --name backend --network pfa-network igor86/pfa-api:1.0

docker run -d -p 8888:80 --network pfa-network igor86/pfa-nginx

Acessar o browser : http://localhost:8888/modulo


# Desafio Docker - 2
docker-compose up 

Acessar o browser : http://localhost:8000/modulo

