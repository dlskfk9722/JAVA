package java14;

import java.util.HashMap;

public class HashMapTest2 {

	public static void main(String[] args) {
		HashMap phn = new HashMap();
		phn.put("1번", "엄마");
		phn.put("2번", "아빠");
		phn.put("3번", "친구");
		phn.put("4번", "동생");
		System.out.println("휴대폰 2번은 누구?"+phn.get("2번"));
	}

}
