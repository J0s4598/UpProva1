package view;

import javax.swing.JOptionPane;

public class ViewSolicitarNome {
	//Atributos
	private String nome;
	
	public ViewSolicitarNome(){
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
	}

	public String getNome() {
		return nome;
	}
	

}
