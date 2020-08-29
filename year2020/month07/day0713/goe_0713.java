package OAS;

public class goe_0713 {
    public static void main(String[] args) {
        
        String str = " ";

        for(int i = 2; i <= 4 ; i++){
            for(int j = 1; j <= 5; j++){
                System.out.printf(i + " * " + j + " =");
                System.out.printf("%3d",  (i*j) );
                System.out.printf("%3s", str);
                if(j == 5) {
                    System.out.println();
                }
            }
        }
    }
}
