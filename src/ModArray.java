import java.util.Scanner;

public class ModArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        int b= scanner.nextInt();
        System.out.println(modArray(array,n,b));
    }
    static int modArray(int[] array,int n,int b){
        int result=0,power=1;
        for (int i=n-1;i>=0;i--){
            result=(result+(array[i]%b)*power)%b;
            power=(power*10)%b;
        }
        return result;
    }
}
