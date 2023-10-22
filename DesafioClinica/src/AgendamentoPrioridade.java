import Model.Clinica;
import Model.Consulta;
import Model.Medico;
import Model.Paciente;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgendamentoPrioridade {

    public void agendarConsulta(Medico medico, Paciente paciente, LocalDateTime data, String descricao) {
        Clinica clinica = Clinica.getInstancia();

        Consulta novaConsulta = new Consulta(medico, paciente, data, descricao);
        clinica.adicionarConsulta(novaConsulta);
        reordenarConsultasPorIdade();
        System.out.println("Consulta agendada com prioridade para " + paciente.getNome());
    }

    public void reordenarConsultasPorIdade() {
        Clinica clinica = Clinica.getInstancia();
        List<Consulta> consultas = clinica.getConsultas();

        List<Consulta> consultasMaisVelhas = new java.util.ArrayList<>();
        List<Consulta> consultasMenosVelhas = new java.util.ArrayList<>();

        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getIdade() >= 60) {
                consultasMaisVelhas.add(consulta);
            } else {
                consultasMenosVelhas.add(consulta);
            }
        }

        consultas.clear();

        consultasMaisVelhas.sort(Comparator.comparing(consulta -> consulta.getPaciente().getIdade(), Collections.reverseOrder()));

        consultas.addAll(consultasMaisVelhas);
        
        consultas.addAll(consultasMenosVelhas);
    }
}
