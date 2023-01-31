package cn.fmm.java_learn.common_utils;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 16:48
 * Dec : java环境 打印日志公共类
 **/
public class Log {

    public static void println(String message) {
        System.out.println("Logger --> " + message);
    }

    public static void println(String tag, String message) {
        System.out.println(tag + " --> " + message);
    }
}
