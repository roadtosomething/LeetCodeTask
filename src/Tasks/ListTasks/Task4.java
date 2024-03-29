package Tasks.ListTasks;

import Tasks.Task;


public class Task4 implements Task {
    private final int[] array1= new int[] {1,3,4,5,6,9};
    private final int[] array2 = new int[] {2,7,8};
    @Override
    public void run() {
        System.out.println(findMedianSortedArrays(array1,array2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int aggregationNumsLength = nums1.length+nums2.length;
        int[] aggregationNums = new int[aggregationNumsLength];
        int n=0;
        int m=0;
        int i=0;
        double result;
        while (i<aggregationNumsLength){
            if (n<nums1.length&m<nums2.length){
                if (nums1[n]<=nums2[m]){
                    aggregationNums[i]=nums1[n];
                    n++;
                }
                else {
                    aggregationNums[i]=nums2[m];
                    m++;
                }
            }
            else if (n<nums1.length){
                aggregationNums[i]=nums1[n];
                n++;
            }
            else if (m<nums2.length){
                aggregationNums[i]=nums2[m];
                m++;
            }
            i++;
        }
        if (aggregationNumsLength%2==0){
            int target1 = aggregationNums[aggregationNumsLength / 2];
            int target2= aggregationNums[aggregationNumsLength / 2 -1];
            result = (double) (target1 + target2) /2;
        }
        else {
            result = aggregationNums[aggregationNumsLength / 2];
        }
        return result;
    }
}
