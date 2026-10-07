class Solution {

    Set<String> validExpressions = new HashSet<>();
    int minimumRemoved = Integer.MAX_VALUE;

    void recurse(String s, int index, int leftCount, int rightCount,
                 StringBuilder expression, int removedCount) {

        if (index == s.length()) {

            if (leftCount == rightCount) {

                if (removedCount < minimumRemoved) {
                    validExpressions.clear();
                    minimumRemoved = removedCount;
                }

                if (removedCount == minimumRemoved) {
                    validExpressions.add(expression.toString());
                }
            }

            return;
        }

        char c = s.charAt(index);
        int length = expression.length();

        // Remove
        if (c == '(' || c == ')') {
            recurse(s, index + 1, leftCount, rightCount,
                    expression, removedCount + 1);
        }

        // Keep
        expression.append(c);

        if (c == '(') {
            recurse(s, index + 1, leftCount + 1, rightCount,
                    expression, removedCount);
        }
        else if (c == ')' && rightCount < leftCount) {
            recurse(s, index + 1, leftCount, rightCount + 1,
                    expression, removedCount);
        }
        else if (c != '(' && c != ')') {
            recurse(s, index + 1, leftCount, rightCount,
                    expression, removedCount);
        }

        // Backtrack
        expression.deleteCharAt(length);
    }

    public List<String> removeInvalidParentheses(String s) {
        recurse(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(validExpressions);
    }
}