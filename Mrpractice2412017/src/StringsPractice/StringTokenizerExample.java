package StringsPractice;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		StringTokenizer st=new StringTokenizer("MY NAME IS prakazz"," ");
		StringTokenizer st1=new StringTokenizer("MY.NAME.IS.prakazz",".");
		//System.out.println(st.nextToken(" "));
		//System.out.println(st1.nextToken("."));

		while(st.hasMoreTokens()){
			
			System.out.println(st.nextToken());
			
		}
while(st1.hasMoreTokens()){
			
			System.out.println(st1.nextToken());
			
		}
	
	}

}
