package programacionDinamica;
import java.util.Scanner;

public class Fibonacci {
	
	//Metodo para realizar el calculo de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Se crea un arreglo para almacenar los valores 
        int[] valores = new int[n + 1];
        
        // Inicializamos los valores iniciales
        valores[0] = 0;
        valores[1] = 1;

        // Calculamos los valores de Fibonacci desde 2 hasta n
        for (int i = 2; i <= n; i++) {
        	valores[i] = valores[i - 1] + valores[i - 2];
        }

        //El n numero de Fibonacci se encuentra en valores[n]
        return valores[n];
    }
    
    //Metodo que valida para que el numero ingresado sea positivo
    public static int validacionNegativo(int n) {
    	Scanner scanner = new Scanner(System.in);
    	
    	if (n<0) {
    		
    		do {//Estructura ciclica para hacer que se ingrese correctamente el numero
    			System.out.println("Error, ingreso un numero negativo");
    			System.out.print("Ingrese nuevamente: ");
    			n =scanner.nextInt();
    		}while(n<0);
    		
    		System.out.println("El numero "+ n + " es correcto");
    	}
    	else {
    		System.out.println("El numero "+ n + " es correcto");
    	}
    	//retorna el valor ingresado sin calcular Fibonacci aun
		return n;
    }
    
    //Metodo utilizado para la impresion
    public static void impresion(int n, int resultado) {
    	//Asignamos el numero ingresado al metodo para calcular Fibonacci y despues asignar a una variable int
    	resultado = fibonacci(n);
    	System.out.println("El resultado Fibonacci es: "+ resultado); // concatenacion
    }
}
