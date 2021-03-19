package katas.kyu7;

public class SimpleStringDivision {

  public static long solve(String st, int k) {
    long answer = 0; int size = st.length() - k;
    for (int i = 0; i < st.length() - size + 1; i++) {
      long temp = Long.parseLong(st.substring(i, i + size));
      if (temp > answer) answer = temp;
    }
    return answer;
  }
}
