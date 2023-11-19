public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if(b == 0) {
            throw new IllegalArgumentException("You can't divide be zero!");
        } else {
            return a/b;
        }
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        System.out.println("Решим уравнение 7x-1=13");
        return div(add(13, 1), 7);
    }
}
