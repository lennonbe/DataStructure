import java.util.*;

public class Task1
{
    public static void main(String[] args)
    {
        ArrayList<String> log = new ArrayList<>();
        ArrayList<String> log2 = new ArrayList<>();
        log.add("Hello world!");
        log.add("SPAM...");
        log.add("The Eagle has landed...");
        log.add("SPAM...");
        log.add("SPAM...");
        log.add("SPAM...");

        log2.add("hello there");
        log2.add("bye there");

        log.addAll(log2);
        //log.removeAll(log2);


        for (String s : log)
        System.out.println(s);
    }
}
