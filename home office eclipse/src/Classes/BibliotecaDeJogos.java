package Classes;

import java.util.ArrayList;

public class BibliotecaDeJogos {

	ArrayList<Jogo> games = new ArrayList<>();
	
	Jogo jogoUm = new Jogo("Mad max","ação",23);
	Jogo jogoDois = new Jogo("Red Dead 2", "Faroeste",150);
	Jogo jogoTres = new Jogo("Gta 5","crime",190);
	Jogo JogoQuatro = new Jogo("Fifa 25","esportes",40);
	
	public void games() {
	
		
	games.add(jogoUm);
	games.add(jogoDois);
	games.add(jogoTres);
	games.add(JogoQuatro);

	}
public void mostrarDados() {
	
final int ESPACO_GIGAS = 500;
int totalOcupado = 0;
		
	System.out.println("Lista de games");
	for (Jogo jogos : games) {
		
		System.out.println("Nome: " + jogos.getNome() +
                " | Gênero: " + jogos.getGenero() +
                " | Tamanho: " + jogos.getTamanhoGb() + "GB");

		
	totalOcupado += jogos.getTamanhoGb();
	
	}
	
	int espacoLivre = ESPACO_GIGAS - totalOcupado;

	
	System.out.println("Espaço ocupado: " + totalOcupado + "GB");
	System.out.println("Espaço Livre: " + espacoLivre + "GB");
	
	
}




}	

	
	
	
	
	

