package java17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DomainToIp {

	public static void main(String[] args) throws UnknownHostException {
		//도메인 네임-->ip(도메인 네임 서버)
		String domain="www.naver.com";
		
		//1.ip를 알아내야함=>class필요.
		InetAddress address=InetAddress.getByName(domain);
		System.out.println(address);

	}

}
