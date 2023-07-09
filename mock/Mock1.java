package mock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


  class Solution{

    // Que1. solution

    public int uniqChar(String s){
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }else{
                m.put(ch,1);
            }

        }

        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1){
                return 1;
            }
            
        }
        return -1;
    }

// Que 2. Solution

    public void moveZeroes(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}
public class Mock1 {

    public class InnerMock1 {
    
        void mtd(){
            System.out.println("sss");

       }
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        Solution s= new Solution();
        s.uniqChar("leetcode");
        s.moveZeroes(nums);

    }
		
}