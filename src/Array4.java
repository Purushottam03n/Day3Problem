public class Array4 {
    public static void main(String[] args){
        int[] arr=  {120,50,60,60,32};
        int min =arr[0] ,i;
        for(i=1; i<arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("Min number in array : " +min);
    }
}
