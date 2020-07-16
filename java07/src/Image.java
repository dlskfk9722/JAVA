import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("유럽 사진");
		JLabel l=new JLabel();//글자
		f.add(l);
		
		ImageIcon icon=new ImageIcon("e.jpg");//이미지
		l.setIcon(icon);
		
		f.setSize(500,500);
		f.setVisible(true);
	}

}
