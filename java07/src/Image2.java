import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image2 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("유럽 사진2");
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		JButton button=new JButton();
		ImageIcon icon=new ImageIcon("e.jpg");//이미지
		button.setIcon(icon);
		f.add(button);
		
		
		
		
		f.setSize(800,800);
		f.setVisible(true);
	}

}
