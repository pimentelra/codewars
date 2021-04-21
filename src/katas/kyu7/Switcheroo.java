package katas.kyu7;

public class Switcheroo {
  public static String switcheroo(String x){
    return x.replace('a', 'X').replace('b', 'a').replace('X', 'b');
  }
}
