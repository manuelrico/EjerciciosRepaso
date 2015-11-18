import acm.program.*;
public class EjercicioJavaBasico7 extends acm.program.ConsoleProgram{
	public boolean multiploMultple(int a){
		if(a%3==0){
			return true;
		}
		if(a%5==0){
			return true;
		}
		if(a%3==0 && a%5==0){
			return false;
		}
		return false;	
	}
	
}
	


