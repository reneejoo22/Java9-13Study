//11-9

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JTextAreaEx extends JFrame{

	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	public JTextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 엔터 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {	//엔터키를 입력하면 action이벤트 발생
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				t.setText("");
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEx();
	}

}
