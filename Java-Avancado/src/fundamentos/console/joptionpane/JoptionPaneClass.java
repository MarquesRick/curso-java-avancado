package fundamentos.console.joptionpane;

import javax.swing.JOptionPane;

public class JoptionPaneClass {

	public String valor1;
	public String valor2;
	public double media;
	public String resultado;
	public int resposta;
	

	public JoptionPaneClass(){
		
	}
	
	void setNota(){
		
		valor1 = JOptionPane.showInputDialog("Digite a Primeira nota");
		valor2 = JOptionPane.showInputDialog("Digite a Segunda nota");
	}
	
	public void getSoma(){
		
		 double nota1 =  Double.parseDouble(valor1);
		 double nota2 = Double.parseDouble(valor2);
		 media = ((nota1 + nota2) /2);
	}
	
	public void getResultado(){
		
		resultado = Double.toString(media);
		resposta = JOptionPane.showConfirmDialog(null, "A m?dia ?: " + resultado + "?");
		if(resposta == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "A m?dia ?: " + resultado);
		} else{
			JOptionPane.showMessageDialog(null, "A m?dia n?o ? " + resultado);
		}
	    
	}
	
}
