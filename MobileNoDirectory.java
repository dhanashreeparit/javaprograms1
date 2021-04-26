package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MobileNoDirectory {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of directory");
		int numOfDirectory = scan.nextInt();
		String name = null;
		String phoneno=null;
		System.out.println(" enter the name and phone number");
		for (int i=0;i<numOfDirectory;i++) {
			name = scan.next();
			phoneno=scan.next();
			map.put(name, phoneno);            
		}
		System.out.println(map);
		while(scan.hasNext()) {
			String names = scan.next();
			if(map.containsKey(names)) {
				System.out.println(names +" "+map.get(names));
			}
			else
				System.out.println("Not Found");
		}
	}
}
