import java.util.Hashtable;

public class Main
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Andrzej");
        hashtable.put(2, "Bartek");
        hashtable.put(3, "Cezary");
        System.out.println(hashtable);
    }
}