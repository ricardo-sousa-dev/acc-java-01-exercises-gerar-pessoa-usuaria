package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {
  String nome;
  String sobrenome;

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  /** Método para pegar o nome e sobrenome do usuário. */
  public String getUsuario() {
    if ((nome == "" || nome == null) || (sobrenome == "" || sobrenome == null)) {
      return "Usuário inválido";
    } else {
      return getNome() + "." + getSobrenome();
    }
  }
}
