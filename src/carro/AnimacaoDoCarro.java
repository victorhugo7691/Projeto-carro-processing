package carro;

import java.util.ArrayList;
import processing.core.PApplet;

public class AnimacaoDoCarro extends PApplet{
	Rua ruaLinha;
	//lista de arvores e montanhas
	ArrayList<ArvoreDeDados> arvores = new ArrayList<ArvoreDeDados>();
	ArrayList<Montanha> montanhas = new ArrayList<Montanha>();
	
	public void setup(){
		ruaLinha = new Rua(this);
		noStroke();
		size(410, 410);
		criarMontanha(2);
		criaArvore(2);
	}
 
	public void draw(){
		Carro primeiroCarro = new Carro(this, 20, 1);
		Carro segundoCarro = new Carro(this, 200, 1);
		background(30,144,255);
		movimentarMontanha();
		movimentarArvore();
		
		primeiroCarro.render();
		segundoCarro.render();

		ruaLinha.render();
		ruaLinha.move();
	}
	
	public void criarMontanha(int n) {
		for(int i=0; i<=n; i++) {
			arvores.add(new ArvoreDeDados(this));
		}
	}
	
	public void criaArvore(int n) {
		for(int i=0; i<=n; i++) {
			montanhas.add(new Montanha(this));
		}
	}

	public void movimentarArvore(){
		for(int i = 0; i < arvores.size(); i++){
			(arvores.get(i)).render();
			(arvores.get(i)).move();
		}
	}
	
	public void movimentarMontanha(){
		for(int i = 0; i < montanhas.size(); i++){
			(montanhas.get(i)).render();
			(montanhas.get(i)).move();
		}
	}
	
	public static void main(String args[]){
		PApplet.main(new String[] { carro.AnimacaoDoCarro.class.getName() });
	}
}
