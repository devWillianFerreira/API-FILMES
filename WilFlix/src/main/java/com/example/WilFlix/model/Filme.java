package com.example.WilFlix.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "filmes")
public class Filme {
    @Id
    @Column(name = "id")
    private String id;

    @NotNull
    @Column(name = "nome")
    @NotBlank(message = "O nome é obrigatória")
    private String nome;

    @NotNull
    @Column(name = "descricao")
    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;

    @NotNull
    @Column(name = "avaliacao")
    @DecimalMin(value = "0.0", inclusive = true, message = "A nota mínima é 0.0")
    @DecimalMax(value = "5.0", inclusive = true, message = "A nota máxima é 5.0")
    private Double avaliacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
