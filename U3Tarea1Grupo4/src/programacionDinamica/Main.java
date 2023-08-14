package programacionDinamica;
import programacionDinamica.Fibonacci;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int resultado = 0;//Inicializacion de variable para guardar el resultado fibonacci
		
		//Instanciaciones
		Scanner scanner = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();
		
		System.out.print("Ingrese un numero para calcular por el metodo de Fibonacci: ");
		int n = scanner.nextInt(); //ingreso de valor para obtener diferentes números de la serie de Fibonacci
		
    	//Asignamos el numero ingresado al metodo para calcular Fibonacci y despues asignar a una variable int
		int numero=fibonacci.validacionNegativo(n);
		resultado = fibonacci.fibonacci(numero);
    	System.out.println("El resultado Fibonacci es: "+ resultado); // concatenacion
		//fibonacci.impresion(numero,resultado);

	}

}
