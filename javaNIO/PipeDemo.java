import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.Pipe;

class PipeDemo {

    public static void main(String[] args) throws IOException {    
        Pipe pipe = Pipe.open(); // create instance of pipe

        /* WRITING TO A FILE */
        Pipe.SinkChannel sinkChannel = pipe.sink(); // to access sink channel to write

        String testString = "This is my string to write...";
        
        ByteBuffer bufferWrite = ByteBuffer.allocate(500); // create buffer with capacity of 500 bytes
        bufferWrite.clear(); // make buffer ready for writing
        bufferWrite.put(testString.getBytes()); // get byte value of string and pass it to put method as parameter
        bufferWrite.flip(); // switches a buffer from writing mode to reading mode

        while(bufferWrite.hasRemaining()) { // return true if there is at least one element remaining in the buffer
            sinkChannel.write(bufferWrite); // write into buffer
        }

        /* READING FROM A PIPE */
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
