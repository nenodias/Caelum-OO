package view;

import java.awt.Color;
import java.awt.Event;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Tela {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Caelum - isso é uma Tela");
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setSize(400, 200);

        JButton botao = new JButton("OK");
//           botao.setBackground(Color.white);
//           botao.setAlignmentX(100.0f);
//           botao.setAlignmentY(50.0f);
//           botao.setSize(100, 50);
//           botao.setVisible(true);

        panel.add(botao);

        JLabel rotulo = new JLabel();
        rotulo.setText(" Nome : ");
        panel.add(rotulo);

        JTextField textField = new JTextField(40);
//            textField.setColumns(40);
//            textField.setSize(100, 200);
//            textField.setText("Vish");
        panel.add(textField);

        JTextArea textArea = new JTextArea(10, 20);
        panel.add(textArea);

        JCheckBox checkBox1 = new JCheckBox(" Rafael Cosentino ");
        JCheckBox checkBox2 = new JCheckBox(" Jonas Hirata ");
        JCheckBox checkBox3 = new JCheckBox(" Marcelo Martins ");

        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);


        String[] items = new String[3];
        items[0] = " Rafael Cosentino ";
        items[1] = " Jonas Hirata ";
        items[2] = " Marcelo Martins ";

        JComboBox comboBox = new JComboBox(items);
        panel.add(comboBox);


        frame.setContentPane(panel);

//            frame . pack () ;
        frame.setVisible(true);

//           Evento quando clicar no X de sair do Frame
//            DO_NOTHING_ON_CLOSE: Não faz nada.
//            HIDE_ON_CLOSE: Esconde a janela (Padrão no JFrame).
//            DISPOSE_ON_CLOSE: Fecha a janela (Mais utilizado em janelas internas).
//            EXIT_ON_CLOSE: Fecha a aplicação (System.exit(0)).

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Faz sair da aplicação

        frame.setVisible(true);
    }
}
