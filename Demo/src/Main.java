import org.omg.PortableServer.ThreadPolicyOperations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args)  throws Exception{

        Integer a = 0;
        System.out.println(a+ 30*60L);
	// zhangpj write
    // test1
// cba
    }

    private static List getPage(List list, int paIndex, int paSize) {
        // 总集合为空，返回空
        if(list == null || list.size() <=0){
            return new ArrayList();
        }
        // 总集合数量小于paSize，返回总集合
        if(list.size() <= paSize){
            return list;
        }
        List newResultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if(i >= (paIndex-1)*paSize && i < paIndex*paSize ){
                newResultList.add(list.get(i));
            }

        }
        return newResultList;
    }

    public static String getHMStr(long millSeconds) {
        //小时参数
        long ph = 60 * 60 * 1000;
        //分钟参数
        long pm = 60 * 1000;
        //秒参数
        long ps = 1000;

        String str = "";
        if (millSeconds < pm) {
            return "0秒";
        }

        long hours = millSeconds / (ph);
        long minutes = (millSeconds % ph) / (pm);
        long seconds = ((millSeconds % ph) % (pm)) / ps;
        if (hours > 0) {
            str = hours + "小时";
        }
        if (minutes > 0) {
            str = str + minutes + "分钟";
        }
        if (seconds > 0) {
            str = str + seconds + "秒";
        }
        return str;
    }

}
