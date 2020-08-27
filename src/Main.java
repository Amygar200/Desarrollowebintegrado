import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Ingrese calificacion: ");
int calificacion= s.nextInt() ;
boolean avisarFamilia = false;
if(calificacion >= 0 && calificacion < 10) {
	System.out.println("Insuficiente");
	avisarFamilia = true;
}else if (calificacion < 11) {
	System.out.println("Suficiente");
}else if (calificacion < 16) {
	System.out.println("Notable");
}else if (calificacion < 20) {
	System.out.println("Sobesaliente");
}else if (calificacion == 20) {
	System.out.println("Matricula");
}else{
	System.out.println("Calificacion no valida");
}if(avisarFamilia) {
	System.out.println("Avisar a la familia");
}
//Ejercicio 2//
for(int x=0; x<= 10; x++) {
	if(x==6) {
		break;
	}
	System.out.println("x:"+ x);
}

		
	}

}
