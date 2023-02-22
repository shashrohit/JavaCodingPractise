package org.shashank.knowledge.popularinterfaces;

/*
Serialization is a mechanism of converting a java object into a byte stream.
Deserialization is the reverse process where the byte stream is used to recreate the
actual Java object in memory.
The byte stream created is platform independent.
So, the object serialized on one platform can be deserialized on a different platform.

To make a Java object serializable we implement the java.io.Serializable interface.
A marker interface (so, has no methods) is used to “mark” java classes
so that objects of these classes may get certain capability.

The ObjectOutputStream class contains writeObject() method for serializing an Object.
public final void writeObject(Object obj) throws IOException

The ObjectInputStream class contains readObject() method for deserializing an object.
public final Object readObject() throws IOException, ClassNotFoundException

1. If a parent class has implemented Serializable interface then
child class does not need to implement it but vice-versa is not true.
2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization.
If you don’t want to save value of a non-static data member then make it transient.
 */

import java.io.*;

class Demo implements java.io.Serializable
{
    public int a;
    public String b;

    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}
public class SerializableExample {

    public static void main(String[] args)
    {
        Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.txt";
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);
            out.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            Demo object1 = (Demo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }

}
