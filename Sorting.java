import java.util.Arrays;

public class Sorting {
    public static void main (String [] args ){

        int[] a = { 7,4,-1,0,-3,12,20};
        int n = a.length;
        Arrays.sort(a);


        for (int i = 0 ; i<n-1;i++ ){
            int minIndex = i;
            for(int j = i ; j<n;j++){
                if(a[j]< a[minIndex]){
                    minIndex= j;
                }
            }
            int temp = a[i];
            a[i]= a[minIndex];
            a[minIndex]= temp;

        }
        for(int item : a){
            System.out.print(item +" ");
        }System.out.print(" ");
        for(int item : a){
            System.out.println(item +  " ");
        }
    }

}
