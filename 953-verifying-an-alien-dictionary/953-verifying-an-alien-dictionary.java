class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length -1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                
                if (j >= words[i + 1].length()) return false;
                
                char cur = words[i].charAt(j);
                char next = words[i + 1].charAt(j);
                
                if (map.get(cur) > map.get(next)) {
                    return false;
                }
                else if(map.get(cur) == map.get(next)){
                    continue;
                }else {
                    break;
                }
            }
        }
        return true;
    }
}