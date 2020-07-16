package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class RockPlay {
	private static JTextField intro;
	private static JTextField result;
	
	static int s=0,r=1,p=2;
	static int count=0;
	static int mewin=0;
	static int computerwin=0;
	static int nowin=0;
	

	public static void main(String[] args) {
		//1.화면
		//2.액션 처리
		
		
		
		JFrame f=new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\s.png"));
		f.setTitle("가위바위보게임");
		f.setSize(800,500);
		
		intro = new JTextField();
		intro.setFont(new Font("굴림", Font.BOLD, 18));
		intro.setText("가위바위보 게임을 시작합니다. 원하는 버튼을 눌러주세요.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);
		
		result = new JTextField();
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 19));
		result.setText("아직 게임 시작전입니다.");
		f.getContentPane().add(result, BorderLayout.SOUTH);
		result.setColumns(10);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("가위 바위 보 게임(총 게임 횟수: "+count+"회)");
			
				System.out.println("가위를 선택하셨군요.");
				int me=0;//가위
				Random random=new Random();
				int computer= random.nextInt(3);
				
				if(computer==me) {//컴퓨터와 내가 가위를 냄
					result.setText("무승부");
					nowin++;
				}else if(computer==r)//컴퓨터가 바위를 냄
					{
					result.setText("컴퓨터가 승리");
					computerwin++;
				
				
			}else {
				result.setText("내가 승리");
				mewin++;
				
			}
				intro.setText("내가 승리한 횟수: "+mewin+", 컴퓨터가 승리한 횟수: "+computerwin+", 무승부 횟수: "+nowin);
				}
			});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\s.png"));
		btnNewButton.setBackground(Color.ORANGE);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("가위 바위 보 게임(총 게임 횟수: "+count+"회)");
				
				System.out.println("바위를 선택하셨군요.");
				int me=0;//가위
				Random random=new Random();
				int computer= random.nextInt(3);
				
				if(computer==me) {
					result.setText("무승부");
					nowin++;
				}else if(computer==p)//
					{
					result.setText("컴퓨터가 승리");
					computerwin++;
				
				
			}else {
				result.setText("내가승리");
				mewin++;
				
			}
				intro.setText("내가 승리한 횟수: "+mewin+", 컴퓨터가 승리한 횟수: "+computerwin+", 무승부 횟수: "+nowin);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\r.png"));
		btnNewButton_1.setBackground(Color.PINK);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("가위 바위 보 게임(총 게임 횟수: "+count+"회)");
				System.out.println("보를 선택하셨군요.");
				int me=0;
				Random random=new Random();
				int computer= random.nextInt(3);
				
				
				if(computer==me) {
					result.setText("무승부");
					nowin++;
				}else if(computer==r)
					{
					result.setText("컵퓨터가 승리");
					computerwin++;
				
				
			}else {
				result.setText("내가 승리");
				mewin++;
				
			}
				intro.setText("내가 승리한 횟수: "+mewin+", 컴퓨터가 승리한 횟수: "+computerwin+", 무승부 횟수: "+nowin);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\p.png"));
		btnNewButton_2.setBackground(Color.RED);
		panel.add(btnNewButton_2);
		
		f.setVisible(true);

	}

}
