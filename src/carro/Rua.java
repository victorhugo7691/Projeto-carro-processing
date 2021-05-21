package carro;

import processing.core.PApplet;

//animation of lines on road
public class Rua extends CarSuper{
	int x1;
	public Rua(PApplet _p){
		this._p = _p;
		x1 = 0;
	}

	//aumenta x
	@Override
	public void move(){
		this.x1 += 10;
	}

	//renderizar
	@Override
	public void render(){
		lines(this.x1);
	}
	
	//linhas da rua
	public void lines(int x){
		_p.fill(237, 208, 43);
		for(int i = 0; i < 61; i++){
			_p.rect((x + (i * 13)) % 400, (9 * _p.height) / 14 + 10, 6, 3);
		}
	}
}
