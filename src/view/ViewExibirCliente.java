package view;

import javax.swing.JOptionPane;

import model.Cliente;

public class ViewExibirCliente {
	
	public ViewExibirCliente(Cliente cliente){
		//Verificar se tem cliente para mostra
		if (cliente == null) {
			JOptionPane.showMessageDialog(null, "Cliente não existe!");
		}else{
			//Exibir com JOptionPane
			JOptionPane.showMessageDialog(null, cliente);
		}
	}

}
