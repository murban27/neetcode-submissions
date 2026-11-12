class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    // 1. Pole nejdříve seřadíme
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    // 2. Procházíme pole a fixujeme jeden prvek na pozici i
    for (int i = 0; i < nums.length - 2; i++) {
        // Přeskočíme duplicitní prvky pro 'i', abychom neměli duplicity ve výsledku
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = nums.length - 1;

        // 3. Použijeme dva ukazatele (two-pointer approach) pro zbytek pole
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                
                left++;
                right--;

                // Přeskočíme duplicity pro levý ukazatel
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                // Přeskočíme duplicity pro pravý ukazatel
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < 0) {
                // Součet je moc malý, posuneme levý ukazatel doprava (zvětšíme čísla)
                left++;
            } else {
                // Součet je moc velký, posuneme pravý ukazatel doleva (zmenšíme čísla)
                right--;
            }
        }
    }
    return result;
}
}
