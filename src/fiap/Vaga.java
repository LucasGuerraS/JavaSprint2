package fiap;

import javax.swing.JOptionPane;

public class Vaga {
	private String nomeVaga, descVaga, tipoVaga;
	private String[] prova;

	public Vaga() {
	}

	public Vaga(String nomeVaga, String descVaga, String tipoVaga, String[] prova) {
		this.nomeVaga = nomeVaga;
		this.descVaga = descVaga;
		this.tipoVaga = tipoVaga;
		this.prova = prova;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getDescVaga() {
		return descVaga;
	}

	public void setDescVaga(String descVaga) {
		this.descVaga = descVaga;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}
	
	
	
	public String[] getProva() {
		return prova;
	}

	public void setProva(String[] prova) {
		this.prova = prova;
	}

	public void criarVaga() {
		JOptionPane.showMessageDialog(null, "Nome da vaga: " + getNomeVaga() + "Descrição da vaga: " + getDescVaga() + "Tipo da vaga: " + getTipoVaga());
	}
	
	public void listaProva() {
		String provas = "Provas: \n";
		for (int i = 0; i < prova.length; i++) {
			provas += "Prova " + (i + 1) + ": " + prova[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, provas);
	}
	
}
