package Classes;

public class Jogo {
	
	private String nome;
	private String genero;
	private int tamanhoGb;
	
	public Jogo(String nome, String genero, int tamanhoGb) {
		
		this.nome = nome;
		this.genero = genero;
		this.tamanhoGb = tamanhoGb;
		
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public  String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanhoGb() {
		return tamanhoGb;
	}

	public void setTamanhoGb(int tamanhoGb) {
		this.tamanhoGb = tamanhoGb;
	}

}
