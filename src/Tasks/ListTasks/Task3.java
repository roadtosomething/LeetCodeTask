package Tasks.ListTasks;

import Tasks.Task;

//3. Longest Substring Without Repeating Characters
public class Task3 implements Task {
    private String taskName = "Задание 3. Поиск самой длинной подстроки без повторяющихся символов";
    private String target;

    public Task3(String target){
        this.target=target;
    }

    public final void run(){
        System.out.println("Задание: "+ taskName +"\n" +
                "Результат тестов: "+ uniqueCharsInString(target));
    }
    public long uniqueCharsInString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String longestWord = "";

        for(int i = 0; i < s.length(); ++i) {
            String currentChar = String.valueOf(s.charAt(i));
            if (stringBuilder.indexOf(currentChar) == -1) {
                stringBuilder.append(currentChar);
            } else {
                if (stringBuilder.length() >= longestWord.length()) {
                    longestWord = stringBuilder.toString();
                }

                stringBuilder.replace(0, stringBuilder.indexOf(currentChar) + 1, "");
                stringBuilder.append(currentChar);
            }
        }

        if (stringBuilder.length() >= longestWord.length()) {
            longestWord = stringBuilder.toString();
        }
        return (long)longestWord.length();
    }
}
