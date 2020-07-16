package java17;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame {
	
	private JTextField input;
	JTextArea list;
	//ip,port
	//socket,packet
	//jtextarea,jtextfield
	
	public MessengerB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input = new JTextField();
		list = new JTextArea();
		
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data=input.getText();
				//엔터넣기
				list.append("me>>"+ data+"\n");
				//입력값 클리어
				input.setText("");
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data2=data.getBytes();
					InetAddress ip=InetAddress.getByName("127.0.0.1");
					
					//2.UDP패킷 필요
					DatagramPacket packet = new DatagramPacket(data2,data2.length,ip,6000);
					
					socket.send(packet);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 20));
		input.setBackground(new Color(255, 0, 255));
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(20);
		
		list.setEditable(false);
		list.setFont(new Font("Monospaced", Font.PLAIN, 20));
		list.setBackground(Color.PINK);
		list.setRows(10);
		list.setColumns(30);
		getContentPane().add(list, BorderLayout.CENTER);
		pack();
		
		setVisible(true);
		
	}
	
	public void process() throws IOException {//받는 기능만 수행
		while(true) {
			
			DatagramSocket socket = new DatagramSocket(6000);
			
			byte[] data=new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			
			socket.receive(packet);
			String data2=new String(data);
			list.append("you>>"+data2+"\n");
		}
	}

	public static void main(String[] args) throws Exception {
		MessengerB m = new MessengerB();
		m.process();
	
	}

}
