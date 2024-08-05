package com.clinica.clinica.repository;

import com.clinica.clinica.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    // Você pode adicionar consultas personalizadas aqui se necessário
}