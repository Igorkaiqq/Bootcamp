package com.clinica.clinica.controller;

import com.clinica.clinica.model.Consulta;
import com.clinica.clinica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> buscarConsulta(@PathVariable Long id) {
        Consulta consulta = consultaRepository.findById(id).orElse(null);
        if (consulta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(consulta);
    }

    @PostMapping
    public Consulta criarConsulta(@RequestBody Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Consulta> atualizarConsulta(@PathVariable Long id, @RequestBody Consulta novaConsulta) {
        if (!consultaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        novaConsulta.setId(id);
        Consulta consultaAtualizada = consultaRepository.save(novaConsulta);
        return ResponseEntity.ok(consultaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirConsulta(@PathVariable Long id) {
        if (!consultaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        consultaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
