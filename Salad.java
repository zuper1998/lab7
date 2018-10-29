package lab7;

import java.security.cert.CertificateFactorySpi;

public class Salad {

	public Salad() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String boi = caesarCode("zyzzaaai", 'K');
		System.out.println(boi);
		
		CaesarFrame f1 = new CaesarFrame();
		f1.setVisible(true);
	}

	
	
	
	
	private static String caesarCode(String input, char offset){
		String knife_salad="";
		 offset =(char) (offset-'A');	
		 if (!input.equals(input.toUpperCase())){
			knife_salad = input.toUpperCase();
		}else {
			knife_salad = input;
		}
		char[] not_baguet= knife_salad.toCharArray();
		for (int i = 0;i<knife_salad.length();i++){
			int alma = not_baguet[i]+offset;
			if (alma> 'Z'){
				not_baguet[i]+=  offset+'A'-'Z';

			}else{
			
			not_baguet[i]+= offset;
			}
			
		}
		
		knife_salad=new String(not_baguet);
		
		
		
		
		return knife_salad;
	}

}
