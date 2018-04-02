package view.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatPanel extends JPanel {
	JLabel adultLb, childLb;
	String[] peopleNum = {"1명","2명","3명","4명"}; 
	JComboBox<String> adultNum, childNum;
	JButton[] seatsBtn = new JButton[28];
	
	public SeatPanel() {
		// 성인, 아동 라벨
		adultLb = new JLabel(new ImageIcon("img/성인3.png"));
		adultLb.setBounds(580, 0, 100, 50);
		childLb = new JLabel(new ImageIcon("img/아동3.png"));
		childLb.setBounds(930, 0, 100, 50);
		
		// 성인, 아동 콤보박스
		adultNum = new JComboBox<String>(peopleNum);
		adultNum.setBounds(690, 5, 200, 40);
		adultNum.setBackground(new Color(36,205,198));
		childNum = new JComboBox<String>(peopleNum);
		childNum.setBounds(1040, 5, 200, 40);
		childNum.setBackground(new Color(36,205,198));
		
		//좌석 생성
		char path = 'A';
		int xPos = 200;
		int yPos = 120;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 7; j++) {
				seatsBtn[(i-1)*7+(j-1)] = new JButton(new ImageIcon("img/"+path+j+".png"));
				seatsBtn[(i-1)*7+(j-1)].setText(""+path+j);
				seatsBtn[(i-1)*7+(j-1)].setBounds(xPos,yPos,90,90);
				xPos+=110;
			}
			path++;
			xPos = 200;
			yPos += 100;
		}
		
		//add
		add(adultLb);
		add(childLb);
		add(adultNum);
		add(childNum);
		for(int i = 0; i < seatsBtn.length; i++) {
			add(seatsBtn[i]);
			seatsBtn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton temp = (JButton)e.getSource();
					System.out.println("누른 좌석 : "+ temp.getText());
					temp.setIcon(null);
					temp.setBackground(new Color(36,205,198));
				}
			});
		}
		
	}
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
