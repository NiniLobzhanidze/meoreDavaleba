package ge.automation;


abstract class Counter {
    abstract void CountVowel(String str);

}
class Counter1 extends Counter {

    @Override
    void CountVowel(String str) {
        String vowels = "a, e, i, o, u";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (vowels.indexOf(s) !=-1) {
                vowelCount++;
            }
        }
        System.out.println("ამ სტრიქონში არის " + vowelCount + " ხმოვანი");
    }
}
public class Main {
    public static void main(String[] args) {

        Counter1 vowelCounter = new Counter1();

        vowelCounter.CountVowel("Hello");
        vowelCounter.CountVowel("I love testing");
    }
}