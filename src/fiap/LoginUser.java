package fiap;

import javax.swing.JOptionPane;

public class LoginUser extends RegistroUser{
	String username;

	public LoginUser() {
	}

	public LoginUser(String senha, String username) {
		super.setSenha(senha);
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void verificaDados(String nome, String senha) {
		this.username = nome;
		try {
			if(senha.equals(super.getSenha()) && username.equals(super.getNome())) {
				JOptionPane.showMessageDialog(null, "Login aprovado!!");
			}
			else {
				throw new Exception("Nome ou senha incorretos!!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	
	
	
	
}
