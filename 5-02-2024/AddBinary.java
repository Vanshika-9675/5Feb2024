import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second binary string:");
        String str2 = sc.nextLine();
       
        int n1 = str1.length();
        int n2=  str2.length();
        int i=0;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int sum=0;
        while (i<n1 || i<n2) {
            int x=0;
            if(i<n1 && str1.charAt(n1-i-1)=='1'){
                x=1;
            }
            int y=0;
            if( i<n2 && str2.charAt(n2-i-1)=='1'){
                y=1;
            }
            sum= x+y+carry;
            res.append(Integer.toString(sum%2));
            carry=sum/2;
            i++;
        }
        if(carry==1){
            res.append('1');
        }
        System.out.println(res.reverse());
        sc.close();
    }
}
