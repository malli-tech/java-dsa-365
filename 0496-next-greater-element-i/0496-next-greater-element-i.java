class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int p = nums1[i];
            int answer = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (p == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > p) {
                            answer = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            arr[i] = answer;
        }
        return arr;
    }
}