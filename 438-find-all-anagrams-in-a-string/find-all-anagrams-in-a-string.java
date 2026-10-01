class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String sub = s.substring(i, i + p.length());

            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);

            if (Arrays.equals(pArr, subArr)) {
                ans.add(i);
            }
        }

        return ans;
    }
}