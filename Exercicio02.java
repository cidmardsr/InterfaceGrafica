package ListaInterfaceGrafica;

import exemplo10.ExemploHospitalJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio02 implements JFrameBaseInterface{

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonGerarTabuada;
    
    public Exercicio02(){
        gerarTela(); instanciarComponentes();
        gerarDimensoes(); gerarLocalizacoes();
        adicionarComponentes(); acaoBotao();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonGerarTabuada);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonGerarTabuada = new JButton("Gerar Tabuada");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 35);
        jButtonGerarTabuada.setLocation(10, 75);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(70, 20);
        jTextFieldNumero.setSize(175, 25);
        jButtonGerarTabuada.setSize(120, 45);
    }
    
    public void acaoBotao(){
        jButtonGerarTabuada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Insira um número");
                    jTextFieldNumero.requestFocus(); return;
                }
                int numero =0;
                
                try{
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                    if(numero < 0){
                        JOptionPane.showMessageDialog(null, 
                                "Insira um número positivo");
                        jTextFieldNumero.requestFocus(); return;
                        
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, 
                            "Por gentileza, insira somente números");
                        jTextFieldNumero.requestFocus(); return;
                }
                int resultado = numero * 50;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                jTextFieldNumero.requestFocus(); return;
               
            }
               
            
        });
        
    }
    
}
