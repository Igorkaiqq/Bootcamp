package com.clinica.clinica.repository;

import com.clinica.clinica.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    // Você pode adicionar consultas personalizadas aqui se necessário
}
