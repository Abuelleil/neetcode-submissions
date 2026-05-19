class Solution {
    public boolean isPalindrome(String s) {
        String [] chars = s.toLowerCase().replaceAll("[^a-z0-9]", "").split("");
        for(int i=0; i < chars.length/2;i++){
            if(!chars[i].equals(chars[chars.length-1-i]))return false;
        } 
        return true;
    }
}
