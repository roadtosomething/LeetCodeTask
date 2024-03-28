package Tasks.ListTasks;

import Tasks.Task;

public class Task1 implements Task {
    String taskName = "1. Two Sum";
    private int[] nums;
    private int target;

    public Task1(int[] nums, int target){
        this.nums= nums;
        this.target=target;
    }

    @Override
    public void run() {
        System.out.println("Задание: "+ taskName +"\n" +
                "Результат тестов: "+ showArray(twoSum()));
    }
    private String showArray(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                stringBuilder.append(array[i]);
            }
            else {
                stringBuilder.append(array[i]+",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    public int[] twoSum() {
        int[] result = null;
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums.length; l++) {
                if (nums[k]+nums[l]==target){
                    result= new int[] {k,l};
                }
            }
        }
        return result;
    }
}
