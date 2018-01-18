import java.util.Scanner;
public class AdivinarNumero {
	public static void main(String[] args) {
		
		int i = 0;
		int numero1 = 0;
		int Aleatorio1 = (int) Math.floor(Math.random()*(100)+1);
		Scanner sc = new Scanner(System.in);
		
		while(numero1 != Aleatorio1){
			
		System.out.print("Por favor introduzca un numero entero: ");
		numero1 = sc.nextInt();
		
		if(numero1 > Aleatorio1) {
			
			System.out.println("El numero introducido es mayor que el generado ");
			
		}
		
		if(numero1 < Aleatorio1) {
			
			System.out.println("El numero introducido es menor que el generado ");
			
		}
		
		i++;
			
			
		}
		
		System.out.println("Has acertado, el numero de intentos fue de " + i);
		
		sc.close();

	}

}
