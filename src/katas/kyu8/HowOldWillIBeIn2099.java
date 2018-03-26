package katas.kyu8;

public class HowOldWillIBeIn2099 {
    public String CalculateAge(int birth, int yearTo) {
        int age = yearTo - birth;
        String answer = "";

        if (age == 0)
            return "You were born this very year!";

        if (age < 0) {
            answer += "You will be born in " + Math.abs(age);
            answer += Math.abs(age) > 1 ? " years." : " year.";
        }

        if (age > 0) {
            answer += "You are " + Math.abs(age);
            answer += Math.abs(age) > 1 ? " years old." : " year old.";
        }

        return answer;
    }
}
