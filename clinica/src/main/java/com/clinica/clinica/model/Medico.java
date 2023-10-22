package com.clinica.clinica.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int CRM;

    private String especialidade;

    @OneToMany(mappedBy = "medico")
    private List<Consulta> consultas;

    public Medico() {
    }

    public Medico(Long id, String nome, int CRM, String especialidade, List<Consulta> consultas) {
        this.id = id;
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.consultas = consultas;
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

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
