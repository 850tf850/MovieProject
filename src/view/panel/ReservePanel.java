package view.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.toedter.calendar.JCalendar;

import view.MainFrame;

public class ReservePanel  extends JPanel {
	JButton loginBtn, mypageBtn, leftBtn, rightBtn, preBtn, nextBtn, seatSelectBtn;
	
	JLabel posterLb, areaLb, dateLb, timeLb;
	JRadioButton[] areaListRbtn = new JRadioButton[2];
	ButtonGroup radioBtnGrp;
	String[] timeList = {"07:00", "09:00", "12:00", "15:00", "18:00", "20:00", "22:00"};
	JComboBox<String> timeCombo;
	JCalendar calendar;
	
	MainFrame mainFrame;
	
	public ReservePanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		//버튼
		loginBtn = new JButton(new ImageIcon("img/login3.png"));
		loginBtn.setBounds(0,0,100,50);
	
		mypageBtn = new JButton(new ImageIcon("img/mypage3.png"));
		mypageBtn.setBounds(1100, 0, 100, 50);
		
		leftBtn = new JButton(new ImageIcon("img/left3.png"));
		leftBtn.setBounds(0, 70, 100, 50);
		
		rightBtn = new JButton(new ImageIcon("img/right3.png"));
		rightBtn.setBounds(130,70,100,50);
		
		preBtn = new JButton(new ImageIcon("img/이전3.png"));
		preBtn.setBounds(900, 600, 100, 50);
		
		
		nextBtn = new JButton(new ImageIcon("img/다음3.png"));
		nextBtn.setBounds(1100,600, 100, 50);
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result;
				result = JOptionPane.showConfirmDialog(null,"xx영화관에 xx시에 xx명 xx좌석에 예매합니다. 결제하겠습니까?","결제창",
						JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				if(result == 0) {
					JOptionPane.showMessageDialog(null, "예매번호 xxxxxx으로 예매 완료되었습니다. 감사");
					System.out.println("예매완료");
				} else if(result == 1) {
					System.out.println("취소됨");
				}
			
			}
		});
		
		seatSelectBtn = new JButton(new ImageIcon("img/좌석선택3.png"));
		seatSelectBtn.setBounds(1100, 450, 100, 50);
		
		//영화 포스터
		ImageIcon originIcon = new ImageIcon("img/movie1.jpg");
		Image originImg = originIcon.getImage();
		Image reSizeImg = originImg.getScaledInstance(230, 400, Image.SCALE_SMOOTH);
		ImageIcon reSizeIcon = new ImageIcon(reSizeImg);
		posterLb = new JLabel(reSizeIcon, JLabel.CENTER);
		posterLb.setBounds(0,125,230, 400);
		
		//라벨들
		areaLb = new JLabel(new ImageIcon("img/지역3.png"));
		areaLb.setBounds(330,70,100,50);
		
		dateLb = new JLabel(new ImageIcon("img/날짜3.png"));
		dateLb.setBounds(330, 220, 100, 50);
		
		timeLb = new JLabel(new ImageIcon("img/시간3.png"));
		timeLb.setBounds(750, 220, 100, 50);
		
		//지역리스트 라디오버튼
		areaListRbtn[0] = new JRadioButton("서울");
		areaListRbtn[0].setForeground(new Color(36, 205, 198));
		areaListRbtn[0].setFont(new Font("굴림체", Font.BOLD, 18));
		areaListRbtn[0].setBounds(350,140, 100, 50);
		areaListRbtn[0].setBorderPainted(false);  //투명
		areaListRbtn[0].setFocusPainted(false);
		areaListRbtn[0].setContentAreaFilled(false);
		areaListRbtn[1] = new JRadioButton("부산");
		areaListRbtn[1].setForeground(new Color(36, 205, 198));
		areaListRbtn[1].setFont(new Font("굴림체", Font.BOLD, 18));
		areaListRbtn[1].setBounds(460, 140, 100, 50);
		areaListRbtn[1].setBorderPainted(false);  //투명
		areaListRbtn[1].setFocusPainted(false);
		areaListRbtn[1].setContentAreaFilled(false);
		radioBtnGrp = new ButtonGroup();
		radioBtnGrp.add(areaListRbtn[0]);
		radioBtnGrp.add(areaListRbtn[1]);
		
		//시간선택 콤보박스
		timeCombo = new JComboBox<String>(timeList);
		timeCombo.setBounds(770, 280, 250, 40);
		timeCombo.setBackground(new Color(36,205,198));
		
		//달력 
		calendar = new JCalendar();
		calendar.setBounds(340, 280, 350,300);

		
		//add
		add(loginBtn);
		add(mypageBtn);
		add(leftBtn);
		add(rightBtn);
		add(seatSelectBtn);
		add(preBtn);
		add(nextBtn);
		add(posterLb);
		add(areaLb);
		add(dateLb);
		add(timeLb);
		add(areaListRbtn[0]);
		add(areaListRbtn[1]);
		add(timeCombo);
		add(calendar);
		
		//event
		seatSelectBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        mainFrame.getMain().mainframeTOseatselectframe(mainFrame);
		    }
		});
		
		loginBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        mainFrame.getMain().mainframeTOloginframe(mainFrame);
		    }
		});
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
