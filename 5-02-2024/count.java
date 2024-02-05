import java.util.*;

/**
 * count
 */
public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizze of the array:");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int x:arr){
            if(x%2==0){
                count+=1;
            }
            else if(x==5){
                count+=5;
            }
            else{
                count+=3;
            }
        }
        System.out.println(count);
        sc.close();
    }
}