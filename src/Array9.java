public class Array9 {
    public static void main(String[] args) {
        int[] arr = {71, 60, 30, 50, 60, 40, 70, 90, 80};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                  }
            System.out.println("Acending oder is: " + arr[i]);

        }
    }
}
