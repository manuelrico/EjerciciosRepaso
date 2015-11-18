import acm.graphics.*;

public class EjerciciosJavaBasico3 extends acm.program.ConsoleProgram{
	public void run(){

	}

	private boolean muyVanidoso (int numero){
		if(numero >0){
			if(numero % 11 ==0){
				return true;
			}
			if(numero % 11==1){
				return true;
			}
			else{
				return false;
			}

		}
		return false;

	}

}
