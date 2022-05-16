package fiap;

import javax.swing.JOptionPane;

public class CandidatoVaga extends User{
	private String competencias[];
	private int notasUser;
	
	public CandidatoVaga() {
	}
	
	public CandidatoVaga(String nome, String idade, String descricao, String status, String[] competencias, int notasUser) {
		super.setNome(nome);
		super.setIdade(idade);
		super.setDescricao(descricao);
		super.setStatus(status);
		this.competencias = competencias;
		this.notasUser = notasUser;
	}
	

	public String[] getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String[] competencias) {
		this.competencias = competencias;
	}

	public int getNotasUser() {
		return notasUser;
	}

	public void setNotasUser(int notasUser) {
		this.notasUser = notasUser;
	}
	
	public void comparaRequisitos() {
		Vaga v1 = new Vaga();
		
		try {
			for (int i = 0; i < competencias.length; i++) {
				int soma = 0;
				if (competencias[i] == v1.getDescVaga()) {
					soma ++;
				} 
			JOptionPane.showMessageDialog(null, "Soma dos requisitos: " + soma);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	

}
