package Tasks.ListTasks;

import Tasks.Task;

import java.io.CharArrayReader;

public class Task5 implements Task {
    @Override
    public void run() {
        String target = "a";
        System.out.println(longestPalindrome(target));
    }
    String longestPalindrome(String s) {
        char[] array = s.toCharArray();
        String result ="";
        for (int i = 0; i < array.length; i++) {
            String current=searchWord(i,array);
            String current2="";
            if (i+1<array.length){
                if (array[i]==array[i+1]){
                    current2 = searchWord(i,i+1,array);
                }
            }
            result = current.length()>result.length()?current:result;
            result = current2.length()>result.length()?current2:result;
        }
        return result;
    }
    private String searchWord (int indexStart, char[] arrayCh) {
        String result = "";
        int indexParam = 0;
        while (indexStart+indexParam < arrayCh.length & indexStart - indexParam > -1){
            if (arrayCh[indexStart+indexParam]==arrayCh[indexStart-indexParam])
            {
                if (indexParam==0){
                    result = String.valueOf(arrayCh[indexStart]);
                }
                else {
                    result = arrayCh[indexStart - indexParam] +
                            result +
                            arrayCh[indexStart + indexParam];
                }
                indexParam++;
            }
            else break;
        }
    return result;
    }

    private String searchWord (int index1, int index2, char[] arrayCh) {
        String result = arrayCh[index1] + String.valueOf(arrayCh[index2]);
        int indexParam = 0;
        while (index2+indexParam < arrayCh.length & index1- indexParam > -1){
            if (arrayCh[index2+indexParam]==arrayCh[index1-indexParam])
            {
                if (indexParam==0){
                    result= String.valueOf(arrayCh[index1])+String.valueOf(arrayCh[index2]);
                }
                else {
                    result = arrayCh[index1 - indexParam] +
                            result +
                            arrayCh[index2 + indexParam];
                }
                indexParam++;
            }
            else break;
        }
        return result;
    }
}
