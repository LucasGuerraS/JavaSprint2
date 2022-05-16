package fiap;

public class Pontos {
	private String[] skillAvan, skillMed, skillBas;
	private int termo;
	private int[] notasProvas;
	
	public Pontos() {
	}
	
	public Pontos(String[] skillAvan, String[] skillMed, String[] skillBas) {
		this.skillAvan = skillAvan;
		this.skillMed = skillMed;
		this.skillBas = skillBas;
	}

	public String[] getSkillAvan() {
		return skillAvan;
	}

	public void setSkillAvan(String[] skillAvan) {
		this.skillAvan = skillAvan;
	}

	public String[] getSkillMed() {
		return skillMed;
	}

	public void setSkillMed(String[] skillMed) {
		this.skillMed = skillMed;
	}

	public String[] getSkillBas() {
		return skillBas;
	}

	public void setSkillBas(String[] skillBas) {
		this.skillBas = skillBas;
	}

	public int calculaTermometro() {
		int term = ((skillBas.length * 6) + (skillMed.length * 8) + (skillAvan.length * 10)) / (skillBas.length + skillMed.length + skillAvan.length);
		this.termo = term;
		return term;
	}
	
	public float pontuacaoFinal() {
		int somaNotas = 0;
		for (int i = 0; i < notasProvas.length; i++) {
			somaNotas += notasProvas[i];
		}
		int notaF = somaNotas / notasProvas.length;
		int pontFinal = (notaF  + termo) / 2;
		return pontFinal;
	}
	

}