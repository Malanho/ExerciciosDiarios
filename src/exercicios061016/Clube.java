package exercicios061016;

public class Clube {
	
			
		String nome;
	int pontosCasa; 
	int pontosFora;
	int numJogos;
	public Clube() {	
	}

	public Clube(String n){
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosCasa() {
		return pontosCasa;
	}

	public void setPontosCasa(int pontosCasa) {
		this.pontosCasa = pontosCasa;
	}

	public int getPontosFora() {
		return pontosFora;
	}

	public void setPontosFora(int pontosFora) {
		this.pontosFora = pontosFora;
	}

	public int getNumJogos() {
		return numJogos;
	}

	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}
	
}
