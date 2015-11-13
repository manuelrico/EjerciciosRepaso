/*
 * Repaso 7
 * cuando se hace click en un rectangulo central,genera un nuevo rectangulo aleatorio.
 * 
 */
import java.awt.event.MouseEvent;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

public class Repaso6 extends acm.program.GraphicsProgram{
	
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
		GRect auxiliar = new GRect(aleatorio.nextInt(200),
				                    aleatorio.nextInt(200));
		auxiliar.setFilled(true);
		auxiliar.setFillColor(aleatorio.nextColor());
		add(auxiliar,aleatorio.nextInt(800),
				     aleatorio.nextInt(600));
		rectangulo.setFillColor(aleatorio.nextColor());
	
		}
	}
}

