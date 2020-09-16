import java.util.ArrayList;
import java.util.List;

class ListDemo {
    
    public static void main(String[] args) {
        List<Integer> listSender = new ArrayList<Integer>();  
        List<Integer> listReceiver = new ArrayList<Integer>();  

        for (int i = 1; i <= 10; i++) {
            listSender.add(i);
        }

        System.out.println("Sender: " + listSender);
        System.out.println("Receiver: " + listReceiver);

        listReceiver.addAll(listSender);
        System.out.println("Receiver after addAll(): " + listSender);

        listSender.add(5);
        System.out.println("\nSender " + listSender + "\nindexOf(5): " + listSender.indexOf(5));
        System.out.println("lastIndexOf(5): " + listSender.lastIndexOf(5));
    }
}