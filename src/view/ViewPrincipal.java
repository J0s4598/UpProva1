package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//Atributo
	private String opcao;
	
	//Metodo para exibir a lista de opcoes
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma op��o\n" + 
				"1 - Pesquisar cliente\n" + 
				"2 - Sair\n");
		return this.opcao;
	}

}
