package leetcode.easy;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionHelper {

    public static String sendRequest(String urlParam,String requestType) {

        HttpURLConnection con = null;

        BufferedReader buffer = null;
        StringBuffer resultBuffer = null;

        try {
            URL url = new URL(urlParam);
            //�õ����Ӷ���
            con = (HttpURLConnection) url.openConnection();
            //������������
            con.setRequestMethod(requestType);
            //����������Ҫ���ص��������ͺ��ַ�������
            con.setRequestProperty("Content-Type", "application/json;charset=GBK");
            //����д��
            con.setDoOutput(true);
            //�������
            con.setDoInput(true);
            //��ʹ�û���
            con.setUseCaches(false);
            //�õ���Ӧ��
            int responseCode = con.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){
                //�õ���Ӧ��
                InputStream inputStream = con.getInputStream();
                //����Ӧ��ת�����ַ���
                resultBuffer = new StringBuffer();
                String line;
                buffer = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while ((line = buffer.readLine()) != null) {
                    resultBuffer.append(line);
                }
                return resultBuffer.toString();
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void main(String[] args) {

        String url ="http://www.baidu.com";
        System.out.println(sendRequest(url,"POST"));
    }
}
