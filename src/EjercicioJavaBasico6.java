import acm.program.*;
public class EjercicioJavaBasico6 extends acm.program.ConsoleProgram{
	public boolean digitoIgual(int a, int b){
		if(a/10==b%10 ||b/10==a%10 || a/10==b/10 || a%10==b%10){
			return true;
		}
		return false;
	}

}
