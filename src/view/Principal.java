package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		TelefoneController tCont = new TelefoneController();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada:\n1 - Inserir número de telefone\n2 - Consultar Ligações\n9 - Sair"));
			switch (opc) {
			case 1:
				String numeroTel = JOptionPane.showInputDialog("Insira o número:");
				tCont.insereLigacao(f, numeroTel);
				break;
			case 2:
				tCont.consultaLigacoes(f);
				break;
			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Digite novamente");
			}
		}

	}

}
