package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio01 implements JFrameBaseInferface, JFrameButtonInterface {
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelIdade, jLabelApelido, jLabelPreco, jLabelDescricao, jLabelRaca;
    private JButton jButtonSalvar, jButtonCancelar;
    private JComboBox jComboBoxRaca;
    private JRadioButton jRadioButtonVivo, jRadioButtonMorto, jRadioButtonRacao, jRadioButtonComeAlmocosJantas;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado, jCheckBoxTemPedrigee;
    private JTextArea jTextAreaDescricao;
    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco;
    private ButtonGroup buttonGroupVida, buttonGroupAlimentacao;
    
    public Exercicio01(){
        gerarTela();
        instanciarComponentes();
       
        gerarDimensoes();
        gerarLocalizacoes();
        definirRadioParaButtonGroup();
        adicionarAcao(); 
        adicionarComponentes();
        jFrame.setVisible(true);
        
        
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(645, 445);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jLabelApelido);
        jFrame.add(jTextFieldApelido);
        jFrame.add(jLabelPreco);
        jFrame.add(jTextFieldPreco);
        jFrame.add(jLabelRaca);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonComeAlmocosJantas);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxTemPedrigee);
        jFrame.add(jLabelDescricao);
        jFrame.add(jTextAreaDescricao);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelApelido = new JLabel("Apelido");
        jLabelPreco = new JLabel("Preço");
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldApelido = new JTextField();
        jTextFieldPreco = new JTextField();
        jLabelRaca = new JLabel("Raça");
        jComboBoxRaca = new JComboBox();
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonComeAlmocosJantas = new JRadioButton("Come almoços, jantas");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxTemPedrigee = new JCheckBox("Tem pedigree");
        jLabelDescricao = new JLabel("Descrição");
        jTextAreaDescricao = new JTextArea();     
        buttonGroupVida = new ButtonGroup();
        buttonGroupAlimentacao = new ButtonGroup();
    }
    
    @Override
    public void definirRadioParaButtonGroup(){
        buttonGroupVida.add(jRadioButtonVivo); 
        buttonGroupVida.add(jRadioButtonMorto);
        buttonGroupAlimentacao.add(jRadioButtonRacao);
        buttonGroupAlimentacao.add(jRadioButtonComeAlmocosJantas);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(5, 10);
        jTextFieldNome.setLocation(10, 35);
        
        jLabelIdade.setLocation(410, 10);
        jTextFieldIdade.setLocation(410, 35);
        
        jLabelApelido.setLocation(205,65 );
        jTextFieldApelido.setLocation(205, 90);
        
        jLabelPreco.setLocation(410, 65);
        jTextFieldPreco.setLocation(410, 90);
        
        jLabelRaca.setLocation(10, 65);
        jComboBoxRaca.setLocation(10, 90);
        
        jButtonCancelar.setLocation(350, 335);
        jButtonSalvar.setLocation(495, 335);
        
        jRadioButtonVivo.setLocation(10, 140);
        jRadioButtonMorto.setLocation(10, 170);
        jRadioButtonRacao.setLocation(115, 140);
        jRadioButtonComeAlmocosJantas.setLocation(115, 170);
        
        jCheckBoxAdestrado.setLocation(360, 140);
        jCheckBoxCastrado.setLocation(490, 140);
        jCheckBoxVacinado.setLocation(360, 170);
        jCheckBoxTemPedrigee.setLocation(490, 170);
        
        jLabelDescricao.setLocation(10, 195);
        jTextAreaDescricao.setLocation(10, 225);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(70, 20);
        jTextFieldNome.setSize(370, 25);
        
        jLabelIdade.setSize(70, 20);
        jTextFieldIdade.setSize(210, 25);
        
        jLabelApelido.setSize(70, 20);
        jTextFieldApelido.setSize(175, 25);
        
        jLabelPreco.setSize(70, 20);
        jTextFieldPreco.setSize(210, 25);
        
        jLabelRaca.setSize(70, 20);
        jComboBoxRaca.setSize(160, 20);
        
        jButtonCancelar.setSize(130, 60);
        jButtonSalvar.setSize(125, 60);
        
        jRadioButtonVivo.setSize(70, 15);
        jRadioButtonMorto.setSize(70, 15 );
        jRadioButtonRacao.setSize(160,  15);
        jRadioButtonComeAlmocosJantas.setSize(160, 15);
        
        jCheckBoxAdestrado.setSize(120, 15);
        jCheckBoxCastrado.setSize(120, 15);
        jCheckBoxVacinado.setSize(120, 15);
        jCheckBoxTemPedrigee.setSize(120, 15);
        
        jLabelDescricao.setSize(70, 20);
        jTextAreaDescricao.setSize(610, 95);
        
    }

    @Override
    public void adicionarAcao() {
        jButtonCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                buttonGroupVida.clearSelection();
                buttonGroupAlimentacao.clearSelection();
            }
        });
    }

}
