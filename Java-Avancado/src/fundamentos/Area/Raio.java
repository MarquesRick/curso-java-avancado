package fundamentos.Area;

import java.text.DecimalFormat;

public class Raio {

	public double x, area;
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	Raio(){
		
	}
	Raio(double x){
		this.x = x;
	}
	
	public double calculaArea(double x){
		
		return area = x * x * Math.PI; 
		
	}
	
	public void printarTela(){
		System.out.println("Área ?: " + formatador.format(area) + " m2.");
	}
	
}
