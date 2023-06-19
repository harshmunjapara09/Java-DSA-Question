public class pattern {
    public static void main(String[] args) {
//        hallow(3,4);
//        inverted(4);
//        inverted_half_num(5);
//        counter(5);
//        butterfly(4);
//        int[] nums = {-1,-2,-6,-1,-3};
//        subarray(nums);
//        kadane(nums);
//        int[] hight = {4,2,0,6,3,2,5};
//        System.out.println(trappedWater(hight));
        int[] stock ={2,3,4,11,2,12,3,9};
        System.out.println(buyAndSell(stock));
    }

    private static int buyAndSell(int[] stock) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i< stock.length;i++){
            if(buyPrice < stock[i]){
                int profit =  stock[i] - buyPrice;
                maxprofit = Math.max(maxprofit,profit);

            }else {
                buyPrice = stock[i];
            }
        }
            return maxprofit;
    }

    public static void hallow(int row , int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }

    public static void inverted(int n){
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
              System.out.print("*");
          }
        System.out.println();
      }
    }

    public static void inverted_half_num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void counter(int n){
        int counter = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void subarray(int[] nums){
        int n= nums.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];

        for(int i=1;i< prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                    sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
//                for(int k=i;k<=j;k++){
////                    System.out.print(nums[k]);
//                    sum += nums[k];
//                }
                if(max < sum ){
                    max=sum;
                }
//                System.out.print(" (Sum of Sub Array :" + sum +" )");
//                count++;
//                System.out.println();
            }
//            System.out.println();
        }
//        System.out.print(count);
        System.out.println("Max number of sub array sum  " + max);
    }


    public static void kadane(int[] nums){
        int sum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for(int i=0;i< nums.length;i++){
            if(nums[i] < 0){
                maxSum = Integer.MIN_VALUE;
            }
            sum += nums[i];
            if(sum < 0 ){
                sum = 0;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }

    public static int trappedWater(int[] hight){
        int n= hight.length;
        // left max
        int[] leftMax = new int [n];
        leftMax[0]=hight[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(hight[i],leftMax[i-1]);
        }

        // right max
        int[] rightMax = new int[n];
        rightMax[n-1] = hight[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(hight[i],rightMax[i+1] );
        }
        int trappedwater = 0;
        //loop
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i] );
            trappedwater += waterLevel - hight[i];

        }
        return  trappedwater;
    }
}
