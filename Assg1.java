import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assg1 {
    public static void main(String[] args) {

        int[] arr1 = { 2, 7, 11, 15 };
        int n = 9;
        int[] result = find_sum(arr1, n);
        System.out.println("(Native Solution) Indices: " + result[0] + " and "
                + result[1]);

    }

    // Que 1 solution
    public static int[] find_sum(int[] arr, int n) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == n) {
                return new int[] { left, right };
            } else if (arr[left] + arr[right] < n) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    // Quue 2. solution

    public static int occurence(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != n) {
                count += 1;
            }
        }
        return count;
    }

    // Que 3. solution

    public int Insert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;

    }

    // Que 4. Solution
        public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;   
        return newNumber;
    }
    // Que 5. Solution
    public void merge(int[] nums1,int m, int[] nums2,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while((j>=0)){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
    }


    // Que 6. Solution
    public boolean containsDupicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;

            }
            map.put(nums[i], 1);
        }
        return false;
    }

    // Que 7. Solution

    public void moveZeroes(int[] nums){
        int s = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s++;
            }else if(s>0){
                int t = nums[i];
                nums[i] = 0;
                nums[i-s] =t ;
            }
        }
    }

    // Que 8 . solution
        public int[] findErrorNums(int[] nums) {
        Map < Integer, Integer > map = new HashMap<>();
        int dup = -1, missing = 1;
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
    }

}