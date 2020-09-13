import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Quadratic Calculator");
    while(true){
    System.out.println("[1] quadratic formula");
    System.out.println("[2] solve for vertex");
    System.out.println("[3] exit");
    System.out.println("");
    String tempEnter = in.nextLine();

      try {
        Integer.parseInt(tempEnter);
      }
      catch (NumberFormatException nfe){
        System.out.println("Invalid input.");
        continue;
      }

      int enter = Integer.parseInt(tempEnter);

      if (enter == 1){
      //quadratic formula
        System.out.println("Enter a: ");
        double a = in.nextDouble();
        System.out.println("Enter b: ");
        double b = in.nextDouble();
        System.out.println("Enter c: ");
        double c = in.nextDouble();
        double[]result = getX(a, b, c);
        System.out.println(a + "x² + " + b + "x + " + c + " = ");
        System.out.println("x = " + result[0] + " and " + result[1]);
      }
      else if (enter == 2){
      //solve for vertex
        System.out.println("Enter a: ");
        double a = in.nextDouble();
        System.out.println("Enter b: ");
        double b = in.nextDouble();
        System.out.println("Enter c: ");
        double c = in.nextDouble();
        double[]result2 = getVertex(a, b, c);
        System.out.println(a + "x² + " + b + "x + " + c + " = ");
        System.out.println("(" + result2[0] + ", " + result2[1] + ")");
      }
      else if (enter == 3){
      //exit
        System.out.println("Exiting...");
      break;
      }
      else {
        System.out.println("Invalid input.");
      }
      System.out.println("");
    }
    in.close();
  }
  public static double[]getX(double a, double b, double c){
    double res = Math.sqrt((b*b)-4*a*c);
    double[]xValues = {(-b - res)/(2*a), (-b + res)/(2*a)};
    return xValues;
  }

  public static double[]getVertex(double a, double b, double c){
    double x = (-b/(2*a));
    double y = (a*(x*x))+(b*x)+c;
    double[]vertexValues = {x, y};
    return vertexValues;
  }
}
