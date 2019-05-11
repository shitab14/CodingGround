package anagramfinder;
import java.util.Scanner;

public class AnagramFinder {
	

	  public static void main(String args[]){
	    
	    boolean status=false;
	    String s1=null,s2=null;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter First String: ");
	    s1=scan.nextLine();
	    
	    System.out.println("Enter Second String: ");
	    s2=scan.nextLine();
	    
	    scan.close();
	    status=findAnagram(s1,s2);
	    System.out.println("Anagram test: "+status);
	  }
	  
	  
	  public static boolean findAnagram(String a, String b) {
		  int length_a=a.length();
		  if(length_a!=b.length()) {
			  return false;
		  }
		  char temp; boolean checker;
		  char [] array_b=b.toCharArray();
		  int length_array_b=array_b.length;
		  checker=true;
		  for(int i=0; i<length_a;i++) {
			  temp=a.charAt(i);
			  if(checker==false) {
				  return false;
			  }
			  checker=false;
			  for(int j=0; j<length_array_b; j++) {
				  if(temp==array_b[j]) {
					  array_b[j]=' ';
					  checker=true;
					  break;
				  }
				  else
					  checker=false;
				  
			  }
		  }
		  
		  return checker;
	  }

}
