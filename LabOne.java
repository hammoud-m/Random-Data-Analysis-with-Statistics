import java.util.Random;

public class LabOne {

    public static void main(String [] agrs) {
        double random = new Random().nextDouble();
        double arr[] = createArray(10000);

        double aver = average(arr);
        double vari = variance(arr);

        System.out.println(random + "   ");
        print(arr);
        System.out.println("average: " + aver);
        System.out.println("variance: " + vari);
    }

    public static double[] createArray(int size) {
        int p = 1;
        double probility = 0.12;
        double [] o = new double[size];
        int  i = 0;
        while(i < o.length) {
            double rand = new Random().nextDouble();
            if(rand > probility) {
                o[i] = p;
                i++;
                p = 1;
            }
            else
                p++;
        }
        return o;
    }

    public static void print(double [] a) {
        for(int j = 0; j < a.length;j++) {   // print array
            System.out.println(a[j]);
        }
    }

    public static double average(double [] a) {
        double sum = 0.0;
        for(int i = 0;i< a.length;i++) {
            sum += a[i];
        }
        return sum/a.length;
    }

    public static double variance(double [] a) {
        double Vari = 0.0;
        double averag = average(a);

        for(int i = 0; i < a.length; i++) {
            Vari += ((a[i] - averag)*(a[i] - averag));
        }

        return Vari/a.length;
    }
}