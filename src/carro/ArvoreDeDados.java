package carro;

import processing.core.PApplet;

//animacao das arvores
public class ArvoreDeDados extends CarSuper
{
	final float HWRATIO = (float) 0.3846;
	int x, h, bh, bw, by, c1, c2, c3;
	float l, r ,c;

	ArvoreDeDados(PApplet _p)
	{

		this._p = _p;
		this.x = Rand(-20, 400);
		this.h = Rand(100, 155);
		this.bh = Rand(5, 20);
		this.bw = Rand(5, 10);
		this.by = 260 - bh;
		//cores
		this.c1 = Rand(40, 60);
		this.c2 = Rand(140, 160);
		this.c3 = Rand(40, 60);

		this.l = x;
		this.r = x + (h * HWRATIO);
		this.c = x + (h * HWRATIO / 2);
	}
	@Override
	public void move()
	{
		this.x = super.move(x, r, 4);
	}
	
	@Override
	public void render() {
		_p.noStroke();
		_p.fill(c1, c2, c3);
		
		this.l = x;
		this.r = x + (h * HWRATIO);
		this.c = x + (h * HWRATIO / 2);
		_p.triangle(l, by, r, by, c, (by) - h);
		_p.rect(c - (bw / 2), by, bw, bh);
	}
}
