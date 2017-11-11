package control;

import javax.sound.midi.ControllerEventListener;

import model.BDSimulado;
import model.Cliente;
import view.ViewExibirCliente;
import view.ViewSolicitarNome;

public class ControlPesquisarClient {
	//Atributos
	private BDSimulado bds;
	
	public ControlPesquisarClient(BDSimulado bds){
		//Guardar BDSimulado
		this.bds = bds;
	}
	
	//Metodo que exibi todos os Usuario
	public void pesquisarCliente(){
		
		//Criar View para solicitar o nome
		ViewSolicitarNome vsn = new ViewSolicitarNome();
		
		//Recuperando o nome digitado pelo usuario
		String nome = vsn.getNome();
		
		//Retornar dados de client de acordo com o nome
		Cliente clt = bds.getClientePorNome(nome);
		
		//Exibir os dados do cliente
		ViewExibirCliente vec = new ViewExibirCliente(clt);
	}
}