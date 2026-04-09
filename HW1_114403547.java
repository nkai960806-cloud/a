import java.util.Scanner;

public class HW1_114403547{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("請輸入層數： ");
	    
	    int n = scanner.nextInt();
	    
	    System.out.print("請選擇類型（1上 2下 3左 4右）： ");
	    
	    int type = scanner.nextInt();
	    
	    int i,j,k;
	    
	    if(type==1){
	        for(i=1;i<=n;i++){
	            for(j=1;j<=n-i;j++){
	                System.out.print(" ");
	            }
	            for(k=1;k<=2*i-1;k++){
	                System.out.print("*");
	            }
	            System.out.println();
	            
	        }
	    }
	    
	    else if(type==2){
	        for(i=1;i<=n;i++){
	            for(j=1;j<=i-1;j++){
	            System.out.print(" ");
	        }
	        for(k=1;k<=2*(n-i)+1;k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    }
	    else if(type==3){
	        for(i=1;i<=n;i++){
	            for(j=1;j<=n-i;j++){
	                System.out.print(" ");
	            }
	            for(k=1;k<=i;k++){
	                System.out.print("*");
	            }
	            System.out.println();
	            
	        }
	        for(i=n-1;i>=1;i--){
	            for(j=1;j<=n-i;j++){
	                System.out.print(" ");
	            }
	            for(k=1;k<=i;k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	    else if(type==4){
	        for(i=1;i<=n;i++){
	            for(k=1;k<=i;k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(i=n-1;i>=1;i--){
	            for(k=1;k<=i;k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    
	    }
	    
	    
	    else{
	        System.out.print("輸入錯誤！");
	    }
	    scanner.close();
}
}
