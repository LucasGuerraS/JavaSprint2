package fiap;

public class RegistroEmpresa extends UserGeralRegistro{
	private String nomeEnt;
	private int cnpj;
	
	public RegistroEmpresa() {
	}

	public RegistroEmpresa(String email, String senha,String nomeEnt, int cnpj) {
		super.setEmail(email);
		super.setSenha(senha);
		this.nomeEnt = nomeEnt;
		this.cnpj = cnpj;
	}

	public String getNomeEnt() {
		return nomeEnt;
	}

	public void setNomeEnt(String nomeEnt) {
		this.nomeEnt = nomeEnt;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
