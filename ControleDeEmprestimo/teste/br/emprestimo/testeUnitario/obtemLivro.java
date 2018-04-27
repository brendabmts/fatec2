package br.emprestimo.testeUnitario;

import br.emprestimo.modelo.Livro;

 class obtemLivro {
	
		public static Livro comDadosValidos(){
			Livro livro = new Livro();
			livro.setIsbn("121212");
			livro.setTitulo("Engenharia de Software");
			livro.setAutor("Sommerville");
			
			return livro;
			
		}
			
			public static Livro comISBNInvalido_branco(){
				Livro livro = new Livro();
				livro.setIsbn("");
				return livro;
			}
			
			public static Livro comISBNInvalido_nulo(){
				Livro livro = new Livro();
				livro.setIsbn(null);
				return livro;
			}
		}
	

