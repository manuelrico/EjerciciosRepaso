/*
 * Autor: Manuel Rico
 * La clase Repaso 2 tiene que dibujar un rectangulo a partir del centro de la pantalla
 * en el lado superior de la pantalla.
 */


import acm.graphics.*;
public class Repaso2 extends acm.program.GraphicsProgram{
	//declaro una variable de distancia para almacenar el rectangulo
	//como es de instancia, se ve desde el init y desde el run
	GRect rectangulo;
	
	//declaro otra variable de instancia que guardara el punto X de la pantalla en que 
	//empezara a pintarse el rectangulo
	int distanciaX;
	
	public void init(){
		//cambio el tamaño de la pantalla
		setSize(800,600);
		
		
		//reo el rectangulo de 120 de ancho por 80 de alto
		rectangulo = new GRect(120,80);
		add(rectangulo);
		
	}
	
	public void run(){
		//divido el ancho de la pantalla en 2 para saber donde esta la mitad exacta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX,0);
	}

}
