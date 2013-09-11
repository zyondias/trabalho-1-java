/*
 * Autor Zyon Dias
 * Ra 2401321
 * Exercio 1
 * Class que deve executa a tela no cliente
 */

import javax.swing.JFrame;

public class ExecutaTelaInteracao {	
	public static void main (String [] args){
	
		TelaInteracao telaPessoa = new TelaInteracao();
		telaPessoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPessoa.setSize(800,600);
		telaPessoa.setVisible(true);
		
	}




}
