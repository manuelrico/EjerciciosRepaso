/*
 * Repaso 7
 * cuando se hace click en un rectangulo central,genera un nuevo rectangulo aleatorio.
 * 
 */
import java.awt.event.MouseEvent;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

public class Repaso8 extends acm.program.GraphicsProgram{

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
            double distanciaAlCentroDelRectangulo = evento.getX() - rectangulo.getX();
			if(distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2){
				rectangulo.move(10,0);
			}
			else{
				rectangulo.move(-10,0);
			}

		}
	}
}

