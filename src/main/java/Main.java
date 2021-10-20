import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator");
    System.out.println("type 'quit' to exit");
    System.out.println("\n enter a command:");

    while(true) {
      Scanner s=new Scanner(System.in);

      String input = s.nextLine();
      if (input.equals("quit")) {
        return;
      }
      String[] cmdarray =(input.split(" "));

      String command = cmdarray[0];
      Calculator calc = new Calculator();
      switch (command) {
        case "add": {
          int result=calc.add(Integer.parseInt(cmdarray[1]), Integer.parseInt(cmdarray[2]));
          System.out.println(result);
          break;
        }
        case "sub": {
          int result=calc.subtract(Integer.parseInt(cmdarray[1]), Integer.parseInt(cmdarray[2]));
          System.out.println(result);
          break;
        }
        case "mult": {
          int result=calc.multiply(Integer.parseInt(cmdarray[1]), Integer.parseInt(cmdarray[2]));
          System.out.println(result);
          break;
        }
        case "div": {
          int result=calc.divide(Integer.parseInt(cmdarray[1]), Integer.parseInt(cmdarray[2]));
          System.out.println(result);
          break;
        }
        case "fib": {
          int result=calc.fibonacciNumberFinder(Integer.parseInt(cmdarray[1]));
          System.out.println(result);
          break;
        }
        case "binary": {
          String result=calc.intToBinaryNumber(Integer.parseInt(cmdarray[1]));
          System.out.println(result);
          break;
        }
        default:
          System.out.println("Unknown command");
          break;
      }
    }
  }
}
