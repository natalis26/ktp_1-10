public class task1 {
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(Square(3, 2));
        System.out.println(Feet(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        double[] arr = {1, 5, 9};
        System.out.println(sumOfCubes(arr));
        System.out.println(abcmath(42, 5, 10));
    }

    public static int remainder(int A, int B) {
        return (A % B);
    }

    public static double Square(double C, double D) {
        return (C * D * 0.5);
    }

    public static int Feet(int A, int B, int C) {
        return (A * 2 + B * 4 + C * 4);
    }

    public static Boolean profitableGamble(double A, double B, double C) {
        if (A * B > C)
            return true;
        else
            return false;
    }

    public static String operation(double N, double A, double B) {
        if (A + B == N)
            return ("added");
        else if (A - B == N)
            return ("subtracted");
        else if (A * B == N)
            return ("multiplied");
        else if (A / B == N)
            return ("divided");
        else
            return ("none");
    }

    public static int ctoa(char A) {
        return A;
    }

    public static int addUpTo(int A) {
        int s = 0;
        for (int i = A; i > 0; i--) {
            s = s + i;
        }
        return (s);
    }

    public static int nextEdge(int A, int B) {
        return (A + B - 1);
    }

    public static double sumOfCubes(double[] arr) {
        double s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + Math.pow(arr[i], 3);
        }
        return (s);
    }
    public static Boolean abcmath(int A, int B, int C) {
        for (int i = 0; i < B; i ++)
            A += A;
        if (A%C==0)
            return true;
        else
            return false;
    }
}



