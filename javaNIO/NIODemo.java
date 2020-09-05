import java.io.IOException;  
import java.nio.ByteBuffer;  

class NIODemo {

    public static void main(String[] args) {
    
        ByteBuffer buffer = ByteBuffer.allocate(48);

        int bytesRead = sourceChannel.read(buffer);
        
        while(! bufferFull(bytesRead) ) {
            bytesRead = inChannel.read(buffer);
        }
    }
}
