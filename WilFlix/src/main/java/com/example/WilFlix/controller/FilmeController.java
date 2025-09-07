package com.example.WilFlix.controller;

import com.example.WilFlix.model.Filme;
import com.example.WilFlix.repository.FilmesRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.*;


@RestController
@RequestMapping("filmes")
public class FilmeController {

    private FilmesRepository filmesRepository;

    public FilmeController(FilmesRepository filmesRepository) {
        this.filmesRepository= filmesRepository;
    }
    @PostMapping
    public ResponseEntity<String> salvarFilme(@Valid @RequestBody Filme filme){
        String id= UUID.randomUUID().toString();
        filme.setId(id);
        filmesRepository.save(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body("Filme cadastrado com sucesso!");
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarFilmePorId(@PathVariable String id) {
        return filmesRepository.findById(id).<ResponseEntity<Object>>map(filme -> ResponseEntity.ok(filme))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado"));
    }
    @GetMapping
    public ResponseEntity<List<Filme>> listarFilmes() {
        List<Filme> filmes;
        filmes = filmesRepository.findAll();
        return ResponseEntity.ok(filmes);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable("id") String id){
        return filmesRepository.findById(id).map(f->{
            filmesRepository.deleteById(id);
            return ResponseEntity.ok("Filme deletado com sucesso!");
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado"));
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarFilme(@PathVariable("id") String id,@Valid  @RequestBody  Filme filme){
        return filmesRepository.findById(id).map(f->{
            filme.setId(id);
            filmesRepository.save(filme);
            return ResponseEntity.ok("Filme atualizado com sucesso!");
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado"));
    }
}
