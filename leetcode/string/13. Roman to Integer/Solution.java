class Solution {
    public int romanToInt(String s) {
        // we want to convert the Roman numerals to integers
        // we need to have the mapping of the symbols and the values

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // result variable having a value that corresponds to the last character of this string
        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            }

            else {
                result+=map.get(s.charAt(i));
            }
        }

        return result;
    }
}
