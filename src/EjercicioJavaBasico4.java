import acm.program.*;
public class EjercicioJavaBasico4 extends acm.program.ConsoleProgram{

	private boolean contesta(boolean matinal, boolean madre, boolean dormido){
		if(dormido){
			return false;
		}
		if(matinal && madre){
			return true;
		}
		if(!matinal){
			return true;
		}

		return false;
	}
}
