package br.emprestimo.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private String dataEmprestimo;
	private String dataDevolucao;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		if (livro == null) {
			throw new RuntimeException("Livro invalido");
		}
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		if (usuario == null) {
			throw new RuntimeException("Usuario invalido");
		}
		this.usuario = usuario;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		if(validaData(dataEmprestimo))
		this.dataEmprestimo = dataEmprestimo;
		else
			throw new RuntimeException("Data invalida");
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataD) {
		if(validaData(dataD))
		this.dataDevolucao = dataD;
		else
			throw new RuntimeException("Data invalida");
	}

	/**
	 * * valida o formato da data * @param data no formato dd/MM/yyyy * @return true
	 * se a data estiver no formato valido e false para formato invalido
	 */
	public boolean validaCalendario(String data){
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		df.setLenient(false);//mantem rigor em relacao a precisao
		try{
			df.parse(data); //data valida
			return true;
		} catch (ParseException ex){
			return false;
		}
	}
		
		public boolean validaData(String data) {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/YYYY");
		boolean isValida= false; //
		if(validaCalendario(data)){
			DateTime umaData = fmt.parseDateTime(data);
			if(umaData.dayOfWeek().getAsText() != "Domingo")
				isValida = true;
		}
			
		}
}
