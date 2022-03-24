package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super.nome = nome;
    super.sobrenome = sobrenome;
  }

  /** Método para pegar o nome e sobrenome do usuário. */
  public String getUsuario() {
    if (super.nome == null
        || super.sobrenome == null
        || super.nome.isEmpty()
        || super.sobrenome.isEmpty()) {
      String invalidUser = "Usuário inválido";
      return invalidUser;
    }
    return super.nome + "." + super.sobrenome;
  }
}
