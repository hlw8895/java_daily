package test.demo.src;

public class Demo {
    public static void main(String args[]) {
        String strings[] = { "started", "starting", "ended", "ending" };
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].substring(strings[i].length() - 2, strings[i].length()).equals("ed")) {
                System.out.println(strings[i]);
            }
        }
    }

    public static void swap() {
        
    }
}
