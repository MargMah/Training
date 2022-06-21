public class Intromethods {
    public static String printHello(String name){
        return "Hello " + name;
    }

     //  public static int sum(int a, int b){
    //   int c = a + b;
    //   return c;
    // return a+b;
   // }

    public static void main(String[] args) {
        String result = printHello("Penelope");
        System.out.println(printHello("Tim"));
        result = printHello("Bob");
    }
}

