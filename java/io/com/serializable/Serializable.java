package com.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable {

	 //序列化 
    public static void main(String[] args) throws Exception 
    {
        //序列化后生成指定文件路径 
    	String path = (File.separator + "root" + File.separator + "z" + File.separator + "f.txt");
        File file = new File(path);
        ObjectOutputStream oos = null ;
        //装饰流（流）
        oos = new ObjectOutputStream(new FileOutputStream(file)) ; 
        //实例化类 
        Person per = new Person("faith",20) ;
        oos.writeObject(per) ;
        //把类对象序列化
        oos.close() ;
    } 
}
