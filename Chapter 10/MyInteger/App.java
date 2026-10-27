public class App {
    public static void main(String[] args) throws Exception {
        MyInteger integer1 = new MyInteger(6);
        MyInteger integer2 = new MyInteger(27);
        System.out.println("Integer 1: Even: " + integer1.isEven() + " Odd: "+ integer1.isOdd() + " Prime: " + integer1.isPrime());
        System.out.println("Integer 2: Even: " + MyInteger.isEven(integer2) + " Odd: "+ MyInteger.isOdd(integer2) + " Prime: " + MyInteger.isPrime(integer2));
        System.out.println("The number 7: Even: " + MyInteger.isEven(7) + " Odd: " + MyInteger.isOdd(7) + " Prime: " + MyInteger.isPrime(7));
        System.out.println("Does Integer 1 equal 5?: " + integer1.equals(5));
        System.out.println("Does Integer 2 equal 27?: " + integer2.equals(27));
        System.out.println("Do Integer 1 and Integer 2 equal each other?: " + integer1.equals(integer2));
        int int1 = MyInteger.parseInt("227");
        int int2 = MyInteger.parseInt(new char[]{'3', '4', '2', '5'});
        System.out.println("int 1: " + int1 + " int 2: " + int2 + " sum: " + (int1 + int2));
    }
}
