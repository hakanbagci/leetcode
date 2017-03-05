public int findPairs(int[] nums, int k) {
      if (k < 0) {
          return 0;
      }

      Map<Integer, Integer> numsToProcess = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
          if (!numsToProcess.containsKey(nums[i])) {
              numsToProcess.put(nums[i], 1);
          } else {
              numsToProcess.put(nums[i], numsToProcess.get(nums[i]) + 1);
          }
      }

      int uniqueKDiffs = 0;

      if (k == 0) {
          for (Integer num : numsToProcess.keySet()) {
              if(numsToProcess.get(num) > 1) {
                  ++uniqueKDiffs;
              }
          }

          return uniqueKDiffs;
      }

      for (Integer num : numsToProcess.keySet()) {
          if(numsToProcess.containsKey(num + k)) {
              ++uniqueKDiffs;
          }
      }

      return uniqueKDiffs;
}
