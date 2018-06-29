package ListaInterfaceGrafica;

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
public class Exercicio04 implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;
    
    public Exercicio04(){
        gerarTela(); instanciarComponentes();
        gerarDimensoes(); gerarLocalizacoes();
        adicionarComponentes(); acaoBotaoVerificar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(250, 250);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 35);
        
        jButtonVerificar.setLocation(10, 70);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(70, 20);
        jTextFieldNumero.setSize(65, 25);
        
        jButtonVerificar.setSize(85, 45);
    }
    public void acaoBotaoVerificar(){
        jButtonVerificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               if(jTextFieldNumero.getText().trim().isEmpty()){
                   JOptionPane.showMessageDialog(null, 
                           "Digite um número");
                   jTextFieldNumero.requestFocus(); return;
               }
                
               try{
                  int numero = Integer.parseInt(jTextFieldNumero.getText().trim());
              if(numero == 0){
                  JOptionPane.showMessageDialog(null, numero + " é um número neutro");
              }
              if(numero %2==0 && numero > 0){
                  JOptionPane.showMessageDialog(null, numero + " é um número par e positivo");
              }
              if(numero %2!=0 && numero > 0){
                  JOptionPane.showMessageDialog(null, numero + " é um número impar e positivo");
              }
              if(numero %2==0 && numero < 0){
                  JOptionPane.showMessageDialog(null, numero + " é um número par e negativo");
              }
              if(numero %2!=0 && numero < 0){
                  JOptionPane.showMessageDialog(null, numero + " é um número impar e negativo");
              }
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(null, "Digite apenas números");
                   jTextFieldNumero.requestFocus(); return;
                   
               }
             
            }
            
        });
    }
}
