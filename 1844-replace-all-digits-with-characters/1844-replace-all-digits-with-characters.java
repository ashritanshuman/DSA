class Solution {
    public String replaceDigits(String s) {

        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {

            int shift = arr[i] - '0';

            arr[i] = (char) (arr[i - 1] + shift);
        }

        return new String(arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna