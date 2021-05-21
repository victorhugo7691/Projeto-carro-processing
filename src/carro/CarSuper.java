package carro;

import java.util.Random;
import processing.core.PApplet;

public class CarSuper extends PApplet{
	
	public PApplet _p = new PApplet();
	public void render(){}
	public void move(){}
	
	public int Rand(int s, int b){
		Random rng = new Random();
		int diff = b - s;
		int n = rng.nextInt(diff) + s;
		return n;
	}
	
	public int Rand(int width){
		Random rng = new Random();
		int x = rng.nextInt(width);
		return x;
	}
	
	public int move(float l, float r, int v){
		if(l > 400){
			l = 0 - r;
			return (int) l;
		} 
		return (int) l + v;
	}
}

