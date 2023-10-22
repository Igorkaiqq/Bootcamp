package Model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private static Clinica instancia;
    private List<Medico> medicos;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;

    private Clinica() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public static Clinica getInstancia() {
        if (instancia == null) {
            instancia = new Clinica();
        }
        return instancia;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    // Métodos para adicionar médicos, pacientes e consultas
    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Métodos para listar médicos, pacientes e consultas
    public void listarMedicos() {
        for (Medico medico : medicos) {
            System.out.println(medico.getNome() + " - " + medico.getEspecialidade());
        }
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getNome() + " - " + paciente.getIdade());
        }
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println("Médico: " + consulta.getMedico().getNome() +
                    " Paciente: " + consulta.getPaciente().getNome() +
                    " Idade do paciente " + consulta.getPaciente().getIdade() +
                    " Data: " + consulta.getData() +
                    " Descrição: " +consulta.getDescricao());
        }
    }

    // Métodos para atualizar médicos, pacientes e consultas
    public void atualizarMedico(Medico medicoExistente, Medico novoMedico) {
        int index = medicos.indexOf(medicoExistente);
        if (index != -1) {
            medicos.set(index, novoMedico);
        } else {
            System.out.println("Médico não encontrado.");
        }

    }

    public void atualizarPaciente(Paciente pacienteExistente, Paciente novoPaciente) {
        int index = pacientes.indexOf(pacienteExistente);
        if (index != -1) {
            pacientes.set(index, novoPaciente);
        } else {
            System.out.println("Médico não encontrado.");
        }
    }

    public void atualizarConsulta(Consulta consultaExistente, Consulta novaConsulta) {
        int index = consultas.indexOf(consultaExistente);
        if (index != -1) {
            consultas.set(index, novaConsulta);
        } else {
            System.out.println("Médico não encontrado.");
        }
    }

    public void excluirMedico(Medico medico) {
        medicos.remove(medico);
    }

    public void excluirPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void excluirConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public void setConsultas(List<Consulta> consultasMaisVelhas) {
    }
}
