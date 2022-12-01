// You are given a string s of even length. Split this string into two halves of equal lengths, 
//and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
//Notice that s contains uppercase and lowercase letters.
// Return true if a and b are alike. Otherwise, return false.

public class Solution {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("bookings"));
    }
    public static boolean halvesAreAlike(String s){
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2,n);
        int countA = 0;
        int countB = 0;
        
        String vowels = "a,e,i,o,u,A,E,I,O,U";

        for(int i=0;i<a.length();i++){
            if(vowels.contains(a.substring(i,i+1))){
                countA++;
            }
            if(vowels.contains(b.substring(i,i+1))){
                countB++;
            }
        }
        if(countA==countB){
            return true;
        }
        return false;
    }
}
