public class Calculator{

  public static double eval(String s){
    Double first;
    Double second;
    String[] str = s.split(" ", 0);
    MyDeque<String> arr = new <String> MyDeque(20);
    for (int i = 0; i < str.length; i++) {
      try {
        Double.parseDouble(str[i]);
        arr.addLast(str[i]);
        //System.out.println(arr.toString());
      } catch (NumberFormatException nfe) {
        second = Double.parseDouble(arr.removeLast());
        first = Double.parseDouble(arr.removeLast());
        if (str[i] == "+") {
          arr.addLast(Double.toString(first + second));
      } else if (str[i] == "-") {
          arr.addLast(Double.toString(first - second));
      } else if (str[i] == "*") {
          arr.addLast(Double.toString(first * second));
      } else if (str[i] == "/") {
          arr.addLast(Double.toString(first / second));
      } else if (str[i] == "%") {
          arr.addLast(Double.toString(first % second));
      } else {
        //  throw error here...
      }

      }
    }
    return 0;
  }
}
