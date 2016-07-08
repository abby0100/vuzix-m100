package com.example.xy.utils;

import java.util.StringTokenizer;

public class Log {

    public static final int VERBOSE = 0X01;
    public static final int DEBUG   = 0X02;
    public static final int INFO    = 0X03;
    public static final int WARN    = 0X04;
    public static final int ERROR   = 0X05;
    public static final int NOTHING = 0X06;

    private static final int LEVEL = VERBOSE;
    private static final String logFilter = "log";

    public static void v(String tag, String msg) {
        if (LEVEL <= VERBOSE) {
            android.util.Log.v(tag, msg);
        }
    }
    public static void d(String tag, String msg) {
        if (LEVEL <= DEBUG) {
            android.util.Log.v(tag, msg);
        }
    }
    public static void i(String tag, String msg) {
        if (LEVEL <= INFO) {
            android.util.Log.v(tag, msg);
        }
    }
    public static void w(String tag, String msg) {
        if (LEVEL <= WARN) {
            android.util.Log.v(tag, msg);
        }
    }
    public static void e(String tag, String msg) {
        if (LEVEL <= ERROR) {
            android.util.Log.v(tag, msg);
        }
    }

    public static void logAll(Exception e) {
        StackTraceElement[] trace = e.getStackTrace();
        if (trace == null || trace.length == 0) {
            i("error", "log: get trace info failed");
        }
        String className = getSimpleClassName(trace[0].getClassName());
        i(className, logFilter + ": " + trace[0].getMethodName() + ":\t" + trace[0].getLineNumber());
    }
    public static void logAll(Exception e, String msg) {
        StackTraceElement[] trace = e.getStackTrace();
        if (trace == null || trace.length == 0) {
            i("error", "log: get trace info failed");
        }
        String className = getSimpleClassName(trace[0].getClassName());
        i(className, logFilter + ": " + trace[0].getMethodName() + ":\t" + trace[0].getLineNumber() + "\t" + msg);
    }

    private static String getSimpleClassName(String fullClassName) {
        String split = "_";
        String className = "";

        StringTokenizer token = new StringTokenizer(fullClassName, split);
        while (token.hasMoreTokens()) {
            className = token.nextToken();
        }
        return className;
    }
}
