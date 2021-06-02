package katas.kyu7;

public class UglifyWord {
  public static String uglifyWord(String str) {
    boolean flag = true;
    StringBuilder answer = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        c = flag ? Character.toUpperCase(c) : Character.toLowerCase(c);
        flag = !flag;
      } else {
        flag = true;
      }
      answer.append(c);
    }
    return answer.toString();
  }
}
