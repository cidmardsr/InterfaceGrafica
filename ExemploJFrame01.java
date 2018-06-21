import javax.swing.JFrame;


public class ExemploJFrame01{
	
	public static void main(String[] args){
	// cria uma tela
	JFrame tela = new JFrame();

	// define o taamanho da tela
	// width ↔ , height ↕
	tela.setSize(500,500);

	// diz que o layout é nulo
	tela.setLayout(null);

	// passando nulo ele centraliza a janela
	tela.setLocationRelativeTo(null);


	// diz que quando o usuario fechar a aplicação
	// irá encerrar o aplicativo
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// define o título da janela
	tela.setTitle("HELLO WORLD");

	// import java.awt.Color;
	//getContentPane().setBackground(Color.red)
	tela.getContentPane().setBackground(
		Color.decode("#b3fc2a"));
	
	// apresenta a janela
	tela.setVisible(true);
	}
}