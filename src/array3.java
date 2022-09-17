public class array3 {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        arr[0] = 190;
        arr[1] = 126;
        arr[2] = 129;
        arr[3] = 102;
        arr[4] = 120;
        int max = 0, i;
        for (i=0; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("max number in arrays is: " +max);
        
    }

}
