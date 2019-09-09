package fundamentos.operadores;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class OperadorTernario_UtilizandoJLabel {
	
	public static void main(String[] args) {
		
		String nota = JOptionPane.showInputDialog("Insira a média");
		double media = Double.parseDouble(nota);
		JLabel resultado = new JLabel(media >= 5.0 ? "Aprovado" : "Reprovado");
		
		//Change Layout JLabel
		Font big = new Font("SansSerif", Font.BOLD, 15);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setAlignmentX(20);
		resultado.setAlignmentY(20);
		resultado.setFont(big);
		resultado.setPreferredSize(new Dimension(40,40));
		JOptionPane.showMessageDialog(null, resultado);
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
	}
}
