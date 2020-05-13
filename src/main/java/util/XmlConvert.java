package util;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class XmlConvert {


    public static String object2XML(Object obj, String outFileName)
            throws FileNotFoundException {
        // 构造输出XML文件的字节输出流
        File outFile = new File(outFileName);
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(outFile));
        // 构造一个XML编码器
        XMLEncoder xmlEncoder = new XMLEncoder(bos);
        // 使用XML编码器写对象
        xmlEncoder.writeObject(obj);
        // 关闭编码器
        xmlEncoder.close();

        return outFile.getAbsolutePath();
    }


    public static Object xml2Object(String inFileName)
            throws FileNotFoundException {
        // 构造输入的XML文件的字节输入流
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(inFileName));
        // 构造一个XML解码器
        XMLDecoder xmlDecoder = new XMLDecoder(bis);
        // 使用XML解码器读对象
        Object obj = xmlDecoder.readObject();
        // 关闭解码器
        xmlDecoder.close();

        return obj;
    }

    public static void main(String[] args) throws IOException {

        // 构造一个StudentBean对象
        StudentBean student = new StudentBean();
        student.setName("wamgwu");
        student.setGender("male");
        student.setAge(15);
        student.setPhone("55556666");

        // 将StudentBean对象写到XML文件
        String fileName = "C:\\Users\\AndyYu\\Desktop\\AStudent.xml";
        XmlConvert.object2XML(student, fileName);
        // 从XML文件读StudentBean对象
        StudentBean aStudent = (StudentBean)XmlConvert.xml2Object(fileName);
        // 输出读到的对象
        System.out.println(aStudent.toString());
    }
}