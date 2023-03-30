import java.util.Scanner;

public class hatszogyep {
    double oldal1;
    double oldal2;

    public hatszogyep() {
        beker();
        calcHexArea(oldal1);
    }
    public void beker(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Az első telek oldalának hossza (Nem erre épül a ház!): ");
        String oldal1Str = sc.nextLine();
        System.out.print("A második telek oldalának hossza (Erre épül a ház!): ");
        String oldal2Str = sc.nextLine();
        if (checkBeker(oldal1Str)) {
            oldal1 = Double.parseDouble(oldal1Str);
        }
        if (checkBeker(oldal2Str)) {
            oldal2 = Double.parseDouble(oldal2Str);
        }
        
    }
    private Boolean checkBeker(String input){
        if (input.matches("/^[0-9]+.[0-9]*$/")) {
           return true; 
        }else{
            return false;
        }
    }
    private double calcHexArea(double side){
        double area = (3. / 2) * 
        return 0;
    }
}
