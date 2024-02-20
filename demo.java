import java.util.*;

public class demo {
    public static void missingNumber(int[] nums) {
        int first=0;
        for(int i=1;i<nums.length;i++)
        {
            first=nums[i-1];
            if(nums[i]<first)
            {
                int temp=nums[i];
                nums[i]=first;
                first=temp;
            } 
        }
        for(int i=0;i<nums.length;i++)
        System.out.print(nums[i]);
       
    }

    public static void main(String args[]) {

        int a[] = { 2,0,2,1,1,0};
        missingNumber(a);
    }
}
