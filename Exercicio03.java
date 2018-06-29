package ListaInterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio03 implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;

    public Exercicio03(){
        gerarTela(); instanciarComponentes();
        gerarDimensoes(); gerarLocalizacoes();
        adicionarComponentes(); acaoGerarTabuada();
        cofigurarJScrollPane(); jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(330, 450);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jLabelTabuada);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jTextAreaTabuada);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jTextFieldNumero = new JTextField();
        jLabelTabuada = new JLabel("Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();
        jButtonTabuada = new JButton("Gerar Tabuada");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 35);
        
        jLabelTabuada.setLocation(10, 85);
        jScrollPaneTabuada.setLocation(10, 110);
        
        jButtonTabuada.setLocation(110, 35);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(70, 20);
        jTextFieldNumero.setSize(85, 20);
        
        jLabelTabuada.setSize(70, 20);
        jScrollPaneTabuada.setSize(231, 260);
        
        jButtonTabuada.setSize(130, 20);
    }
    
    public void cofigurarJScrollPane(){
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(jScrollPaneTabuada.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(jScrollPaneTabuada.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }
    public void acaoGerarTabuada(){
        jButtonTabuada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite um número positivo");
                    jTextFieldNumero.requestFocus(); return;
                }
                short numero = 0;
                try{
                    numero = Short.parseShort(jTextFieldNumero.getText());
                    if(numero < 0){
                        JOptionPane.showMessageDialog(null, "Eu pedi um número positivo!");
                        jTextFieldNumero.requestFocus(); return;
                    }
                }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, "Somente números são aceitos");
                        jTextFieldNumero.requestFocus(); return;
                }
            }
            
        });
    }
    
}
