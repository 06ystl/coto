package cn.bytts.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Description TODO
 * @Date 2020/6/11 22:07
 * @Author LZT
 */
public class HttpUtils {

    public static String httpRequest(String requestUrl,String para){
        StringBuffer buffer = new StringBuffer();

        try{
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.connect();
            PrintWriter printWriter = new PrintWriter(connection.getOutputStream());
            printWriter.write(para);
            printWriter.flush();

            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                buffer.append(str);
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();

            connection.disconnect();


        }catch (Exception e){
            e.printStackTrace();
        }
        return buffer.toString();

    }

}
