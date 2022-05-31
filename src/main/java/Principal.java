

import javax.swing.JOptionPane;

import calculadora.Calculadora;


public class Principal {
	public static void main(String[] args) {
		String opcao = "";
		
		Calculadora calculadora = new Calculadora();
		while(!opcao.equals("9")) {
			opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração \n 4 - produto \n5 - Divisão \n9 - Sair");
			
			switch (Integer.parseInt(opcao)) {
			case 1:
				calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a")));
				calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor b")));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Subtracao: " + calculadora.getSubtracao());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
				break;	
			case 5:
				JOptionPane.showMessageDialog(null, "Subtracao: " + calculadora.getDivisao());
				break;	
			default:
				break;
			}
		}
	}
	

}
