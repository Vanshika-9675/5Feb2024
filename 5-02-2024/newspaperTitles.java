import java.util.Scanner;

public class newspaperTitles {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        //resultant string
        StringBuffer res = new StringBuffer("");

        //avoiding numeric value and concatenating the strings in the array to result string
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            for(int j=0;j< str.length();j++){
                  if (str.charAt(j)>='0' && str.charAt(j)<='9' ) {
                     continue;
                  }
                  else{
                    res.append(str.charAt(j));
                  }
            }
        }

        //capitalizing first letters
        if(res.charAt(0)>=97 && res.charAt(0)<=122){
            res.setCharAt(0,  (char)((int)res.charAt(0) - 32));
        }
        for(int i=0;i<res.length()-1;i++){
            if(res.charAt(i)==' ' && res.charAt(i+1)>=97 && res.charAt(i+1)<=122){
                res.setCharAt(i+1,  (char)((int)res.charAt(i+1) - 32));
            }
        }

        //printing output
        System.out.println(res);
        sc.close();
    }
}
