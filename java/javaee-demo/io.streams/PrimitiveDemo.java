/*
    REQUIREMENTS:
        - To write primitive datatypes to file using by dataoutputstream
    ENTITIES:
        - PrimitiveDemo
    WORK TO DONE:
        - create variables with datatype int, float, String
        - give file output stream of cities to data output stream
        - write the variables to it
        - give file input stream of cities to data input stream
        - display the values
    PSEUDOCODE:
        {
            In the main function

            int rollNo = 1;
            String name = "ammu";
            float gpa = 10.0f;

            FileOutputStream fileOutputStream = new FileOutputStream("cities.txt")
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)

            dataOutputStream.writeInt(rollNo)
            dataOutputStream.writeUTF(name)
            dataOutputStream.writeFloat(gpa)

            FileInputStream fileInputStream = new FileInputStream("cities.txt")
            DataInputStream dataInputStream = new DataInputStream(fileInputStream)

            int rollNumber = dataInputStream.readInt()
            String studentName = dataInputStream.readUTF()
            float studentGpa = dataInputStream.readFloat()

            System.out.println(rollNumber, studentName, studentGpa)
        }
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveDemo {

    public static void main(String[] args) throws Exception{
        int rollNo = 1;
        String name = "ammu";
        float gpa = 10.0f;

        FileOutputStream fileOutputStream = new FileOutputStream("cities.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeInt(rollNo);
        dataOutputStream.writeUTF(name);
        dataOutputStream.writeFloat(gpa);

        dataOutputStream.flush();
        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cities.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int rollNumber = dataInputStream.readInt();
        String studentName = dataInputStream.readUTF();
        float studentGpa = dataInputStream.readFloat();

        System.out.println("Roll No.: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("GPA: " + studentGpa);
    }
}
