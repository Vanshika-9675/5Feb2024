import java.util.Scanner;

public class EqualVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int j = str.length()/2;
        int left=0,right=0;
        for(int i=0;i<str.length()/2 && j<str.length();i++,j++){
             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                  left++;
             }
             if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u' ){
                  right++;
             }
        }
        if(left==right){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
