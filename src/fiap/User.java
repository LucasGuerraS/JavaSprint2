package fiap;

public class User extends RegistroUser{
	private String idade, descricao, status;

	public User() {
	}

	public User(String nome, String idade, String descricao, String status) {
		super.setNome(nome);
		this.idade = idade;
		this.descricao = descricao;
		this.status = status;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String defineUser() {
		String resumo = "Nome: " + getNome() + "\nIdade: " + getIdade() + "Descrição: " + getDescricao() + "Status: " + getStatus();
		return resumo;
	}
	
	
	
}
