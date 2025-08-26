package com.example.WilFlix.repository;

import com.example.WilFlix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmesRepository extends JpaRepository<Filme, String> {
    List<Filme> findBynome(String nome);
}
