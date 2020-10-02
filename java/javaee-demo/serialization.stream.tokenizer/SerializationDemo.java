/*
    REQUIREMENTS:
        - To create a File, get the Following fields as input from the user
            -> Name
            -> studentId
            -> Address
            -> Phone Number
    ENTITIES:
        - SerializationDemo
        - SerializableClass
    WORK TO BE DONE:
        - create a class called SerializableClass
        - add and initialise data fields such as name, studentId, address, phoneNumber
        - create a class called SerializableDemo
        - write data into a file using fileoutputstream and objectoutputstream
        - print the value using fileinputstream
*/

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class SerializableClass implements Serializable {
    String name;
    int studentId;
    String address;
    long phoneNumber;
 
    SerializableClass(String name, int studentId, String address, long phoneNumber) {
        this.name = name;
        this.studentId = studentId;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}


class SerializationDemo {

    public static void main(String[] args) {
        
        SerializableClass serializableClass = new SerializableClass("ammu", 8, "abc st", 98765432);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("detail.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serializableClass);
            System.out.println("Serialized data is saved in detail.txt");
        
            FileInputStream fileInputStream = new FileInputStream("detail.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
            int studentId = objectInputStream.readInt();

            objectInputStream.close();
            objectOutputStream.close();

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
