
public class EjerciciosJavaBasico2 extends acm.program.ConsoleProgram{
	public void run(){
		println(multa(60, false));
		println(multa(65, false));
		println(multa(76,true));
	}
	private int multa(int velocidad,boolean cumpleaños){
		if(cumpleaños){velocidad=velocidad-5;}
			if(velocidad <=60){
			return 0;
		}
		if(velocidad >=61 && velocidad <=80){
				return 1;
			}
		if(velocidad >=80){
			return 2;
		}
		return 0;
		}
	}


