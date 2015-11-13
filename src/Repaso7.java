/*
 * Repaso 6
 * es un programa que hace lo mismo que repaso5 pero que 
 * solo cambia el color del rectangulo si se hace clic dentro de el.
 * 
 */
import java.awt.event.MouseEvent;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

public class Repaso7 extends acm.program.GraphicsProgram{
	
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
	//si en la posicion en la que se ha hecho clic esta el rectangulo entonces lo relleno
	//la funcion se llama getElementAt
	public void mouseClicked(MouseEvent evento){
		if(getElementAt(evento.getX(),evento.getY()) == rectangulo){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		}
	}
}

