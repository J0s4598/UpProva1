package model;

import java.time.LocalDate;

public class Cliente {
	//Atributo
		private String nome;
		private String CPF;
		private LocalDate dataDeNascimento;
		private String numeroDeTelefone;
		private String cidade;
		private String UF;
		
		//Construtor
		public Cliente(String nome, String cPF, LocalDate dataDeNascimento, String numeroDeTelefone, String cidade,
				String uF) {
			super();
			this.nome = nome;
			CPF = cPF;
			this.dataDeNascimento = dataDeNascimento;
			this.numeroDeTelefone = numeroDeTelefone;
			this.cidade = cidade;
			UF = uF;
		}
		

		//Get e Set
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public LocalDate getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}

		public String getNumeroDeTelefone() {
			return numeroDeTelefone;
		}

		public void setNumeroDeTelefone(String numeroDeTelefone) {
			this.numeroDeTelefone = numeroDeTelefone;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getUF() {
			return UF;
		}

		public void setUF(String uF) {
			UF = uF;
		}
		
		//Metodo ToString
		public String toString(){
			return "Nome: " + this.nome + "\n" + 
					"CPF: " + this.CPF + "\n" + 
					"Data de nascimento: " + this.dataDeNascimento + "\n" + 
					"Numero de telefone: " + this.numeroDeTelefone + "\n" + 
					"Cidade: " + this.cidade + "\n" + 
					"UF: " + this.UF + "\n";
		}


}
