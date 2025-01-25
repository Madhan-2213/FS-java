import java.util.Arrays;
public class reversearray {
    public static void main(String[] args) {
        int arr[] = {3,9,2,1,4};

            Arrays.sort(arr);

        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);

        }


        }
    }


