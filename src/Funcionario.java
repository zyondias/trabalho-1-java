/**
 * 
 */

/**
 * @author Zyon Dias
 * RA 2401321
 * Class funcionario para o exercio 1 que herda da class pessoa
 * ness class ira ter todas regras de negocio de Funcionario *
 */
public class Funcionario extends Pessoa {

	//definindo propríedades do funcionario
	private double ra;
	private DataPadrao dtAdmissao;
	private String status;
	//fim da definição de propriedades
	
	//metodo construtor herdando de Pessoa
	public Funcionario(String nome, double cpf, DataPadrao dtNasc, double ra, DataPadrao dtAdmissao, String status)
	{
		super(nome, cpf, dtNasc);
		this.ra = ra;
		this.dtAdmissao = dtAdmissao;
		this.status = status;
	}//Fim do metodo construtor herdando pessoa
	
	//sobrecarga de construtor Funcionario
	public Funcionario()
	{
		
	}//Fim da sobrecarga de construtor
	
	//metodos Sets
	public void setRa(double ra)
	{
		this.ra = ra;
	}
	public void setDtAdmissao(DataPadrao dtAdmissao)
	{
		this.dtAdmissao = dtAdmissao;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	//fim dos metodos Sets
	
	//Metodos Gets
	public double getRa()
	{
		return ra;
	}
	public DataPadrao getDtAdmissao()
	{
		return dtAdmissao;
	}
	public String getStatus()
	{
		return status;
	}
	//fim do metodos gets
	
	//metodo para validar status
	public boolean validaStatus(String status)
	{
		//tirando todo espaço na variavel e verificando se esta em branco
				if(status.trim().isEmpty())
				{
					return false;
				}
				return true;
	}//fim do metodo de validação de status
	
}
