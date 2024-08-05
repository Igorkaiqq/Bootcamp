package com.clinica.clinica.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Medico medico;

    @ManyToOne(cascade = CascadeType.ALL)
    private Paciente paciente;

    private LocalDateTime data;
    private String descricao;

    public Consulta(Long id, Medico medico, Paciente paciente, LocalDateTime data, String descricao) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.descricao = descricao;
    }

    public Consulta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
