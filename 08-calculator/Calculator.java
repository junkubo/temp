public class Calculator{
  public static double eval(String s){
    String[] str = s.split(" ", 0);
    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
    return 0;
  }
}
