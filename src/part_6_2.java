public class part_6_2 {
    public static void multadd (double x1){
        expSum(x1);
    }

    public static void expSum(double x){
        System.out.println(x * Math.exp(-x) + Math.sqrt(1-Math.exp(-x)));
    }

    public static void main(String[] args) {
        multadd (1);

        double calc1 = Math.sin(Math.PI/4) + Math.cos(Math.PI/4)/2;
        double calc2 = Math.log(10) + Math.log(20);

        System.out.println(calc1);
        System.out.println(calc2);
    }
}
