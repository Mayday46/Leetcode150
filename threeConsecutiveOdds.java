public class threeConsecutiveOdds {
    public boolean threeConsecutiveOddsSolution(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count != 3) {
                if (arr[i] % 2 != 0) {
                    count++;
                } else {
                    count = 0; // Reset count if an even number is found
                }

            }
        }
        return count == 3; // Return true if there are three consecutive odd numbers
    }

    public static void main(String[] args) {
        threeConsecutiveOdds obj = new threeConsecutiveOdds();
        int[] arr = {1, 2, 3, 4, 5, 7, 9};
        boolean result = obj.threeConsecutiveOddsSolution(arr);
        System.out.println(result); // Output: true
    }
    
}
