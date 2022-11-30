package com.example.apiFoodTuck.apiJava.repository;

import com.example.apiFoodTuck.apiJava.Model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

    Optional<Object> findAll(Integer codigo);
}
