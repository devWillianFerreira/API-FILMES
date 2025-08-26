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

<h2 id="started">🚀 Rodando API</h2>


<h3>Clonando o projeto</h3>


```bash
https://github.com/devWillianFerreira/API-FILMES.git
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


<h3 id="post-auth-detail">POST /filmes</h3>

**REQUEST**
```json
{
  "nome": "O Senhor dos Anéis",
  "descricao": "Um épico de fantasia baseado na obra de J.R.R. Tolkien.",
  "avaliacao": 4.8
}
```

**RESPONSE (201 CREATED)**
```json
"Filme cadastrado com sucesso!"
```

<h3 id="get-auth-detail">GET /filmes</h3>

**RESPONSE**
```json
{
  "id": "4fe7abfd-1cab-4f4c-b046-6b521879a836",
  "nome": "O Senhor dos Anéis",
  "descricao": "Um épico de fantasia baseado na obra de J.R.R. Tolkien.",
  "avaliacao": 4.8
}
```

<h3 id="get-auth-detail">GET /filmes/id</h3>

**RESPONSE (200 OK)**
```json
{
  "id": "4fe7abfd-1cab-4f4c-b046-6b521879a836",
  "nome": "O Senhor dos Anéis",
  "descricao": "Um épico de fantasia baseado na obra de J.R.R. Tolkien.",
  "avaliacao": 4.9
}
```


<h3 id="get-auth-detail">PUT /filmes/id</h3>

**REQUEST**
```json
{
  "id": "4fe7abfd-1cab-4f4c-b046-6b521879a836",
  "nome": "O Senhor dos Anéis",
  "descricao": "Um épico de fantasia baseado na obra de J.R.R. Tolkien.",
  "avaliacao": 4.9
}
```

**RESPONSE (200 OK)**
```json
"Filme atualizado com sucesso!"
```

<h3 id="get-auth-detail">DELETE /filmes/id</h3>

**RESPONSE (200 OK)**
```json
"Filme deletado com sucesso!"
```


