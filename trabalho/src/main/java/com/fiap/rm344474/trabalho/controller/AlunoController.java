package com.fiap.rm344474.trabalho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.rm344474.trabalho.model.Aluno;
import com.fiap.rm344474.trabalho.repository.AlunoRepository;



@RestController
public class AlunoController {
    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @PostMapping("/alunos")
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    @DeleteMapping("/alunos/{id}")
    public void excluirAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }

    /**
     * @return
     */
    @GetMapping("/alunos")
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

}
