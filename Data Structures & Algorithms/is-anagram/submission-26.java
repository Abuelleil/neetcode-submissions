class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> first = new HashMap<String,Integer>();
        HashMap<String,Integer> second = new HashMap<String,Integer>();
        if(s.length() != t.length()) return false;
        else{
            for(int i=0; i<s.length(); i++){
                String chrs = s.charAt(i)+"";
                String chrt = t.charAt(i)+"";
                first.put(chrs, first.getOrDefault(chrs, 0) + 1);
                second.put(chrt, second.getOrDefault(chrt, 0) + 1);
            }
        }

        if(first.equals(second)) return true;
        return false;
    }
}
