package fiap;

public class RegistroAdmin extends UserGeralRegistro{
	private String nomeAdm;

	public RegistroAdmin() {
	}

	public RegistroAdmin(String email, String senha,String nomeAdm) {
		super.setEmail(email);
		super.setSenha(senha);
		this.nomeAdm = nomeAdm;
	}

	public String getNomeAdm() {
		return nomeAdm;
	}

	public void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}
	
	
	
	
	
	
	
	
}
