package katas.kyu7;

public class JavaFunctionalProgrammingPart1TheBeginning {
    public static Function<Student, Boolean> f = s -> s.getFullName().equals("John Smith") && s.studentNumber.equals("js123");
}
