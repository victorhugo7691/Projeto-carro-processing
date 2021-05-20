package carro;

import java.util.ArrayList;

import processing.core.PApplet;

public class ArrList extends CarSuper{
	//Array Lists
	ArrayList<ArvoreDeDados> trees = new ArrayList<ArvoreDeDados>();
	ArrayList<Montanha> mountains = new ArrayList<Montanha>();
	ArrayList<PApplet> idek = new ArrayList<PApplet>();
	public void keyPressed() {
		if (key == 't') 
		{
			ArvoreDeDados tree = new ArvoreDeDados(_p);
			trees.add(tree);
			tree.render();
		}
		else if(key == 'm'){
			Montanha mountain = new Montanha(_p);
			mountains.add(mountain);
			mountain.render();
		}
	}
	
	public void treesRendMove(){
		for(int i = 0; i < trees.size(); i++)
		{
			(trees.get(i)).render();
			(trees.get(i)).move();
		}
	}
}
