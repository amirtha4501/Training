
import java.util.Collection;
import java.util.ArrayList;

public class B {
  public static void main(String[] args) {

    Collection c1 = new ArrayList(); // Same collection type, different element type
    c1.add("canada");
    c1.add(1L);
    c1.stream()
      .forEach(e -> System.out.println(e.getClass()));

    Collection<Room> c2 = new ArrayList<>();
    // c2.add(2L); - err
    c2.add(new Room("canada", "africa", 3, 440.5));

    c2.stream()
      .forEach(e -> System.out.println(e.getClass()));

    System.out.println(c1);
  }
}

class Room {
  Room(String a, String b, int c, Double d) {
    a = a;
    b = b;
    c = c;
    d = d;

  }
}