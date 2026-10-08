public class Main {
    public static void main(String[] args) {

        String text = "Apple,Banana,Orange";

        String[] fruits = text.split(",");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}