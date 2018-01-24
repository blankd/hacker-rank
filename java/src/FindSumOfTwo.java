import java.util.Arrays;


public class FindSumOfTwo {

	public static Boolean hasSumOfTwo(Integer nums[], Integer sum) {
		Boolean ret = Boolean.FALSE;
		
		Arrays.sort(nums);
		Integer top = Integer.valueOf(0);
		Integer bottom = Integer.valueOf(nums.length - 1);
		
		while(top < bottom) {
			Integer listSum = nums[top] + nums[bottom];
			Integer dupCheck = Integer.valueOf(0);
			if(sum == listSum) {
				ret = Boolean.TRUE;
				break;
			} else if(listSum < sum) {
				dupCheck = nums[top];
				top++;
				while(dupCheck == nums[top]) {
					top++;
				}
			} else if(listSum > sum) {
				dupCheck = nums[bottom];
				bottom--;
				while(dupCheck == nums[bottom]) {
					bottom--;
				}
			}
		}
		
		return ret;
	}
	public static void main(String[] args) {
		Integer theNums[] = {Integer.valueOf(100),Integer.valueOf(28), Integer.valueOf(-33),
				Integer.valueOf(-3), Integer.valueOf(8), Integer.valueOf(-22), Integer.valueOf(-33)};
		System.out.println(hasSumOfTwo(theNums, 98));
	}

}
