package ListaInterfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio05 implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JLabel jLabelNumero01, jLabelNumero02, jLabelResultado;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    
    public Exercicio05(){
        gerarTela(); instanciarComponentes();
        gerarDimensoes(); gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero01);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jTextAreaResultado);
        jFrame.add(jScrollPaneResultado);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero01 = new JLabel("Número 01");
        jTextFieldNumero01 = new JTextField();
        jLabelNumero02 = new JLabel("Número 02");
        jTextFieldNumero02 = new JTextField();
        jLabelResultado = new JLabel("Resultado");
        jTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane();
        jButtonSomar = new JButton("Somar");
        jButtonSubtrair = new JButton("Subtrair");
        jButtonMultiplicar = new JButton("Multiplicar");
        jButtonDividir = new JButton("Dividir");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(10, 10);
        jTextFieldNumero01.setLocation(10, 35);
        
        jLabelNumero02.setLocation(10, 60);
        jTextFieldNumero02.setLocation(10, 85);
        
        jLabelResultado.setLocation(10, 110);
        jScrollPaneResultado.setLocation(300, 250);
        
        jButtonSomar.setLocation(10, 250);
    }

    @Override
    public void gerarDimensoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
