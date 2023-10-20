package co.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        String name = "Coding Dojo";
        int age = 100;
        String hometown = "Burbank CA";
        String message = String.format("""
                My name is %s
                I am %d years old
                My hometown is %s                                
                """, name, age, hometown );
        System.out.println(message);
    }
}