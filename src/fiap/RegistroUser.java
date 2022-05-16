package fiap;

public class RegistroUser extends UserGeralRegistro{
	private String nome, sobrenome;
	private int cpf, telefone;
	
	
	
	public RegistroUser() {
	}

	public RegistroUser(String email, String senha, String nome, String sobrenome, int cpf, int telefone) {
		super.setEmail(email);
		super.setSenha(senha);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
