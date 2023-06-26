/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String SumAve1(int x, int y) {
        int z = new Calculate().sum(x, y);
        double ave = new Calculate().ave(z, (y-x+1));
        return "Sum of " + x + " and " + y + " is " + z + ".Average is " + ave + ".";
    }

    public String SumAve2(int x, int y) {
        int z = 0;
        for(int i = x; i <= y; i++){
            z = new Calculate().sum(z, i);
        }
        double ave = new Calculate().ave(z, (y-x+1));
        return "Sum of " + x + " to " + y + " is " + z + ".Average is " + ave + ".";
    }

    public String SumAve3(int x, int y) {
        int odd = 0;
        int even = 0;
        for(int i = x; i <= y; i++){
            if(i%2!=0){
                odd = new Calculate().sum(odd, i);
            }else{
                even = new Calculate().sum(even, i);
            }
        }
        return "Sum of odd of " + x + " to " + y + " is " + odd + ".Sum of even is " + even + ".";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().SumAve1(2, 3));
        System.out.println(new App().SumAve2(1, 10));
        System.out.println(new App().SumAve3(1, 10));
    }
}
