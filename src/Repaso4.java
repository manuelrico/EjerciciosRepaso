/*
 * Autor: Manuel Rico
 * La clase repaso 3 tiene que dibujar un rectangulo con la esquina superior izquierda en el 
 * centro de la pantalla
 */
import acm.graphics.GRect;
import acm.graphics.*;
public class Repaso4  extends acm.program.GraphicsProgram{
	
		//declaro una variable de distancia para almacenar el rectangulo
		//como es de instancia, se ve desde el init y desde el run
		GRect rectangulo;
		
		//declaro otra variable de instancia que guardara el punto X de la pantalla en que 
		//empezara a pintarse el rectangulo
		double distanciaX;
		double distanciaY;
		
		public void init(){
			//cambio el tamaño de la pantalla
			setSize(800,600);
			
			
			//reo el rectangulo de 120 de ancho por 80 de alto
			rectangulo = new GRect(120,80);
			add(rectangulo);
			
		}
		
		public void run(){
			//divido el ancho de la pantalla en 2 para saber donde esta la mitad exacta de la pantalla
			distanciaX = getWidth()/2 - rectangulo.getWidth()/2;
			
			
			//divido el alto de la panta en 2 para saber done esta la mitad exacta de la pantalla
			distanciaY = getHeight()/2 - rectangulo.getWidth()/2;
			rectangulo.setLocation(distanciaX, distanciaY);
		}

	}



