import java.io.*;

class IODemo {
    public static void main(String[] args) {
        InputStream input = new FileInputStream("...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        
        String name = reader.readLine();
        String age = reader.readLine();
        String phone = reader.readLine();        
    }
}
