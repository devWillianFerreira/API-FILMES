<h1 align="center" style="font-weight: bold;">API DE FILMES</h1>

<p align="center">
 <a href="#funcionalidades">Funcionalidades</a> • 
 <a href="#started">Rodando API</a> • 
  <a href="#routes">API Endpoints</a> •
</p>

<p align="center">
    <b>WilFLIX é uma API para gerenciar filmes, garantindo que os dados enviados sejam válidos e que a avaliação esteja entre 0 e 5.</b>
</p>

<h2 id="funcionalidades">💻 Funcionalidades</h2>

- Cadastrar Produto
- Atualizar Produto
- Listar Produtos
- Buscar por id
- Deletar

<h2 id="started">🚀 Getting started</h2>

Here you describe how to run your project locally

<h3>Prerequisites</h3>

Here you list all prerequisites necessary for running your project. For example:

- [NodeJS](https://github.com/)
- [Git 2](https://github.com)

<h3>Cloning</h3>

How to clone your project

```bash
git clone your-project-url-in-github
```

<h3>Config .env variables</h2>

Use the `.env.example` as reference to create your configuration file `.env` with your AWS Credentials

```yaml
NODE_AWS_REGION=us-east-1
NODE_AWS_KEY_ID={YOUR_AWS_KEY_ID}
NODE_AWS_SECRET={YOUR_AWS_SECRET}
```

<h3>Starting</h3>

How to start your project

```bash
cd project-name
npm some-command-to-run
```

<h2 id="routes">📍 API Endpoints</h2>

​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /filmes</kbd>         | Permite adicionar um novo filme ao catálogo.
| <kbd>GET /filmes</kbd>          | Retorna todos os filmes cadastrados.
| <kbd>GET /filmes/{id}</kbd>     | Retorna um filme específico pelo seu ID.
| <kbd>PUT /filmes/{id}</kbd>     | Permite atualizar os dados de um filme existente.
| <kbd>DELETE /filmes/{id}</kbd>  | Remove um filme do catálogo pelo ID.

<h3 id="get-auth-detail">GET /authenticate</h3>

**RESPONSE**
```json
{
  "name": "Fernanda Kipper",
  "age": 20,
  "email": "her-email@gmail.com"
}
```

<h3 id="post-auth-detail">POST /authenticate</h3>

**REQUEST**
```json
{
  "username": "fernandakipper",
  "password": "4444444"
}
```

**RESPONSE**
```json
{
  "token": "OwoMRHsaQwyAgVoc3OXmL1JhMVUYXGGBbCTK0GBgiYitwQwjf0gVoBmkbuyy0pSi"
}
```



