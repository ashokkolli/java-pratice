package core.tiktok.queue;

import java.util.HashMap;
import java.util.Map;

public class _359_LoggerRateLimiter {
    //https://leetcode.com/problems/logger-rate-limiter/
    private Map<String, Integer> msgDict;
    public _359_LoggerRateLimiter(){
        msgDict = new HashMap<>();
    }

    public boolean shouldPrintMsg(int timeStamp, String msg){

        if(!msgDict.containsKey(msg)){
            msgDict.put(msg, timeStamp);
            return true;
        }
        Integer oldMsgTimeStamp = msgDict.get(msg);
        if(timeStamp - oldMsgTimeStamp >=10){
            msgDict.put(msg, timeStamp);
            return  true;
        }
        return false;
    }


}
