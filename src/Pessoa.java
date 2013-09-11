/**
 * 
 */

/**
 * @author Zyon Dias 
 * RA 2401321
 * class para regras de negocios de pessoa
 * EXercicio 1
 *
 */
public class Pessoa {

	//propriedades de pessoa
	private String nome;
	private double cpf; //variavel esta como double pois como int não é suportado 11 digitos
	private DataPadrao dtNasc;
	//fim da declarações de variavel
	
	//metodo construtor
	public Pessoa(String nome, double cpf, DataPadrao dtNasc)
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}//metodo construtor
	
	//SobreCarga do metodo construtor
	public Pessoa()
	{
		super();
		//metodo construtor
	}
	//Fim SobreCarga do metodo construtor
	
	//metodos Sets
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setCpf(double cpf)
	{
		this.cpf = cpf;
	}
	public void setDtNasc(DataPadrao dtNasc)
	{
		this.dtNasc = dtNasc;
	}
	//fim dos metodos sets
	
	//metodos Gets
	public String getNome()
	{
		return nome;
	}
	public double getCpf()
	{
		return cpf;
	}
	public DataPadrao getDtNasc()
	{
		return dtNasc;
	}
	//fim dos metodos Gets
	
	//metodo para validar nome
	public boolean validaNome(String nome)
	{
		//tirando todo espaço na variavel e verificando se esta em branco
		if(nome.trim().isEmpty())
		{
			return false;
		}
		return true;
	}
	//fim do metodo validar nome
	
}
