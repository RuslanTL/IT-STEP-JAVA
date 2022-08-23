public class Main {
    public static void Problem1(int n){
        System.out.println("all numbers smaller than " + n +" that divide by 3:");
        for(int i =0; i<n;i++){
            if(i%3 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void Problem2(int n){
        System.out.println("all numbers smaller than " + n +" that divide by 3 or 7:");
        for(int i =0; i<n;i++){
            if(i%3 == 0 || i%7 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void Problem4(int n){
        double sum=0;
        for(int i =1;i<=n;i++){
            double frac = (double)1/i;
            System.out.print(frac + " ");
            sum+=frac;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void Problem5(int n){
        double sum = 0;
        for(int i =1; i<=n ; i++){
            double sqr = Math.pow(2,i);
            sum+=sqr;
            System.out.print(sqr + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void Problem14(int n){
        for (int i =1;i<=10;i++){
            System.out.println(i*n + " = " + i + " * " + n);
        }
    }
    public static void main(String[] args){
        Problem14(5);
    }
}
