class Solution269 {
    public String alienOrder(String[] words) {
        int[] in = new int[26];
        Set<Character> set = new HashSet<>();
        Map<Character, List<Character>> map = new HashMap<>();

        for(String word : words)
            for(char c : word.toCharArray())
                set.add(c);

        for(int i = 0; i < words.length - 1; i++){
            String s1 = words[i], s2 = words[i+1];
            int j = 0, len1 = s1.length(), len2 = s2.length(), minLen = Math.min(len1, len2);
            while(j < minLen){
                if(s1.charAt(j) != s2.charAt(j)){
                    char c1 = s1.charAt(j), c2 = s2.charAt(j);
                    map.computeIfAbsent(c1, k -> new ArrayList<>()).add(c2);
                    in[c2 - 'a']++;
                    break;
                }
                j++;
            }

            if(j == minLen && len1 > len2)
                return "";
        }

        Queue<Character> q = new LinkedList<>();
        for(char c = 'a'; c <= 'z'; c++){
            if(set.contains(c) && in[c - 'a'] == 0){
                q.offer(c);
                // Mark as visited
                in[c - 'a'] = -1;
            }

        }

        if(q.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        int total = set.size();
        while(!q.isEmpty()){
            char curr = q.poll();
            sb.append(curr);
            total -= 1;
            if(!map.containsKey(curr))
                continue;
            for(char next : map.get(curr)){
                if(in[next - 'a'] == -1) // Already visited
                    continue;
                in[next - 'a'] -= 1;
                if(in[next - 'a'] == 0){
                    q.offer(next);
                    in[next - 'a'] = -1;
                }
            }
        }
        return total == 0 ? sb.toString() : "";
    }
}