package com.fiap.rm344474.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.rm344474.trabalho.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findAll();
}
