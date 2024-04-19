package fundamentos.Temperatura;

public class Celsius {
	
	public double celsius;
	public double fahrenheit;
	public final double ADJUSTMENT = 5.0 / 9.0;
	public final double FACTOR = 32;
	
	Celsius(){
		//contsrutor
	}
	
	public void comentarioTemperatura(){
		
		if(celsius < 0){
			System.out.println("Too cold.. " + (int)celsius);
		} else if(celsius > 40){
			System.out.println("Hot day.. " +  (int)celsius);
		} else{
			System.out.println("Mild temperature");
		}
	}
	
	double calculaCelsius(double fah){
		return celsius = ((fah - FACTOR) * ADJUSTMENT);
	}
	
	void printCel(){
		System.out.println("A medida convertida: " + (int)celsius + "C"); //Cast (double to int)
	}
	
	double calculaFah(double cel){
		return fahrenheit = ((9 * cel + 160) / 5);
	}
	
	void printFah(){
		System.out.println("A medida convertida: " + (int)fahrenheit + "F\n"); //Cast (double to int)
	}
	
}
