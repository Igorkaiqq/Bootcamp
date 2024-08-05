import Model.Clinica;
import Model.Medico;
import Model.Paciente;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Criação de instância da clínica
        Clinica clinica = Clinica.getInstancia();

        // Cadastrar médicos
        Medico medico1 = new Medico("Dr. João", 123, "Cardiologista");
        Medico medico2 = new Medico("Dra. Maria", 1234, "Neurologia");
        Medico medico3 = new Medico("Dr. Carlos", 1, "Ortopedista");

        clinica.adicionarMedico(medico1);
        clinica.adicionarMedico(medico2);
        clinica.adicionarMedico(medico3);

        // Cadastrar pacientes
        Paciente paciente1 = new Paciente("Lucas", 35);
        Paciente paciente2 = new Paciente("Ana", 42);
        Paciente paciente3 = new Paciente("Pedro", 58);
        Paciente paciente4 = new Paciente("Marta", 49);

        clinica.adicionarPaciente(paciente1);
        clinica.adicionarPaciente(paciente2);
        clinica.adicionarPaciente(paciente3);
        clinica.adicionarPaciente(paciente4);

        // Realizar agendamento por ordem de chegada
        AgendamentoOrdemChegada estrategia = new AgendamentoOrdemChegada();

        estrategia.agendarConsulta(medico1, paciente1, LocalDateTime.now(), "Exame de rotina");
        estrategia.agendarConsulta(medico2, paciente2, LocalDateTime.now(), "Dermatologia");
        estrategia.agendarConsulta(medico1, paciente3, LocalDateTime.now(), "Consulta de acompanhamento");
        estrategia.agendarConsulta(medico3, paciente4, LocalDateTime.now(), "Ortopedia");

        // Listar as consultas agendadas
        System.out.println("Consultas Agendadas:");
        clinica.listarConsultas();

        Paciente paciente5 = new Paciente("Maria", 70);
        Paciente paciente6 = new Paciente("João", 65);
        Paciente paciente7 = new Paciente("Carlos", 62);
        Paciente paciente8 = new Paciente("Isabel", 72);

        clinica.adicionarPaciente(paciente5);
        clinica.adicionarPaciente(paciente6);
        clinica.adicionarPaciente(paciente7);
        clinica.adicionarPaciente(paciente8);

        AgendamentoPrioridade prioridade = new AgendamentoPrioridade();

        prioridade.agendarConsulta(medico1, paciente5, LocalDateTime.now(), "Avaliação cardiológica");
        prioridade.agendarConsulta(medico2, paciente6, LocalDateTime.now(), "Neurologia");
        prioridade.agendarConsulta(medico1, paciente7, LocalDateTime.now(), "Avaliação ortopédica");
        prioridade.agendarConsulta(medico3, paciente8, LocalDateTime.now(), "Ortopedia");

        System.out.println("Consultas Agendadas:");
        clinica.listarConsultas();

    }

    }