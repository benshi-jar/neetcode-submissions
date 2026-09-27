class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> difference = new HashMap<>();
        int[] solutionSet = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (difference.containsKey(dif)) {
                solutionSet[0] = difference.get(dif);
                solutionSet[1] = i;
                return solutionSet;
            }
            else {
                difference.put(nums[i], i);
            }
        }
        return null;
    }
}
