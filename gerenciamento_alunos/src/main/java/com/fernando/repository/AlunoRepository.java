package com.fernando.repository;

import com.fernando.model.Aluno;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fernando.repository.AlunoRepository;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query("SELECT a FROM Aluno a WHERE a.status = 'ATIVO' ")
    public List<Aluno> findByStatusAtivo();

    @Query("SELECT i FROM Aluno i WHERE i.status = 'INATIVO' ")
    public List<Aluno> findByStatusInativo();

    public List<Aluno> findByNomeContainingIgnoreCase(String nome);

}