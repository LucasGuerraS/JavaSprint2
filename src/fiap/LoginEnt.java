package fiap;

import javax.swing.JOptionPane;

public class LoginEnt extends RegistroEmpresa{
	private int id;
	
	public LoginEnt() {
	}
	public LoginEnt(String senha, int id) {
		super.setSenha(senha);
		this.id = id;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void verificaDados(int id, String senha) {
		try {
			if(senha.equals(super.getSenha())) {
				JOptionPane.showMessageDialog(null, "Login aprovado!!");
			}
			else {
				throw new Exception("ID ou senha incorretos!!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	
	
}
