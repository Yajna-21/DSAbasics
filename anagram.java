import java.util.Scanner;

public class anagram{
    static boolean isAnagram(String str1, String str2) {
        
        if(str1.length()==str2.length()){
            int[] count = new int[26];
            for(int i=0; i<str1.length(); i++){
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }
            for(int i=0; i<26; i++){
                if(count[i] != 0) return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        if (isAnagram(word1, word2))
            System.out.println("The words are anagrams.");
        else
            System.out.println("The words are not anagrams.");

        sc.close();
    }
}