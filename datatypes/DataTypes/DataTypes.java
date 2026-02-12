package pkg1.datatypes;
import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                String s = sc.next();
                
                if (!s.matches("[+-]?\\d+")) {
                    System.out.println(s + " can't be fitted anywhere.");
                    continue;
                }
                
                BigInteger n = new BigInteger(s);
                
                boolean canFit = false;
                
                System.out.println(s + " can be fitted in:");
                
                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                    canFit = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                    canFit = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                    canFit = true;
                }
                
                if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                    canFit = true;
                }
                
                
                if (!canFit) {
                    
                    System.out.println("(can't be fitted anywhere)");
                }
            }
        }
    }
}
