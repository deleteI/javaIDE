﻿# 基于 SpringBoot 的在线 Java IDE

本项目基于 SpringBoot 实现了一个在线的 Java IDE，可以远程运行客户端发来的 Java 代码的 main 方法，并将程序的标准输出内容、运行时异常信息反馈给客户端，并且会对客户端发来的程序的执行时间进行限制。

项目中涉及的框架相关知识并不多，主要涉及了许多 Java 基础的知识，如：Java 程序编译和运行的过程、Java 类加载机制、Java 类文件结构、Java 反射等。除此之外，还涉及到了一个简单的并发问题：如何将一个非线程安全的类变为一个线程安全的类。
