package com.example.buildflow.controller;

import org.springframework.web.bind.annotation.*;
import com.example.buildflow.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<>();

    // LISTAR USUÁRIOS
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // CRIAR USUÁRIO
    @PostMapping
    public String criarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return "Usuário criado com sucesso!";
    }

    // ATUALIZAR USUÁRIO
    @PutMapping("/{id}")
    public String atualizarUsuario(@PathVariable int id,
                                   @RequestBody Usuario usuarioAtualizado) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {

                usuario.setNome(usuarioAtualizado.getNome());
                usuario.setEmail(usuarioAtualizado.getEmail());

                return "Usuário atualizado!";
            }
        }

        return "Usuário não encontrado!";
    }

    // DELETAR USUÁRIO
    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                return "Usuário deletado!";
            }
        }

        return "Usuário não encontrado!";
    }
}