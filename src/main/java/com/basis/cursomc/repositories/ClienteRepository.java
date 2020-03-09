package com.basis.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basis.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
