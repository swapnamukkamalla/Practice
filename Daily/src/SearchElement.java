	import java.util.*;
	import java.lang.*;
	import java.io.*;
public class SearchElement {

		public static void main (String[] args) {
			
			
			Scanner ip = new Scanner(System.in);
			
			int tc = ip.nextInt();
			int len =0, find=0;
			
			while(tc>0){
			    if(ip.hasNext()){
			    len = ip.nextInt();
			    
			   find = ip.nextInt();
			    int temp=0;boolean flag = false;
			    for(int i=0;i<len;i++){
			        temp = ip.nextInt();
			        if(find == temp){
			            flag = true;
			            System.out.println("1");
			            break;
			        }
			    }
			   if (flag == false){
			   System.out.println("-1");
			   }
			    
					}
			tc--;
		}
		}
	}

