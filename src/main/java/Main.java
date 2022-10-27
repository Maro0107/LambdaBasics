public class Main {
    public static void main(String[] args) {

        Addition addition = (int a,int b) -> a + b;


        System.out.println(addition.add(10, 12));
        System.out.println(addition.add(2, 6));

        LambdaBasics lambdaBasics = new LambdaBasics(100, 50);
        lambdaBasics.test(addition);
        lambdaBasics.test((int a,int b) -> a - b);
    }
}
