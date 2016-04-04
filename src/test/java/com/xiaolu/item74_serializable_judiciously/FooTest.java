package com.xiaolu.item74_serializable_judiciously;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FooTest {

    private static final String FILE_PATH = "/Users/xiao.lu/Downloads/foo.ser";

    @Test
    public void serializationTest() throws Exception {
        Foo foo = new Foo(1, 2);

        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(foo);
            /*oos.close();
            fos.close();*/

            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Foo foo1 = (Foo) ois.readObject();
            System.out.println(foo1.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
