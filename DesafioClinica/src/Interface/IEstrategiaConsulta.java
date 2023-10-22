package Interface;

import Model.Medico;
import Model.Paciente;

import java.time.LocalDateTime;

public interface IEstrategiaConsulta {
    void agendarConsulta(Medico medico, Paciente paciente, LocalDateTime data, String descricao);
}
