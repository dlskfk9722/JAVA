import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("���� ����");
		JLabel l=new JLabel();//����
		f.add(l);
		
		ImageIcon icon=new ImageIcon("e.jpg");//�̹���
		l.setIcon(icon);
		
		f.setSize(500,500);
		f.setVisible(true);
	}

}
