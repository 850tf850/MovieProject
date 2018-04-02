package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField inputId;
	private JPasswordField inputPw;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginFrame frame = new LoginFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{111, 0, 48, 0, 41, 116, 0};
		gbl_contentPane.rowHeights = new int[]{65, 21, 21, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel label = new JLabel("아이디");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		inputId = new JTextField();
		GridBagConstraints gbc_inputId = new GridBagConstraints();
		gbc_inputId.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputId.gridwidth = 3;
		gbc_inputId.anchor = GridBagConstraints.NORTH;
		gbc_inputId.insets = new Insets(0, 0, 5, 5);
		gbc_inputId.gridx = 2;
		gbc_inputId.gridy = 1;
		contentPane.add(inputId, gbc_inputId);
		inputId.setColumns(10);
		
		JLabel label_1 = new JLabel("비밀번호");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		contentPane.add(label_1, gbc_label_1);
		
		inputPw = new JPasswordField();
		GridBagConstraints gbc_inputPw = new GridBagConstraints();
		gbc_inputPw.gridwidth = 3;
		gbc_inputPw.insets = new Insets(0, 0, 5, 5);
		gbc_inputPw.anchor = GridBagConstraints.NORTH;
		gbc_inputPw.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputPw.gridx = 2;
		gbc_inputPw.gridy = 2;
		contentPane.add(inputPw, gbc_inputPw);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setBackground(Color.WHITE);
		GridBagConstraints gbc_loginBtn = new GridBagConstraints();
		gbc_loginBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginBtn.insets = new Insets(0, 0, 5, 5);
		gbc_loginBtn.gridx = 2;
		gbc_loginBtn.gridy = 4;
		contentPane.add(loginBtn, gbc_loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setBackground(Color.WHITE);
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JoinFrame joinFrame = new JoinFrame();
			}
		});
		GridBagConstraints gbc_joinBtn = new GridBagConstraints();
		gbc_joinBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_joinBtn.insets = new Insets(0, 0, 5, 5);
		gbc_joinBtn.gridx = 4;
		gbc_joinBtn.gridy = 4;
		contentPane.add(joinBtn, gbc_joinBtn);
		
		JButton idSearch = new JButton("아이디찾기");
		idSearch.setBorderPainted(false);
		idSearch.setContentAreaFilled(false);
		idSearch.setFocusPainted(false);
		idSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IdSearch idSearch = new IdSearch();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 6;
		contentPane.add(idSearch, gbc_btnNewButton);
		
		
		JLabel label_2 = new JLabel("/");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 6;
		contentPane.add(label_2, gbc_label_2);
		
		JButton pwSearch = new JButton("비밀번호찾기");
		pwSearch.setBorderPainted(false);
		pwSearch.setContentAreaFilled(false);
		pwSearch.setFocusPainted(false);
		pwSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PwSearch pwSearch = new PwSearch();
			}
		});
		GridBagConstraints gbc_btnNewButton21 = new GridBagConstraints();
		gbc_btnNewButton21.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton21.gridx = 4;
		gbc_btnNewButton21.gridy = 6;
		contentPane.add(pwSearch, gbc_btnNewButton21);
		
		setVisible(true);
	}

}
