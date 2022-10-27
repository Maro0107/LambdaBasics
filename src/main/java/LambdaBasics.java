public class LambdaBasics{
    int a,b;

    public LambdaBasics(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void test(Addition addition){
        System.out.println(addition.add(a,b));

    }
}
