public class HighestPalindrome {

    public static String highestPalindrome(String str, int k) {
        char[] palindrome = str.toCharArray();
        return highestPalindromeHelper(palindrome, 0, palindrome.length - 1, k);
    }

    private static String highestPalindromeHelper(char[] palindrome, int left, int right, int k) {
        if (left >= right) {
            return String.valueOf(palindrome);
        }

        // Jika kedua karakter tidak sama
        if (palindrome[left] != palindrome[right]) {
            // Ganti dengan nilai maksimum
            char maxChar = (char) Math.max(palindrome[left], palindrome[right]);
            palindrome[left] = maxChar;
            palindrome[right] = maxChar;
            k--; // Kurangi jumlah penggantian yang tersedia
        }

        // Rekursif untuk karakter berikutnya
        return highestPalindromeHelper(palindrome, left + 1, right - 1, k);
    }

    public static void main(String[] args) {
        String str1 = "3943";
        int k1 = 1;
        System.out.println("Output sampel 1: " + highestPalindrome(str1, k1)); // Output: 3993

        String str2 = "3943";
        int k2 = 2;
        System.out.println("Output sampel 2: " + highestPalindrome(str2, k2)); // Output: 992299
    }
}
