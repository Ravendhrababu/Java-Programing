package MyArrays;

public class PrintEvenAndOddNumbers {
    
    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even[] = new int[a.length];
        int odd[] = new int[a.length];
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even[evenIndex] = a[i];
                evenIndex++;
            } else {
                odd[oddIndex] = a[i];
                oddIndex++;
            }
        } 
        
        System.out.println("Even numbers:");       
        for(int e : even) {
        	System.out.print(e +" ");
        }
        
        System.out.println();
        
        System.out.println("Odd numbers:");
        for(int o : odd) {
        	System.out.print(o +" ");
        }
    }
}
