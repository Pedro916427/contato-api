package br.com.lampiao.contatosapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {}

