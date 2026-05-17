class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> first = new HashMap<Character,Integer>();
        HashMap<Character,Integer> second = new HashMap<Character,Integer>();
        if(s.length() != t.length()) return false;
        for(int i=0; i < s.length(); i++){
            first.put(s.charAt(i),first.getOrDefault(s.charAt(i),0) +1);
            second.put(t.charAt(i), second.getOrDefault(t.charAt(i),0) +1);
        }

        if(first.equals(second)){
            return true;
        }else{
            return false;
        }
    }
}
