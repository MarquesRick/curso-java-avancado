package fundamentos.Temperatura;

public class Temperatura {
	public static void main(String[] args) {

		Celsius c = new Celsius();
		System.out.print("-----------------------------------------------------");
		System.out.print("\nConversor de temperatura: Graus Celsios -> Fahrenheit\n");
		System.out.print("-----------------------------------------------------\n");
		c.calculaCelsius(80);
		c.printaCel();
		c.calculaFah(26);
		c.printaFah();
		c.printaFah();
		System.out.print("Teste Git para Eclipse");
		

	}
}
