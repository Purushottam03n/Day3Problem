public class Array8 {
    public static void main(String[] args){
        int[] arr = {10,20,10,30,50,60,70,30};
        int i;
        for(i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++)
            if(arr[i]==arr[j]){
                System.out.println("Duplicate Values are: " +arr[i]);
            }
        }
    }
}
