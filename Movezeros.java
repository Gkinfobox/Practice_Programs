// Move all the zeros to end of the array.. Note: should duplicate the array, use the same array and do it


// Using the two pointer concept we can done it.

import java.util.*;

public class Movezeros {

    public static void main (String arg[])
    {
        Scanner s =  new Scanner(System.in);

        System.out.println("Enter the array size");

        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array values:");

        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

        s.close();

        int left =0 ;
        
        for(int right=0; right<n; right++)
        {
            if(arr[right] !=0)
            {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left++;
            }
        }

        System.out.print("Result: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}