package com.clinica.clinica.repository;

import com.clinica.clinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    // Você pode adicionar consultas personalizadas aqui se necessário
}