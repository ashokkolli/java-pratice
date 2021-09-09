package apple.strings.leetcode.easy;

import java.util.*;

public class ReOrderDataInLogFiles {
    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6",
                "let2 own kit dig","let3 art zero"};
        reOderData(logs);
    }
    //Rules
    //1. The letter logs come before all digit-logs
    //2. The letter logs are sorted lexicographically
    //3. The digit-logs maintain their relative ordre

    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                // split each log into two parts: <identifier, content>

               String[] split1 = log1.split(" ", 2);
               String[] split2 = log2.split(" ", 2);

               boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
               boolean isDigit2 = Character.isDigit(split2[1].charAt(0));


                // case 1). both logs are letter-logs
                if (!isDigit1 && !isDigit2) {
                    // first compare the content
                    int cmp = split1[1].compareTo(split2[1]);
                    if (cmp != 0)
                        return cmp;
                    // logs of same content, compare the identifiers
                    return split1[0].compareTo(split2[0]);
                }

                //case2.
                if(!isDigit1 && isDigit2){

                }


                // case 2). one of logs is digit-log
                if (!isDigit1 && isDigit2)
                    // the letter-log comes before digit-logs
                    return -1;
                else if (isDigit1 && !isDigit2)
                    return 1;
                else
                    // case 3). both logs are digit-log
                    return 0;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }



    public static String[] reOderData(String[] logs){
        String[] output = new String[logs.length];
        if(logs == null || logs.length == 0) return logs;
        int len = logs.length;
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for(String log : logs){
            if(log.split(" ")[1].charAt(0) < 'a'){
                digitList.add(log);
            }else letterList.add(log);
        }

        Collections.sort(letterList, ((o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            int len1 = s1.length;
            int len2 = s2.length;
            for (int i = 1; i < Math.min(len1, len2); i++) {
                if(!s1[i].equals(s2[i])){
                    return s1[i].compareTo(s2[i]);
                }

            }

            return s1[0].compareTo(s2[0]);
        } ));

        int count = 0;
        while(count < letterList.size()){
            logs[count] = letterList.get(count);
            count++;
        }
        int i = 0;
        while(i < digitList.size()){
            logs[count] = digitList.get(i);
            count++;
            i++;
        }
        for (String log :
                logs) {
            System.out.println(log);

        }
        return logs;
    }


}
