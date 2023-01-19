package com.estudo.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserRestController {

    // calculo de individual e company
    // inserir a PF e PJ e gravar no banco de dados
    // recuperar os users inseridos e seus calculos
    // alterar dados do usuário
    @GetMapping
    //GET - Recupera os recursos
    ResponseEntity<String> getUsers(){
        return ResponseEntity.ok("Walker - Estudos");
    }

    @PostMapping
    //POST - Inserção de algum recurso (Exemplo: Inserir novo Usuario)
    ResponseEntity<String> userCreate(@RequestBody UsuarioDto user){

        //service que orquestra a inserção, faz interface com o repositorio database

        return ResponseEntity.ok(user.getNome());
    }

    @PutMapping
    //PUT - Atualiza o seu recurso (Exemplo atualizar os dados de um usuário)

    @PatchMapping
    //PATCH - Atualiza uma propriedade específica do seu recurso (Exemplo, você podem ter 10 campos e precisa atualizar somente um)

    @DeleteMapping
    //DELET - Exclui um recurso


}
