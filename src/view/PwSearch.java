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

public class PwSearch extends JFrame {

   private JPanel contentPane;
   private JTextField inputId;
   private JTextField inputName;

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               PwSeach frame = new PwSeach();
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
   public PwSearch() {
      setTitle("비밀번호찾기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      GridBagLayout gbl_contentPane = new GridBagLayout();
      gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      contentPane.setLayout(gbl_contentPane);
      
      JLabel id = new JLabel("아이디");
      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
      gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel.gridx = 4;
      gbc_lblNewLabel.gridy = 2;
      contentPane.add(id, gbc_lblNewLabel);
      
      inputId = new JTextField();
      GridBagConstraints gbc_textField = new GridBagConstraints();
      gbc_textField.anchor = GridBagConstraints.WEST;
      gbc_textField.insets = new Insets(0, 0, 5, 0);
      gbc_textField.gridx = 6;
      gbc_textField.gridy = 2;
      contentPane.add(inputId, gbc_textField);
      inputId.setColumns(10);
      
      JLabel name = new JLabel("이름");
      GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
      gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel_1.gridx = 4;
      gbc_lblNewLabel_1.gridy = 3;
      contentPane.add(name, gbc_lblNewLabel_1);
      
      inputName = new JTextField();
      GridBagConstraints gbc_textField_1 = new GridBagConstraints();
      gbc_textField_1.anchor = GridBagConstraints.WEST;
      gbc_textField_1.insets = new Insets(0, 0, 5, 0);
      gbc_textField_1.gridx = 6;
      gbc_textField_1.gridy = 3;
      contentPane.add(inputName, gbc_textField_1);
      inputName.setColumns(10);
      
      JButton searchBtn = new JButton("찾기");
      GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
      gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
      gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
      gbc_btnNewButton.gridx = 6;
      gbc_btnNewButton.gridy = 5;
      contentPane.add(searchBtn, gbc_btnNewButton);
      
      setVisible(true);
   }

}