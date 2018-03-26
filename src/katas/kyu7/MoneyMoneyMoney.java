package katas.kyu7;

public class MoneyMoneyMoney {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int answer = 0;
        while (principal < desired) {
            principal += (principal * interest) - ((principal * interest) * tax);
            answer++;
        }
        return answer;
    }
}
