package com.example.apiFoodTuck.apiJava.Controller;

import com.example.apiFoodTuck.apiJava.Model.UsuarioModel;
import com.example.apiFoodTuck.apiJava.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioControler {

    @Autowired
    private IUsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") Integer codigo){
        return repository.findAll(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel Salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }


}
