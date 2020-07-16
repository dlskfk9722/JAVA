package construct;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {
	static String oriId="root";
	static String oriPw="1234";
	
	public static void main(String[] args) {
		JFrame f=new JFrame("나의 생성자 프레임");
		
		//1.레이아웃 변경:FlowLayout
		FlowLayout flow=new FlowLayout();
		f.getContentPane().setLayout(flow);
		//2.레이블 생성->프레임에 add
		JLabel label=new JLabel();
		//3.이미지 생성->레이블에 add
		ImageIcon icon=new ImageIcon("diary.PNG");
		label.setIcon(icon);
		//4.id/pw 생성->프레임에 add
		JLabel id=new JLabel("ID입력: ");
		JLabel pw=new JLabel("PW입력: ");
		JTextField idText=new JTextField(10);
		JTextField pwText=new JTextField(10);
		
		f.getContentPane().add(label);
		f.getContentPane().add(id);
		f.getContentPane().add(idText);
		f.getContentPane().add(pw);
		f.getContentPane().add(pwText);
		//5.버튼 생성->프레임에 add
		JButton button=new JButton("로그인 처리");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId=idText.getText();
				String inputPW=pwText.getText();
				if(inputId.equals(oriId)&&inputPW.equals(oriPw)) {
					System.out.println("로그인 ok");
					Diary diary=new Diary();
				}else {
					System.out.println("로그인 fail");
				}
				
			}
		});
		f.getContentPane().add(button);
		f.setSize(450,450);
		f.setVisible(true);
	}

}
