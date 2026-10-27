public class MyInteger {
    int value = 0;

    MyInteger(int newValue){
        value = newValue;
    }

    int getValue() {
        return value;
    }

    boolean isEven(){
        if(value % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isOdd(){
        if(value % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }

    boolean isPrime(){
        for (int n = 2; n <= Math.sqrt(value); n++){
            if(value % n == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int newValue){
        if(newValue % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isOdd(int newValue){
        if(newValue % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }

    static boolean isPrime(int newValue){
        for (int n = 2; n <= Math.sqrt(newValue); n++){
            if(newValue % n == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(MyInteger newValue){
        return newValue.isEven();
    }

    static boolean isOdd(MyInteger newValue){
        return newValue.isOdd();
    }

    static boolean isPrime(MyInteger newValue){
        return newValue.isPrime();
    }

    boolean equals(int newValue){
        if(value == newValue){
            return true;
        }
        else{
            return false;
        }
    }

    boolean equals(MyInteger newValue){
        if(value == newValue.getValue()){
            return true;
        }
        else{
            return false;
        }
    }

    static int parseInt(char[] input){
        String str = new String(input);
        return Integer.parseInt(str);
    }

    static int parseInt(String input){
        return Integer.parseInt(input);
    }
}
