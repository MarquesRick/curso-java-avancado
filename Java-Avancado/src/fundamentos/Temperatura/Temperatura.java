package fundamentos.Temperatura;

public class Temperatura {
	public static void main(String[] args) {

		Celsius c = new Celsius();
		System.out.print("-----------------------------------------------------");
		System.out.print("\nConversor de temperatura: Graus Celsios -> Fahrenheit\n");
		System.out.print("-----------------------------------------------------\n");
		c.calculaCelsius(80);
		c.printCel();
		c.calculaFah(26);
		c.printFah();

		c.comentarioTemperatura();

	}
}
