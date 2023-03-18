import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj a: ");
    int a = scanner.nextInt();
    System.out.println("Podaj b: ");
    int b = scanner.nextInt();
    System.out.println("Podaj c: ");
    int c = scanner.nextInt();
    int delta = (b*b) - (4*a*c);
    System.out.println("Delta wynosi: "+delta);
    if(delta>0){
      double x1 = (-b+(Math.sqrt(delta)))/(2*a);
      double x2 = (-b-(Math.sqrt(delta)))/(2*a);
      System.out.println("X1= "+x1);
      System.out.println("X2= "+x2);
    }
    if(delta==0){
      double x = (-b)/(2*a);
      System.out.println("X= "+x);
    }
    if(delta<0){
      System.out.println("Brak rozwiązań równania kwadratowego.");
    }
  }
}