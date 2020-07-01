public class goe_0701 {
    public static void main(String[] args) {
        double yd = 91.44;
        double in = 2.54;

        double ydVal = 2.1;
        double inVal = 10.5;

        String ydConverter = String.format("%.1f", ydVal*yd);
        String inConverter = String.format("%.1f", inVal*in);

        System.out.println(ydVal + "yd = " + ydConverter +"cm");
        System.out.println(inVal + "in = " + inConverter +"cm");
        
    }
}
