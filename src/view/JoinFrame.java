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
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;

public class JoinFrame extends JFrame {

   private JPanel contentPane;
   private JTextField inputId;
   private JPasswordField inputPw;
   private JPasswordField inputPw2;
   private JTextField inputName;
   private JTextField phoneNumber;

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               JoinFrame frame = new JoinFrame();
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
   public JoinFrame() {
      setTitle("회원가입");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 459, 365);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      GridBagLayout gbl_contentPane = new GridBagLayout();
      gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
      contentPane.setLayout(gbl_contentPane);
      
      JLabel lblNewLabel = new JLabel("아이디");
      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
      gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel.gridx = 3;
      gbc_lblNewLabel.gridy = 1;
      contentPane.add(lblNewLabel, gbc_lblNewLabel);
      
      inputId = new JTextField();
      GridBagConstraints gbc_inputId = new GridBagConstraints();
      gbc_inputId.gridwidth = 4;
      gbc_inputId.fill = GridBagConstraints.HORIZONTAL;
      gbc_inputId.insets = new Insets(0, 0, 5, 5);
      gbc_inputId.gridx = 4;
      gbc_inputId.gridy = 1;
      contentPane.add(inputId, gbc_inputId);
      inputId.setColumns(10);
      
      JButton idCheckBtn = new JButton("중복확인");
      GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
      gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
      gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
      gbc_btnNewButton_1.gridx = 8;
      gbc_btnNewButton_1.gridy = 1;
      contentPane.add(idCheckBtn, gbc_btnNewButton_1);
      
      JLabel lblNewLabel_1 = new JLabel("비밀번호");
      GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
      gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel_1.gridx = 3;
      gbc_lblNewLabel_1.gridy = 2;
      contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
      
      inputPw = new JPasswordField();
      GridBagConstraints gbc_inputPw = new GridBagConstraints();
      gbc_inputPw.gridwidth = 4;
      gbc_inputPw.fill = GridBagConstraints.HORIZONTAL;
      gbc_inputPw.insets = new Insets(0, 0, 5, 5);
      gbc_inputPw.gridx = 4;
      gbc_inputPw.gridy = 2;
      contentPane.add(inputPw, gbc_inputPw);
      
      JLabel lblNewLabel_2 = new JLabel("비밀번호확인");
      GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
      gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel_2.gridx = 3;
      gbc_lblNewLabel_2.gridy = 3;
      contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
      
      inputPw2 = new JPasswordField();
      GridBagConstraints gbc_inputPw2 = new GridBagConstraints();
      gbc_inputPw2.gridwidth = 4;
      gbc_inputPw2.fill = GridBagConstraints.HORIZONTAL;
      gbc_inputPw2.insets = new Insets(0, 0, 5, 5);
      gbc_inputPw2.gridx = 4;
      gbc_inputPw2.gridy = 3;
      contentPane.add(inputPw2, gbc_inputPw2);
      
      JLabel label = new JLabel("이름");
      GridBagConstraints gbc_label = new GridBagConstraints();
      gbc_label.anchor = GridBagConstraints.EAST;
      gbc_label.insets = new Insets(0, 0, 5, 5);
      gbc_label.gridx = 3;
      gbc_label.gridy = 4;
      contentPane.add(label, gbc_label);
      
      inputName = new JTextField();
      GridBagConstraints gbc_inputName = new GridBagConstraints();
      gbc_inputName.gridwidth = 4;
      gbc_inputName.fill = GridBagConstraints.HORIZONTAL;
      gbc_inputName.insets = new Insets(0, 0, 5, 5);
      gbc_inputName.gridx = 4;
      gbc_inputName.gridy = 4;
      contentPane.add(inputName, gbc_inputName);
      inputName.setColumns(10);
      
      JLabel label_1 = new JLabel("나이");
      GridBagConstraints gbc_label_1 = new GridBagConstraints();
      gbc_label_1.anchor = GridBagConstraints.EAST;
      gbc_label_1.insets = new Insets(0, 0, 5, 5);
      gbc_label_1.gridx = 3;
      gbc_label_1.gridy = 5;
      contentPane.add(label_1, gbc_label_1);
      
      JSpinner inputAge = new JSpinner();
      GridBagConstraints gbc_inputAge = new GridBagConstraints();
      gbc_inputAge.gridwidth = 4;
      gbc_inputAge.fill = GridBagConstraints.HORIZONTAL;
      gbc_inputAge.insets = new Insets(0, 0, 5, 5);
      gbc_inputAge.gridx = 4;
      gbc_inputAge.gridy = 5;
      contentPane.add(inputAge, gbc_inputAge);
      
      JLabel lblNewLabel_3 = new JLabel("핸드폰번호");
      GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
      gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
      gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
      gbc_lblNewLabel_3.gridx = 3;
      gbc_lblNewLabel_3.gridy = 6;
      contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
      
      phoneNumber = new JTextField();
      GridBagConstraints gbc_phoneNumber = new GridBagConstraints();
      gbc_phoneNumber.gridwidth = 4;
      gbc_phoneNumber.fill = GridBagConstraints.HORIZONTAL;
      gbc_phoneNumber.insets = new Insets(0, 0, 5, 5);
      gbc_phoneNumber.gridx = 4;
      gbc_phoneNumber.gridy = 6;
      contentPane.add(phoneNumber, gbc_phoneNumber);
      phoneNumber.setColumns(10);
      
      JTextPane textPane = new JTextPane();
      textPane.setFont(new Font("굴림체", Font.PLAIN, 11));
      textPane.setText("(-을 제외하고 입력해주세요.)");
      GridBagConstraints gbc_textPane = new GridBagConstraints();
      gbc_textPane.gridwidth = 5;
      gbc_textPane.insets = new Insets(0, 0, 5, 5);
      gbc_textPane.fill = GridBagConstraints.BOTH;
      gbc_textPane.gridx = 4;
      gbc_textPane.gridy = 7;
      contentPane.add(textPane, gbc_textPane);
      
      JButton joinBtn = new JButton("가입하기");
      GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
      gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
      gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
      gbc_btnNewButton.gridx = 5;
      gbc_btnNewButton.gridy = 8;
      contentPane.add(joinBtn, gbc_btnNewButton);
      
      setVisible(true);
   }

}