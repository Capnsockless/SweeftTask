import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {
    //1
    public int singleNumber(int[] nums){
        List<Integer> found = new ArrayList<>();
        for (int num : nums) {
            if (found.contains(num)) {
                found.removeAll(Arrays.asList(num));
            } else {
                found.add(num);
            }
        }

        return found.get(0);
    }

    //2
    private final int[] coins = {1, 5, 10, 20, 50};
    public int minSplit(int amount){
        int coinCount = 0;

        int coin;
        for (int i=coins.length-1; i >= 0; i--) {
            coin = coins[i];
            coinCount += amount/coin;
            amount %= coin;
        }

        return coinCount;
    }

    //3
    public int notContains(int[] array){
        int result = 0;
        boolean found;
        do {
            result++;
            found = true;

            for (int n : array) {
                if (result == n) {
                    found = false;
                    break;
                }
            }
        } while (!found);

        return result;
    }

    //4
    public String binarySum(String num1, String num2){
        StringBuilder builder = new StringBuilder();

        int cur1 = num1.length()-1;
        int cur2 = num2.length()-1;
        int carry = 0;

        while (cur1 >= 0 || cur2 >= 0) {
            int sum = carry;
            if (cur1 >= 0) {
                if (num1.charAt(cur1) == '1'){
                    sum ++;
                }
                cur1--;
            }
            if (cur2 >= 0) {
                if (num2.charAt(cur2) == '1'){
                    sum ++;
                }
                cur2--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            builder.append(sum == 1 ? '1' : '0');
        }
        if (carry > 0){
            builder.append('1');
        }

        builder.reverse();
        return builder.toString();
    }

    //5
    public int countVariants(int stairsCount){
        if (stairsCount < 3) {
            return stairsCount;
        }
        int firstFib = 1, secondFib = 1;
        int temp;

        for (int i = 2; i < stairsCount; i++) {
            temp = secondFib;
            secondFib += firstFib;
            firstFib = temp;
        }

        return secondFib;
    }
}
