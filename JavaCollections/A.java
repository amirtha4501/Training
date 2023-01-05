
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class A {
  public static void main(String[] args) {

    Collection<String> c = new ArrayList<>();
    c.add("teddy");
    c.add("chocky");
    c.add("skaty");
    c.add("bounty");
    c.add("bounty");

    Collection<String> favoriteThings = new HashSet<>(c);
    System.out.println(c);
    System.out.println(favoriteThings);

  }
}