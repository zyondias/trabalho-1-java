
/*
 * Autor Zyon Dias
 * Ra 2401321
 * Exercio 1
 * Class para definir campos e regras da tela com intera��o com usuario
 */


//importando as bibliotecas necessarias
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class TelaInteracao extends JFrame {

	//Definindo as labels das propriedades
		//label para pessoa
		private JLabel lNome;
		private JLabel lCpf;
		private JLabel lDiaNasc;
		private JLabel lMesNasc;
		private JLabel lAnoNasc;
		//fim label para pessoa
		
		//label para funcionario
		private JLabel lRa;
		private JLabel lStatus;
		private JLabel lDiaAd;
		private JLabel lMesAd;
		private JLabel lAnoAd;
		//fil label para funcionario
	//fim da defini��o das label das propriedades
		
	//definindo label de erros
			//label de erros para pessoa
			private JLabel lNomeErro;
			private JLabel lCpfErro;
			private JLabel lDiaNascErro;
			private JLabel lMesNascErro;
			private JLabel lAnoNascErro;
			//fim de label de erro para pessoa
			
			//label de erro para funcionario
			private JLabel lRaErro;
			private JLabel lStatusErro;
			private JLabel lDiaAdErro;
			private JLabel lMesAdErro;
			private JLabel lAnoAdErro;
			//fim de label de erro para Funcionario
	//fim das difini��es de label de erro
			
    //definindo os campos
			//campos para pessoa
			private JTextField tfNome;
			private JTextField tfCpf;
			private JTextField tfDiaNasc;
			private JTextField tfMesNasc;
			private JTextField tfAnoNasc;
			//fim dos campos para pessoa
			
			//campos para funcionario
			private JTextField tfRa;
			private JComboBox cbStatus;
			private JTextField tfDiaAd;
			private JTextField tfMesAd;
			private JTextField tfAnoAd;
			//fim dos campos para funcionario
	//fim das difini��es dos campos
			
   //botoes
		private JButton btSalvar;
		
	public TelaInteracao()
	{
		super("Exercicio 1");
		setLayout(new FlowLayout());//defindo o tipo de layout
		
		//configurando label de pessoa
		lNome = new JLabel("Nome: ");
		lNome.setToolTipText("Digite o nome da pessoa"); // dica para usuario
	    lDiaNasc = new JLabel ("Data de nascimento: ");
	    lDiaNasc.setToolTipText("Digite o dia do nascimento (dd)");
	    lMesNasc = new JLabel ("Mes de nascimento: ");
	    lMesNasc.setToolTipText("Digite o mes do nascimento (mm)");
	    lAnoNasc = new JLabel ("Ano de nascimento: ");
	    lAnoNasc.setToolTipText("Digite o ano do nascimento");
	    lCpf = new JLabel ("CPF");
	    lCpf.setToolTipText("Digite o numero do cpf com 11 caracteres)");
	    //fim da configura��o de label para pessoa
	    
	    //configurando labelde funcionarios
	    lRa = new JLabel("RA: ");
	    lRa.setToolTipText("Digite o RA do funcionario apenas Numeros");
	    lStatus = new JLabel("Status: ");
	    lStatus.setToolTipText("Selecione o status do funcionario");
	    lDiaAd = new JLabel ("Data de Admiss�o: ");
	    lDiaAd.setToolTipText("Digite o dia do Admiss�o (dd)");
	    lMesAd = new JLabel ("Mes de Admiss�o: ");
	    lMesAd.setToolTipText("Digite o mes do Admiss�o (mm)");
	    lAnoAd = new JLabel ("Ano de Admiss�o: ");
	    lAnoAd.setToolTipText("Digite o ano do Admiss�o (aaaa)");
		//fim da configura��es dos items para funcionario
	    
	    //configurando label de erro
		    //label de erro pessoa
		    lNomeErro = new JLabel("Invalido!");
		    lNomeErro.setVisible(false);
		    lNomeErro.setForeground(Color.red);
		    lCpfErro = new JLabel("Invalido!");
		    lCpfErro.setVisible(false);
		    lCpfErro.setForeground(Color.red);
		    lDiaNascErro = new JLabel("Invalido!");
		    lDiaNascErro.setVisible(false);
		    lDiaNascErro.setForeground(Color.red);
		    lMesNascErro = new JLabel("Invalido!");
		    lMesNascErro.setVisible(false);
		    lMesNascErro.setForeground(Color.red);
		    lAnoNascErro = new JLabel("Invalido!");
		    lAnoNascErro.setVisible(false);
		    lAnoNascErro.setForeground(Color.red);
		    //fim label erro pessoa
		    
		    //Label erro funcionario
			lRaErro = new JLabel("Invalido!");
			lRaErro.setVisible(false);
			lRaErro.setForeground(Color.red);
		    lStatusErro = new JLabel("Invalido!");
		    lStatusErro.setVisible(false);
		    lStatusErro.setForeground(Color.red);
		    lDiaAdErro = new JLabel("Invalido!");
		    lDiaAdErro.setVisible(false);
		    lDiaAdErro.setForeground(Color.red);
		    lMesAdErro = new JLabel("Invalido!");
		    lMesAdErro.setVisible(false);
		    lMesAdErro.setForeground(Color.red);
		    lAnoAdErro = new JLabel("Invalido!");
		    lAnoAdErro.setVisible(false);
		    lAnoAdErro.setForeground(Color.red);
		    //fim label erro funcionario
        //fim da configurando label de erro
		    
       //defini��es dos campos
		    //Campos pessoa
		    tfNome = new JTextField(40);
		    tfCpf = new JTextField(11);
		    tfDiaNasc = new JTextField(2);
		    tfMesNasc = new JTextField(2);
		    tfAnoNasc = new JTextField(4);
		    //fim campos pessoa
		    
		    //campos funcionario 
		    tfRa = new JTextField(8);  
		    String itensStatus [] = {"","Ativo", "Demetido","Ferias"};//criando lista para colocar na combobox
		    cbStatus = new JComboBox(itensStatus);
		    tfDiaAd = new JTextField(2);
		    tfMesAd = new JTextField(2);
		    tfAnoAd = new JTextField(4);
		    //fim campos funcionrios
		//fim defini�oes de campos
		    
		//defini��es dos bot�es
	    btSalvar = new JButton("Salvar");
	    
	    //adcionando os elementos na tela
	    add(lNome);
	    add(lNomeErro);
	    add(tfNome);
	    
	    add(lCpf);
	    add(lCpfErro);
	    add(tfCpf);
	    
	    add(lDiaNasc);
	    add(lDiaNascErro);
	    add(tfDiaNasc);
	    add(lMesNasc);
	    add(lMesNascErro);
	    add(tfMesNasc);
	    add(lAnoNasc);
	    add(lAnoNascErro);
	    add(tfAnoNasc);

	    add(lRa);
	    add(lRaErro);
	    add(tfRa);
	    add(lStatus);
	    add(lStatusErro);
	    add(cbStatus);
	    add(lDiaAd);
	    add(lDiaAdErro);
	    add(tfDiaAd);
	    add(lMesAd);
	    add(lMesAdErro);
	    add(tfMesAd);
	    add(lAnoAd);
	    add(lAnoAdErro);
	    add(tfAnoAd);
	    add(btSalvar);
	    
	    //adiciona escutador (listener) aos botoes
	    Manipulador manipula = new Manipulador();
	    btSalvar.addActionListener(manipula);
		    
	}
	
	
	private class  Manipulador implements ActionListener{
		public void actionPerformed( ActionEvent evento ){
			//limpando label de validacao
			lNomeErro.setVisible(false);
			lCpfErro.setVisible(false);
			lDiaNascErro.setVisible(false);
			lMesNascErro.setVisible(false);
			lAnoNascErro.setVisible(false);
			lRaErro.setVisible(false);
			lStatusErro.setVisible(false);
			lDiaAdErro.setVisible(false);
			lMesAdErro.setVisible(false);
			lAnoAdErro.setVisible(false);
			
			//usuario clicou em bot�o SALVAR
			if(evento.getSource()== btSalvar){
				
				DataPadrao dtNasc = new DataPadrao();
				DataPadrao dtAdmissao = new DataPadrao();
				
				//variavel para validacao geral caso alguma valida��o tenha ficado errado essas variavel se tornal TRUE
				boolean validaGeralData = false,validaGeralFuncionario = false;
				
				
				//validando e fazendo Sets das datas
					//valdando e Setando dia nascimento
					if(!tfDiaNasc.getText().isEmpty())
						{
							dtNasc.setDia(Integer.parseInt(tfDiaNasc.getText()));
							if(!dtNasc.validaDia())
								lDiaNascErro.setVisible(true);
						}
					else
						lDiaNascErro.setVisible(true);
					//Fim da valida�� e do set do dia de nascimento
					
					//valdando e Setando dia admiss�o
					if(!tfDiaAd.getText().isEmpty())
						{
							dtAdmissao.setDia(Integer.parseInt(tfDiaAd.getText()));
							if(!dtAdmissao.validaDia())
								lDiaAdErro.setVisible(true);
						}
					else
						lDiaAdErro.setVisible(true);
					//Fim da valida�� e do set do dia de admiss�o
				
					//valdando e Setando mes nascimento
					if(!tfMesNasc.getText().isEmpty())
					{
						dtNasc.setMes(Integer.parseInt(tfMesNasc.getText()));
						if(!dtNasc.validaMes())
							lMesNascErro.setVisible(true);
					}
					else
						lMesNascErro.setVisible(true);
					//Fim da valida�� e do set de mes de nascimento
					
					//valdando e Setando mes admiss�o
					if(!tfMesAd.getText().isEmpty())
					{
						dtAdmissao.setMes(Integer.parseInt(tfMesAd.getText()));
						if(!dtAdmissao.validaMes())
							lMesAdErro.setVisible(true);
					}
					else
						lMesAdErro.setVisible(true);
					//Fim da valida�� e do set de mes de nascimento
				
					//valdando e Setando Ano de nascimento
					if(!tfAnoNasc.getText().isEmpty())
					{
						dtNasc.setAno(Integer.parseInt(tfAnoNasc.getText()));
						if(!dtNasc.validaAno())
							lAnoNascErro.setVisible(true);
					}
					else
						lAnoNascErro.setVisible(true);
					//Fim da valida�� e do set Ano de nascimento
					
					//valdando e Setando Ano de Admiss�o
					if(!tfAnoAd.getText().isEmpty())
					{
						dtAdmissao.setAno(Integer.parseInt(tfAnoAd.getText()));
						if(!dtAdmissao.validaAno())
							lAnoAdErro.setVisible(true);
					}
					else
						lAnoAdErro.setVisible(true);
					//Fim da valida�� e do set do Ano de admisao
					
					//valida��o geral das datas
					if(!dtNasc.validaDia() && !dtNasc.validaMes() && !dtNasc.validaAno() && !dtAdmissao.validaDia() && !dtAdmissao.validaMes() && !dtAdmissao.validaAno())
						{validaGeralData = true;}
					else
						{validaGeralData = false;}
				//Fim da valida��o e set das datas    
				
				//criando objeto funcionario
				Funcionario funcionario = new Funcionario();
				
				//validando e setantados dados do funcionario
					//validando e setando nome
					if(funcionario.validaNome(tfNome.getText()))
					{
						funcionario.setNome(tfNome.getText());
					}
					else
					{
						lNomeErro.setVisible(true);
						//marcando na valida��o geral do funcionario que houve um erro torando a variavel verdadeira
						validaGeralFuncionario = true;
					}
					//Fim da valida��o e set do nome
					
					//validando e setando CPF //ATEN��O valida��o nao solicitada em diagrama��o por isso n�o tem um metodo especifico na class de pessoa.
					if(!tfCpf.getText().trim().isEmpty() && tfCpf.getText().length() == 11)
					{
						funcionario.setCpf(Double.parseDouble(tfCpf.getText()));
					}
					else
					{
						 lCpfErro.setVisible(true);
					     //marcando na valida��o geral do funcionario que houve um erro torando a variavel verdadeira
						 validaGeralFuncionario = true;
					}
					//fim da validacao e set do cpf
					
					//validando e setando o status
					if(funcionario.validaStatus(cbStatus.getSelectedItem().toString()))
					{
						funcionario.setStatus(cbStatus.getSelectedItem().toString());
					}
					else
					{
						lStatusErro.setVisible(true);
						//marcando na valida��o geral do funcionario que houve um erro torando a variavel verdadeira
						 validaGeralFuncionario = true;
					}
					//fim da valida��o e set do status
					
					//validando e setando //ATEN��O valida��o nao solicitada em diagrama��o por isso n�o tem um metodo especifico na class de Funcionario
					if(!tfRa.getText().trim().isEmpty())
					{
						funcionario.setRa(Double.parseDouble(tfRa.getText()));
					}
					else
					{
						lRaErro.setVisible(true);
						//marcando na valida��o geral do funcionario que houve um erro torando a variavel verdadeira
						 validaGeralFuncionario = true;
					}
					//fim da validacao e do set para RA
				//fim da valida��o e sets do funcionario.
					
			   //Valida��o geral para verificar se algo deu errado para abri Uma janela de aviso para usuario;
			   if(validaGeralData || validaGeralFuncionario)
			   {
				   JOptionPane.showMessageDialog(null, "Algo no preenchimento deu errado verifique as mensagens em vermelho", "Erro", JOptionPane.ERROR_MESSAGE);
			   }
			   else
				   JOptionPane.showMessageDialog(null, "O funcionario: " + funcionario.getNome() + "\nDo CPF: "+ funcionario.getCpf() +"\nNascido em: "+ dtNasc.toString()+ "\nTem o RA: "+ funcionario.getRa() + "\nO Seu status �: "+funcionario.getStatus()+"\nE foi admitido no dia: "+ dtAdmissao.toString(), "�xito", JOptionPane.INFORMATION_MESSAGE);
		   }
		  }
				
		}
		
	}

