import utiles.*;
/**
*Clase EurosADolares. 
*Solicita una cantidad de euros y realiza el cambio a dólares sabiendo que el euro está a 1 Euro = 1,0994 dólares americanos. 
*Calcula y muestra de forma iterativa.
*
*@author Santiago Valentin Serrano
*@Version 1.1
*/
class EurosADolares{
	public static void main(String[]args){
		double euros = askEuros();

		System.out.println(""+euros+" euros are "+calculateDollards(euros)+" dollards");
		
	}
	private static double calculateDollards(double euros){
		return euros*1.0994;
	}
	/**Asks for an amount of euros and returns a valid amount*/
	private static double askEuros(){
		double euros;
		do{
			euros = Teclado.leerDecimal("Please, write an amount in euros: ");
		}while(euros<0);
		
		return euros;
	}	
}