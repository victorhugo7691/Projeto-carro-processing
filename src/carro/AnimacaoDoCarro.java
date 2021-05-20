package carro;

import java.util.ArrayList;
import processing.core.PApplet;

public class AnimacaoDoCarro extends PApplet{
	Rua roadlines;
	
	public void setup(){
		roadlines = new Rua(this);
		noStroke();
		size(400, 400);
	}
 
	public void draw(){
		Carro primeiroCarro = new Carro(this, 20, 1);
		Carro segundoCarro = new Carro(this, 200, 1);
		//background
		background(30,144,255);
		//moves and renders mountains
		mountainsRendMove();
		//moves and renders trees
		treesRendMove();
		//car contains all nonmoving things
		
		primeiroCarro.render();
		segundoCarro.render();
		//moves and renders road lines
		roadlines.render();
		roadlines.move();
	}
	
	//array list containing tree objects and mountain objects
	ArrayList<ArvoreDeDados> trees = new ArrayList<ArvoreDeDados>();
	ArrayList<Montanha> mountains = new ArrayList<Montanha>();
	//pressed key = a new tree or mountain
	public void keyPressed() {
		if (key == 't') {
			trees.add(new ArvoreDeDados(this));
		}
		else if(key == 'm'){
			mountains.add(new Montanha(this));
		}
	}
	
	//methods that render and move trees/mountains
	public void treesRendMove(){
		for(int i = 0; i < trees.size(); i++){
			(trees.get(i)).render();
			(trees.get(i)).move();
		}
	}
	
	public void mountainsRendMove(){
		for(int i = 0; i < mountains.size(); i++){
			(mountains.get(i)).render();
			(mountains.get(i)).move();
		}
	}
	
	public static void main(String args[]){
		PApplet.main(new String[] { carro.AnimacaoDoCarro.class.getName() });
	}
}
