package Model;

import java.time.LocalDateTime;

public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private LocalDateTime data;

    private String descricao;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime data, String descricao) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Consulta{" +
                "medico=" + medico +
                ", paciente=" + paciente +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
