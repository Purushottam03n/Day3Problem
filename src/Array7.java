public class Array7 {
    public static void main(String[] args){
        int[] arr = {12,34,56,75,34,67,34,67,864,11};
        int i;
        for(i=0;i<arr.length; i++){
            if(i%2 !=0){
                System.out.println("Odd Position of Array: " +arr[i]);
            }
        }
    }
}
