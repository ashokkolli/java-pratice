package core.tiktok.backTracking;

import java.util.LinkedList;
import java.util.List;

public class _93_RestoreIPAddresses {
    //https://www.youtube.com/watch?v=KU7Ae2513h0&t=615s

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        int[] path = new int[4];
        helper(res, s, 0,  path, 0);
        return res;
    }

    void helper(List<String> list, String s, int idx, int[] path,  int segment){
        if(segment == 4 && idx == s.length() ){
            list.add(path[0] + "." + path[1] + "."+ path[2] + "." + path[3]);
            return ;
        }else if(segment == 4 || idx == s.length() ){
            return ;
        }

        for(int len = 1; len <= 3 && idx + len <= s.length() ; len ++){
            //len 1 to 3 is required to go from given index to 3 chars as only allowed chars are 3 in ip.
            int val = Integer.parseInt(s.substring(idx, idx + len));
            // range check, no leading 0.
            if(val > 255 || len >= 2  && s.charAt(idx) == '0')
                break;

            path[segment] = val;
            helper(list, s, idx + len, path, segment + 1);
            path[segment] = -1; // for debug.
        }
    }

}
