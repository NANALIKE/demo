package time;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.time.LocalDateTime;

public class TimeTest {
    public static void main(String[] args) {
        LocalDateTime localdatatime = LocalDateTime.now();
        String name = "I am 娜娜";
        try {
            System.out.println(toHexString(name.getBytes("UTF-16")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] utf8name =  name.getBytes(Charset.defaultCharset());
       System.out.println(toHexString(utf8name));

    }
    public static String toHexString(byte[] bytes){
        String hexString = "";
        for(byte num1:bytes){
            String hex1 = Integer.toHexString(num1&0xFF);
            if(hex1.length()==1){
                hexString=hexString+"0"+hex1+" ";
            }else{
                hexString=hexString+hex1+" ";
            }
        }
        return hexString;
    }
}
