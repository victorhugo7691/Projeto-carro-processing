package carro;

import processing.core.PApplet;

//non moving objects
public class Carro extends CarSuper{
	
	int x = 125, y = 210, s = 150;
	int di;
	
	Carro(PApplet _p, int localizacao, int dimensao){
		this._p = _p;
		this.x = localizacao;
		this.di= dimensao;
	}
	
	@Override
	public void render(){
		
		_p.fill(82, 162, 79);
		_p.rect(0, (3 * _p.height) / 4, _p.width, _p.height / 4);
		
		//rua
		_p.fill(129, 125, 117);
		_p.rect(0, (9 * _p.height) / 14, _p.width, _p.height / 8);
		
		//base do carro
		_p.fill(169,169,169);
		_p.rect(x, y + 10, s, di+(s/5), di+50);
		
		//parabrisa
		_p.triangle(x + 40, y + 10, x + 70, y + 10, x + 70, s + 40);

		//teto
		_p.fill(169,169,169);
		_p.rect(x + 70, s + 40, di+50, di+30);
		
		//rodas
		//x, y, width, height
		_p.fill(0);
		_p.ellipse(x+20, y + 40, 25, 25);
		_p.fill(79,79,79);
		_p.ellipse(x+20, y + 40, 15, 15);
		_p.fill(0);
		_p.ellipse(x+120, y + 40, 25, 25);
		_p.fill(79,79,79);
		_p.ellipse(x+120, y + 40, 15, 15);
	}
}
