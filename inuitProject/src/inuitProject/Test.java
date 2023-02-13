package inuitProject;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
	

	    
			CSVWriter writer = new CSVWriter(new FileWriter("output.csv"));
		
		
    String email="vali101";
    String username = "test_iamtestpass_user_101";
    
    int i=1;
    do {
    String username1 = "test_iamtestpass_user_" + (Integer.parseInt(username.substring(22,username.length()))+i);
    //System.out.println(username1);

	 writer.write(username1);
    String username2 = "vali" + (Integer.parseInt(email.substring(4,email.length()))+i+"@gmail.com");
    //System.out.println(username2);
    i++;
		}
    while(i<10);
	     
}
}