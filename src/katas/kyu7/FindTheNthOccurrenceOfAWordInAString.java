package katas.kyu7;

public class FindTheNthOccurrenceOfAWordInAString {

  public static int findNthOccurrence(String subStr, String str, int occurrence) {
    int i = -1, j = 0;
    while (j < occurrence) {
      i = str.indexOf(subStr, i + 1); j++;
    }
    return i;
  }
}
