package com.qf.zhifubao;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101700705846";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCo8N4jrHA2WJRlbSG0xHxEVHc65QkG2oH2wV9MvwJG3GKZRElRyMBMNsl0BSgb5APmcLRp77rIUo6pPeAv0AKOZUNYUwSouMh0rdUuqmxRJyjuqmUCNZJfjB32N8WvA780c/jiZiUWYVqGCHsn5rHpXSjGjPF0ztG7SR6OHroKJqfKi4gDPFU81cB8gSy3vGtrRxo1FhkLK3oDoAG6P3DoConU8mwcU2OmoY1tpOV9soVs9KjrF6IadvBg9bA8Kso4PWO49H1z8pZWyYWEu9fvTDhSArgXconTqJ0NUD02OLBSVPnkRz0j6A0/XSBjScxFgxl9xOeGKlgCQCvT+5HFAgMBAAECggEAPYwjIdP8vY/f4GO11+mNbEdpeKdgdoK8vm0MjyU3ayF3OmdKXuVISXvcQMxwJFkZoqaE0+NmpPyOxNGqD0E07TOvKUp1dBJ91SRPekTUWWxu2SRy0C88OFsPv1fqSSyQSEfH8JNOB61IEXSdiZfeUSqDZHKMtQV0G0s0OoqvNGrvGrP+rMPpfnoaBt178b1CUunoo3kpwf9cZEJ7aU+K1+vGJOc3Y9/6gLMv6RYZSmDJTpn/t+6z+5Jf/IhVnFicirR5Zn21IISuN20gnhT2PGtvAUOWowvNWezs7eZLFiGOnbOKlsrary0gdoXl3rcfvtgrsO8jJJx61cxVodQrsQKBgQD2Rev9LNipjDfwLgTNB9q7Og0yKvvTAbTXC29jSgaXVO5DBjDAXAPkFbMqV8C/1SjWYJrdCkmAygPllUgRMunt0088f+StC2GFwDdBzZAjPQLGgQYmto4f7NSMyoEemhTYGQBDi4DsdtC10fcMaZIgDZzspQ3NaBoGS32p581ulwKBgQCvnQlKPVYYAAHH497xmejviVDxM+Y8p0e77z0EYs8r7QThXqHNQbYPv8o5x/wNosS+iZeH1i+SurOCCWQWeP8PkTkT7yzEjCT//UC7xKnhMxr1u6+rmQy5cNx7XZRlHRkdUytdahYHUME5y5lTRZ54j05oyt/5RIne1bDt71WqAwKBgEiDhB4S82TQ7bOhyTYZxvTz/ei0sVuLGBVtv4mLxW8PyewgSYCKV3b0UMH5/r49ZH3jChZlrgjm8sjJ8ONni2vEmYMl4U52mGuKknqkrXlCwKt0WDxT6ntJ/7fI9MXu9o4+pk49KGP4BDJVNZoJB8a6W2dunibKLUeHOOQrZdjXAoGAZTjf1PHbwQOoAx5+L8Yl9IOyqwTeLZHCEDpKck+92DTK/lg8bQH2PceveXSi/P0X6DeIpxw22Z1RwJ9HGIjvg3qSasIOjM+2t/KysEggHxUE8iUXkZIrOmwqOdVrpoiKJFP/B94RCnBqn7SSEORs/lKjwFVHmfb+fPmw/MRaHR8CgYAk7efVzhFeBzkge4uCOMT62era1nqSKT0n34UnGkjYYLepyM60qcQDTNmjPR8U8Cs36jHPoYoXC9ceS/I+uNC8R4m3k82ibfcWCTpNGZ7ZCnyvf6z2zOtjbu8K9sLll8Y+OXg9zh3l2f9LzNFZGwmFDKgc4vMsNZvrzbeUYCGzWw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqPDeI6xwNliUZW0htMR8RFR3OuUJBtqB9sFfTL8CRtximURJUcjATDbJdAUoG+QD5nC0ae+6yFKOqT3gL9ACjmVDWFMEqLjIdK3VLqpsUSco7qplAjWSX4wd9jfFrwO/NHP44mYlFmFahgh7J+ax6V0oxozxdM7Ru0kejh66CianyouIAzxVPNXAfIEst7xra0caNRYZCyt6A6ABuj9w6AqJ1PJsHFNjpqGNbaTlfbKFbPSo6xeiGnbwYPWwPCrKOD1juPR9c/KWVsmFhLvX70w4UgK4F3KJ06idDVA9NjiwUlT55Ec9I+gNP10gY0nMRYMZfcTnhipYAkAr0/uRxQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/#/goods";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}