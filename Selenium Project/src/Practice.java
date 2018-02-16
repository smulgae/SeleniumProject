import java.util.*;

public class Practice {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int pos=-1;
		while(pos<s.length())
		{
			pos=s.indexOf('s',pos+1);
					if(pos==-1)
						break;
			System.out.println(pos);
		}
		
				
	}

	
		
		
	}
		