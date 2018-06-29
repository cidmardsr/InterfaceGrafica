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
public class Exercicio01 implements JFrameBaseInterface{

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;
    
    public Exercicio01(){
        gerarTela(); instanciarComponentes();
        gerarDimensoes(); gerarLocalizacoes();
        adicionarComponentes(); acaoBotaoConcatenar();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 400);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jTextFieldNome.setLocation(10, 35);
        
        jLabelSobrenome.setLocation(10, 85);
        jTextFieldSobrenome.setLocation(10, 110);
        
        jButtonConcatenar.setLocation(180, 180);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(70, 20);
        jTextFieldNome.setSize(465, 20);
        
        jLabelSobrenome.setSize(70, 20);
        jTextFieldSobrenome.setSize(465, 20);
        
        jButtonConcatenar.setSize(120, 70);
    }
    
    public void acaoBotaoConcatenar(){
        jButtonConcatenar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(jTextFieldNome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Informe um nome");
                    jTextFieldNome.requestFocus(); return;
                }
                if(jTextFieldSobrenome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Informe um sobrenome");
                    jTextFieldSobrenome.requestFocus(); return;
                }
                
                String nome = jTextFieldNome.getText().trim();
                String sobrenome = jTextFieldSobrenome.getText().trim();
                JOptionPane.showMessageDialog(null, 
                        "Nome completo: " + nome+ " " + sobrenome);
            }
        });
    }
    
}
