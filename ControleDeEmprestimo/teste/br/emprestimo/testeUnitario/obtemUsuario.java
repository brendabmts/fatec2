package br.emprestimo.testeUnitario;

import br.emprestimo.modelo.Usuario;

public class obtemUsuario {
	public static Usuario comDadosValidos(){
		Usuario usuario = new Usuario();
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
		return usuario;
	}

}
