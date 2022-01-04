public class ArraySlotAccess {
    public static void main(String[] args) {

        int[] arr = new int[6];

        //for loop to access each slot of the array
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 1 + (int)(Math.random()*100);
        // }

        System.out.println("values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int)(Math.random()*100);
            System.out.print(arr[i] +" ");
        }
    }
}
