public class Recursion_Steps_Counter {
        public static void main(String[] args) {
            int num = 14;
            System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        return Helper(num,0);
    }
    public static int Helper(int num, int c){
        if (num == 0){
            return c;
        }
        if ( num%2 == 0){
            return Helper(num/2,c+1);
        }
        return Helper(num-1,c+1);
    }
}


