package fundamentos.Temperatura;

public class Celsius {
	
	public double celsius;
	public double fahrenheit;
	public final double ajuste = 5.0 / 9.0;
	public final double fator = 32;
	
	Celsius(){
		//contsrutor
	}
	
	public void comentarioTemperatura(double celsius){
		
		if(celsius < 0){
			System.out.println("Frio Pakas.." + celsius);
		} else if(celsius > 40){
			System.out.println("Calor.." +  celsius);
		} else{
			System.out.println(celsius);
		}
	}
	
	double calculaCelsius(double fah){
		return celsius = ((fah - fator) * ajuste);
	}
	
	void printaCel(){
		System.out.println("A medida convertida ? " + (int)celsius + "?C"); //Cast (double to int)
	}
	
	double calculaFah(double cel){
		return fahrenheit = ((9 * cel + 160) / 5);
	}
	
	void printaFah(){
		System.out.println("A medida convertida ? " + (int)fahrenheit + "?F\n"); //Cast (double to int)
	}
	
}
