package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC06CadastrarLivro {
	public static Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test(expected=RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		livro.setIsbn(null);
	}
	@Test
	public void CT03UC06CadastrarLivro_obtem_isbn_valido() {
		livro.setIsbn("121221");
		assertEquals("121221",livro.getIsbn());
	}
	
}
