<h1 align="center" style="font-weight: bold;">API DE FILMES</h1>

<p align="center">
 <a href="#funcionalidades">Funcionalidades</a> • 
 <a href="#started">Rodando API</a> • 
 <a href="#routes">API Endpoints</a> •
  <a href="#errors">Possíveis Respostas de Erro</a> 
 
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
git clone https://github.com/seu-usuario/API-FILMES.git
```


<h3>Iniciando</h3>

```bash
cd API-FILMES
```
- Abra o projeto no IntelliJ IDEA ou IDE de sua preferência

  
<h4>⚠️ Aviso Importante (para usuários do IntelliJ) </h4>
<h5>Após clonar ou baixar o projeto, **certifique-se de que ele está configurado como Maven Project**:</h5>
• Verifique se o arquivo `pom.xml` está marcado como Maven.
• Caso não esteja, clique com o botão direito no `pom.xml` → "Add as Maven Project".


<h3>Rode a aplicação</h3>
<h4>Localize a classe principal: </h4>

```bash
src/main/java/com/seuusuario/wilflix/WilflixApplication.java

```
- Clique no botão Run ▶️ no IntelliJ.



<h3>Acesse a API</h3>
Depois que a aplicação iniciar, ela ficará disponível em:

```bash
http://localhost:8080

```

<h3>Testar os endpoints</h3>
<h4>Você pode usar o Postman, Insomnia ou até o comando curl.</h4>


<h4>Exemplo para cadastrar um filme: </h4>

```bash
curl -X POST http://localhost:8080/filmes \
-H "Content-Type: application/json" \
-d '{"nome":"Matrix","descricao":"Um hacker descobre a verdade sobre a Matrix.","avaliacao":4.7}'

```

<br/>
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
<br/>
<h3 id="get-auth-detail">GET /filmes</h3>

**RESPONSE**
```json
{
  "id": "4fe7abfd-1cab-4f4c-b046-6b521879a836",
  "nome": "O Senhor dos Anéis",
  "descricao": "Um épico de fantasia baseado na obra de J.R.R. Tolkien.",
  "avaliacao": 4.8
},
{
  "id": "eec455d7-e311-4070-9136-040f83bfaafe",
  "nome": "MIB- Homens de Preto",
  "descricao": "uma agência secreta governamental chamada MIB cuida de fiscalizar os alienígenas que já vivem na Terra.",
  "avaliacao": 4.0
}
```
<br/>
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

<br/>
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
<br/>
<h3 id="get-auth-detail">DELETE /filmes/id</h3>

**RESPONSE (200 OK)**
```json
"Filme deletado com sucesso!"
```


<h2 id="errors">⚠️ Possíveis Respostas de Erro</h2>


<h3>400 BAD REQUEST</h3>

- Quando os dados enviados não atendem às validações.
- Exemplo: avaliação maior que 5 ou campo obrigatório vazio.

 ```json
{
  "errors": [
    "A avaliação deve ser menor ou igual a 5",
    "O campo 'nome' é obrigatório"
  ]
}
```

<h3>404 NOT FOUND</h3>

- Quando o ID informado não existe no banco de dados.

 ```json
"Filme não encontrado"
```



