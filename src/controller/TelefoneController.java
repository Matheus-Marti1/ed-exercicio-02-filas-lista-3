package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;

public class TelefoneController {

	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public void consultaLigacoes(Fila f) {
		try {
			f.list();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

}
