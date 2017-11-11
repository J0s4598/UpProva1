package control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewPrincipal;

public class ControlPrincipal {
	//Atributos
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControlPesquisarClient cpc;
	
	//Metodo construtor
	public ControlPrincipal(){
		//Instanciar o objeto BDSimulado
		this.bds = new BDSimulado();
		//Instanciar o ViewPrincipal
		this.vp = new ViewPrincipal();
		//Criar controles
		this.cpc = new ControlPesquisarClient(bds);
		
		//Exibir a janela de opcao pela primeira vez
		trataropcao(this.vp.getOpcao());
	}
	//Metodo para tratar opcao de cliente
	public void trataropcao(String opcao){
		while(true){
			switch(opcao){
			case "1": this.cpc.pesquisarCliente();
						break;
			case "2": JOptionPane.showMessageDialog(null, "Até breve!");
			return;
			
			default: JOptionPane.showMessageDialog(null, "Opcão invalida,Digitar valor valido!");
						break;
		}
		//Exibir a janela de opcoes
		opcao = this.vp.getOpcao();
	}

}
}