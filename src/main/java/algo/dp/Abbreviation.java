package algo.dp;

import java.util.HashMap;
import java.util.Map;

public class Abbreviation {
	public static void main(String[] args) {
      String a="AbcDE";
      String b="ABDE";
      System.out.println(abbreviation(a, b));
      Map<String,String> maps= new HashMap<>();
	}
	public static String abbreviation(String a, String b) {
          String atemp=a.toUpperCase();
          String status ="YES";
          for(int i=0;i<b.length();i++){
        	  if(atemp.contains(String.valueOf(b.charAt(i))))
        		  continue;
        	  else
        	  {
        		  status="NO";
        	  }
          }
          return status;
            
	    }
	
}
