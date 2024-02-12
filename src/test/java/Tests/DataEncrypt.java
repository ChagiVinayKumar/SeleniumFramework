package Tests;

import java.util.Base64;

public class DataEncrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Two ways to encode the text
		String str ="SimpleText";
		byte[] encodedbyte = Base64.getEncoder().encode(str.getBytes());
		String encodedString = new String(encodedbyte);
		System.out.println(encodedString);
		
		String mainformat = Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println(mainformat);
		
		byte[] decodedbyte = Base64.getDecoder().decode(encodedString.getBytes());
		String Decodedtext = new String(decodedbyte);
		System.out.println(Decodedtext);
			
	}

}
