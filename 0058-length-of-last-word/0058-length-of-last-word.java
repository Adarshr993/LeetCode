class Solution {
    public int lengthOfLastWord(String s) {
String[] words = s.split("\\s+");
System.out.println("Extracted words array:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Element " + i + ": " + words[i]);
        }
String lastWord = words[words.length - 1];
            int lastWordLength = lastWord.length();       
            return lastWord.length();
}  
    public static void main(String[] args) {
        Solution solver = new Solution();
        String st = "Hello World! Welcome to Java";
        
        int result = solver.lengthOfLastWord(st); 
        System.out.println("\nFinal Result (Length of last word): " + result);
    }
            }
