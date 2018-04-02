package view.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//시계패널 내부클래스 ////////////////////////////////////////
public class MsgClockPanel extends JPanel implements Runnable {
	int i = Calendar.getInstance().get(Calendar.AM_PM);
	String[] ampm = { "AM", "PM" };
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	String time = sdf.format(new Date());
	JLabel timelabel, ampmlabel;
	
	public MsgClockPanel() {
		this.setLayout(null);
		timelabel = new JLabel(time);
		timelabel.setBounds(0, 0, 100, 20);
		timelabel.setForeground(new Color(36, 205, 198));
		timelabel.setFont(new Font("굴림체", Font.BOLD, 12));

		ampmlabel = new JLabel(ampm[i]);
		ampmlabel.setBounds(15, 20, 100, 30);
		ampmlabel.setForeground(new Color(36, 205, 198));
		ampmlabel.setFont(new Font("굴림체", Font.BOLD, 12));

		add(timelabel, BorderLayout.NORTH);
		add(ampmlabel, BorderLayout.CENTER);
	}

	public void run() {
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time = sdf.format(new Date());
			timelabel.setText(time);
		} while (true);
	}
}
///////////////////////////////////////////////////////