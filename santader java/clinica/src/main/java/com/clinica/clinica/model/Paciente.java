package com.clinica.clinica.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    public Paciente(Long id, String nome, int idade, List<Consulta> consultas) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.consultas = consultas;
    }

    public Paciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
