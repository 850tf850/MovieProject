package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class IdSearch extends JFrame {

   private JPanel contentPane;
   private JTextField inputName;
   private JTextField inputPone;

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               IdSearch frame = new IdSearch();
//               frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   /**
    * Create the frame.
    */
   public IdSearch() {
      setTitle("아이디찾기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      GridBagLayout gbl_contentPane = new GridBagLayout();
      gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
      gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      contentPane.setLayout(gbl_contentPane);
      
      JLabel name = new JLabel("이름");
      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
      gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel.gridx = 3;
      gbc_lblNewLabel.gridy = 2;
      contentPane.add(name, gbc_lblNewLabel);
      
      inputName = new JTextField();
      GridBagConstraints gbc_textField = new GridBagConstraints();
      gbc_textField.insets = new Insets(0, 0, 5, 5);
      gbc_textField.fill = GridBagConstraints.HORIZONTAL;
      gbc_textField.gridx = 5;
      gbc_textField.gridy = 2;
      contentPane.add(inputName, gbc_textField);
      inputName.setColumns(10);
      
      JLabel phoneNumber = new JLabel("휴대폰번호");
      GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
      gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel_1.gridx = 3;
      gbc_lblNewLabel_1.gridy = 3;
      contentPane.add(phoneNumber, gbc_lblNewLabel_1);
      
      inputPone = new JTextField();
      GridBagConstraints gbc_textField_1 = new GridBagConstraints();
      gbc_textField_1.insets = new Insets(0, 0, 5, 5);
      gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
      gbc_textField_1.gridx = 5;
      gbc_textField_1.gridy = 3;
      contentPane.add(inputPone, gbc_textField_1);
      inputPone.setColumns(10);
      
      JButton button = new JButton("찾기");
      GridBagConstraints gbc_button = new GridBagConstraints();
      gbc_button.fill = GridBagConstraints.HORIZONTAL;
      gbc_button.insets = new Insets(0, 0, 5, 5);
      gbc_button.gridx = 5;
      gbc_button.gridy = 5;
      contentPane.add(button, gbc_button);
      
      setVisible(true);
   }

}