import Model.Clinica;
import Model.Consulta;
import Model.Medico;
import Model.Paciente;

import java.time.LocalDateTime;

public class AgendamentoOrdemChegada {
    public void agendarConsulta(Medico medico, Paciente paciente, LocalDateTime data, String descricao) {
        Consulta consulta = new Consulta(medico, paciente, data, descricao);
        Clinica.getInstancia().adicionarConsulta(consulta);
        System.out.println("Consulta agendada por ordem de chegada.");
    }
}
