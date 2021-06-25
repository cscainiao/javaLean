package my_project;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class HttpURLConnectionUtil {

    /**
     * Http get请求
     * @param httpUrl 连接
     * @return 响应数据
     */
    public static String res_text;
    public static int res_code;


    public static void doGet(String httpUrl){
        //链接
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        StringBuffer result = new StringBuffer();
        try {
            //创建连接
            URL url = new URL(httpUrl);
            connection = (HttpURLConnection) url.openConnection();
            //设置请求方式
            connection.setRequestMethod("GET");
            //设置连接超时时间
            connection.setReadTimeout(15000);
//            connection.setRequestProperty("accept", "*/*");
//            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.82 Safari/537.36");
            connection.setRequestProperty("Referer", "https://cd.meituan.com/");
            connection.setRequestProperty("Cookie", "uuid=616d829ba4044f60aabc.1619769335.1.0.0; _lx_utm=utm_source%3DBaidu%26utm_medium%3Dorganic; _lxsdk_cuid=17921c6a5b4c8-03ce91fee586b8-1732685d-13c680-17921c6a5b4c8; ci=59; rvct=59; mtcdn=K; userTicket=mPywtpTWisfyTFCHKnHLcnnZdESQqiaOLKyLdjvq; u=140840689; n=egQ142580879; lt=TmU4qJTf60acIZexh4wFV2bJ5V4AAAAAZg0AAE9Oz0cqEMzxCa7dCjzbi8dNbfqTnkUIMZ9bg4sBgaCf3WwN1bVKVgf-26mcjNO8bA; mt_c_token=TmU4qJTf60acIZexh4wFV2bJ5V4AAAAAZg0AAE9Oz0cqEMzxCa7dCjzbi8dNbfqTnkUIMZ9bg4sBgaCf3WwN1bVKVgf-26mcjNO8bA; token=TmU4qJTf60acIZexh4wFV2bJ5V4AAAAAZg0AAE9Oz0cqEMzxCa7dCjzbi8dNbfqTnkUIMZ9bg4sBgaCf3WwN1bVKVgf-26mcjNO8bA; lsu=; token2=TmU4qJTf60acIZexh4wFV2bJ5V4AAAAAZg0AAE9Oz0cqEMzxCa7dCjzbi8dNbfqTnkUIMZ9bg4sBgaCf3WwN1bVKVgf-26mcjNO8bA; unc=egQ142580879; firstTime=1619769546561; _lxsdk_s=17921c6a5ba-959-289-122%7C%7C16");
            //开始连接
            connection.connect();
            //获取响应数据
            if (connection.getResponseCode() == 200) {
                //获取返回的数据
                is = connection.getInputStream();
                if (null != is) {
                    br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    String temp = null;
                    while (null != (temp = br.readLine())) {
                        result.append(temp);
                    }
                }
            }
            res_code = connection.getResponseCode();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭远程连接
            connection.disconnect();
        }
        res_text = result.toString();
    }

    /**
     * Http post请求
     * @param httpUrl 连接
     * @param param 参数
     * @return
     */
    public static void doPost(String httpUrl,  String param) {
        StringBuffer result = new StringBuffer();
        //连接
        HttpURLConnection connection = null;
        OutputStream os = null;
        InputStream is = null;
        BufferedReader br = null;
        try {
            //创建连接对象
            URL url = new URL(httpUrl);
            //创建连接
            connection = (HttpURLConnection) url.openConnection();
            //设置请求方法
            connection.setRequestMethod("POST");
            //设置连接超时时间
            connection.setConnectTimeout(15000);
            //设置读取超时时间
            connection.setReadTimeout(15000);
            //DoOutput设置是否向httpUrlConnection输出，DoInput设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
            //设置是否可读取
            connection.setDoOutput(true);
            connection.setDoInput(true);
            //设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");

            //拼装参数
            if (null != param && param.equals("")) {
                //设置参数
                os = connection.getOutputStream();
                //拼装参数
                os.write(param.getBytes("UTF-8"));
            }
            //设置权限
            //设置请求头等
            //开启连接
            //connection.connect();
            //读取响应
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                if (null != is) {
                    br = new BufferedReader(new InputStreamReader(is, "GBK"));
                    String temp = null;
                    while (null != (temp = br.readLine())) {
                        result.append(temp);
                        result.append("\r\n");
                    }
                }
            }
            res_code = connection.getResponseCode();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭连接
            connection.disconnect();
        }
        res_text = result.toString();
    }

    public static void main(String[] args) {
        HttpURLConnectionUtil conn = new HttpURLConnectionUtil();
        conn.doPost("https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13026194071", "");
        String message = conn.res_text;
        int code = conn.res_code;
        System.out.println(message);
        System.out.println(code);
        conn.doGet("https://apimobile.meituan.com/group/v4/poi/pcsearch/59?uuid=616d829ba4044f60aabc" +
                ".1619769335.1.0.0&userid=140840689&limit=32&offset=0&cateId=40&q=%E8%87%AA%E5%8A%A9%E9%A4%90&" +
                "token=TmU4qJTf60acIZexh4wFV2bJ5V4AAAAAZg0AAE9Oz0cqEMzxCa7dCjzbi8dNbfqTnkUIMZ9bg4sBgaCf3WwN1bVKVgf" +
                "-26mcjNO8bA&areaId=-1");
        message = conn.res_text;
        code = conn.res_code;
        System.out.println(message);
        System.out.println(code);

    }

}
