/*
    REQUIREMENTS:
        - To write a program to write and read the string to a channel using buffer(to demonstrate Pipe)
    ENTITIES:
        - PipeDemo
    WORK TO BE DONE:
        - create instance of pipe
        - access sink channel to write
        - create buffer with capacity of 500 bytes
        - write into buffer
        - return true if there is at least one element remaining in the buffer
        - print buffer value while it has content
*/

import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.Pipe;

class PipeDemo {

    public static void main(String[] args) throws IOException {  
          
        Pipe pipe = Pipe.open();

        Pipe.SinkChannel sinkChannel = pipe.sink();

        String testString = "This is my string to write...";
        
        ByteBuffer bufferWrite = ByteBuffer.allocate(500); 
        bufferWrite.clear(); 
        bufferWrite.put(testString.getBytes()); 
        bufferWrite.flip(); 

        while(bufferWrite.hasRemaining()) { 
            sinkChannel.write(bufferWrite); 
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        ByteBuffer buffer = ByteBuffer.allocate(500);

        while(sourceChannel.read(buffer) > 0) {
            buffer.flip();
            while(buffer.hasRemaining()) {
                char character = (char) buffer.get();
                System.out.print(character);
            }
            buffer.clear();
        }
    }
}
