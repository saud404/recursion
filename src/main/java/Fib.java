
public class Fib {
    static int zeroCount = 0;
    static  int oneCount = 0;
    public static int stupidAdd(int curr, int inc) {
        if (inc < 1) {
            return curr;
        } else {
            curr += 1;
            inc -= 1;
            return stupidAdd(curr, inc);
        }
    }
    public static int fib(int num){
        if(num == 0){
            zeroCount++;
            return 0;
        } else if(num == 1) {
            oneCount++;
            return  1;
        } else {
            return fib(num -1) + fib(num - 2);
        }
    }

    public static int fibIter(int num){
        if(num ==0){
            return 0;
        } else if(num == 1){
                return 1;
        }
    int prev = 0;
    int curr = 1;
    int value = 0;
    for(int i = 2; i < num; i++){
        value = curr + prev;
        prev = curr;
        curr = value;

    }
    return value;
    }
}
