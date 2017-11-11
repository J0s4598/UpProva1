package model;

import java.time.LocalDateTime;

public class Ligacao {
	//Atributo
		private int codigo;
		private String numeroDeTelefoneDestino;
		private LocalDateTime dataEHoraDeInicio;
		private LocalDateTime dataEHoraDeFim;
		private String cidadeDeDestino;
		private String UFDeDestino;
		private Cliente cliente;
		
		//Construtor
		public Ligacao(int codigo, String numeroDeTelefoneDestino, LocalDateTime dataEHoraDeInicio,
				LocalDateTime dataEHoraDeFim, String cidadeDeDestino, String uFDeDestino, Cliente cliente) {
			super();
			this.codigo = codigo;
			this.numeroDeTelefoneDestino = numeroDeTelefoneDestino;
			this.dataEHoraDeInicio = dataEHoraDeInicio;
			this.dataEHoraDeFim = dataEHoraDeFim;
			this.cidadeDeDestino = cidadeDeDestino;
			UFDeDestino = uFDeDestino;
			this.cliente = cliente;
		}
		
		
		@Override
		public String toString() {
			return "Ligacao [codigo: " + codigo + ", numeroDeTelefoneDestino: " + numeroDeTelefoneDestino
					+ ", dataEHoraDeInicio: " + dataEHoraDeInicio + ", dataEHoraDeFim: " + dataEHoraDeFim
					+ ", cidadeDeDestino: " + cidadeDeDestino + ", UFDeDestino: " + UFDeDestino + ", cliente: " + cliente
					+ "]";
		}


		//Get e Set
		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNumeroDeTelefoneDestino() {
			return numeroDeTelefoneDestino;
		}

		public void setNumeroDeTelefoneDestino(String numeroDeTelefoneDestino) {
			this.numeroDeTelefoneDestino = numeroDeTelefoneDestino;
		}

		public LocalDateTime getDataEHoraDeInicio() {
			return dataEHoraDeInicio;
		}

		public void setDataEHoraDeInicio(LocalDateTime dataEHoraDeInicio) {
			this.dataEHoraDeInicio = dataEHoraDeInicio;
		}

		public LocalDateTime getDataEHoraDeFim() {
			return dataEHoraDeFim;
		}

		public void setDataEHoraDeFim(LocalDateTime dataEHoraDeFim) {
			this.dataEHoraDeFim = dataEHoraDeFim;
		}

		public String getCidadeDeDestino() {
			return cidadeDeDestino;
		}

		public void setCidadeDeDestino(String cidadeDeDestino) {
			this.cidadeDeDestino = cidadeDeDestino;
		}

		public String getUFDeDestino() {
			return UFDeDestino;
		}

		public void setUFDeDestino(String uFDeDestino) {
			UFDeDestino = uFDeDestino;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		

}
