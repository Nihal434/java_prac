public class Array {
    public static void main(String[] args) {
        String[] str = new String[6]; //array of string
        int[] arr = new int[3]; //array of integer
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //int len = arr.length;

        for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]);

        }
        //using for each loop

        for (int i : arr) {
            System.out.println(i);
            
        }

    }
    
}
