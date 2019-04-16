package org.olexec.Test;

import org.olexec.OnlineExecutorApplication;
import org.olexec.controller.RunCodeController;

import java.lang.reflect.Field;

public class TetstReflect {
    //反射：运行时获取类的所有信息

    public static void main(String[] args)  throws Exception {
        Class<?> cls = Class.forName("org.olexec.controller.RunCodeController");
        RunCodeController run = (RunCodeController)cls.newInstance();
        Field df = cls.getDeclaredField("defaultSource");
        System.err.println(df.toString()+"--------");
        System.out.print(df.toString()+"--------");

    }
}
