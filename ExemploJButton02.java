import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

public class ExemploJButton02{
	
		public static void main(String[] args) {
			
			JFrame tela = new JFrame("HOVER");
			tela.setSize(500, 500);
			tela.setLayout(null);
			tela.setLocationRelativeTo(null);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JButton botao = new JButton("Não venha aqui");
			botao.setSize(400, 300);
			botao.setLocation(45, 140);
			botao.setBackground(Color.decode("#23dd3f"));

			// remove a borda ao redor do texto
			botao.setFocusPainted(false);

			// remove a borda ao redor do botao
			botao.setBorderPainted(false);
			botao.addMouseListener(new MouseAdapter(){
				// evento quando o mouse entra no botao
				@Override
				public void mouseEntered(MouseEvent e){
					botao.setBackground(Color.decode("#ffe105"));
				}

				// evento quando o mouse sai do botao
				@Override
				public void mouseExited(MouseEvent e){
					botao.setBackground(Color.decode("#23dd3f"));
				}
			});

			tela.add(botao);

			tela.setVisible(true);
	}
}