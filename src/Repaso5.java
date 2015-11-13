/*
 * Repaso 5 añade soporte al programa para poder escuchar
 * los clics del raton, lo que haara el programa es cambiar el color
 * de relleno de aleatoriamente de un rectangulo cada vez que se pulse clic
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;
public class Repaso5 extends acm.program.GraphicsProgram{
	
	//declaro una variable de instancia para guardar el rectangulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();
	
	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120,80);
		addMouseListeners();
	}

	
	public void run(){
		add(rectangulo,
				getWidth()/2 - rectangulo.getWidth()/2,
				getWidth()/2 - rectangulo.getWidth()/2);

	}
	
	//añado el metodo que escucha el evento del clic del raton
	
	public void mouseClicked(MouseEvent evento){
		if(evento.getButton() == MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		}
	}
}
