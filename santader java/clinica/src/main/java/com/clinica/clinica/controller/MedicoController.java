package com.clinica.clinica.controller;

import com.clinica.clinica.model.Medico;
import com.clinica.clinica.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> buscarMedico(@PathVariable Long id) {
        Medico medico = medicoRepository.findById(id).orElse(null);
        if (medico == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medico);
    }

    @PostMapping
    public Medico criarMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> atualizarMedico(@PathVariable Long id, @RequestBody Medico novoMedico) {
        if (!medicoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        novoMedico.setId(id);
        Medico medicoAtualizado = medicoRepository.save(novoMedico);
        return ResponseEntity.ok(medicoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirMedico(@PathVariable Long id) {
        if (!medicoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        medicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
