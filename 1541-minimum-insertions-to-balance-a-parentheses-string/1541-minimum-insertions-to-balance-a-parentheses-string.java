class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;

                // Every '(' needs two ')'
                if (open > 0 && i + 1 < s.length()
                        && s.charAt(i + 1) == ')') {
                    // This condition is not needed here
                }

                i++;
            } else {
                // If the next ')' is missing, insert one
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insertions++;
                    i++;
                }

                if (open > 0) {
                    open--;
                } else {
                    // Insert '(' to match these closing parentheses
                    insertions++;
                }
            }
        }

        return insertions + open * 2;
    }
}