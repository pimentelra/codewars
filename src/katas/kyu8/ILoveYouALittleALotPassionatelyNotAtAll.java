package katas.kyu8;

public class ILoveYouALittleALotPassionatelyNotAtAll {
    public static String howMuchILoveYou(int nb_petals) {
        int number = nb_petals % 6;
        String answer = "";

        switch (number) {
            case 0:
                answer = "not at all";
                break;
            case 1:
                answer = "I love you";
                break;
            case 2:
                answer = "a little";
                break;
            case 3:
                answer = "a lot";
                break;
            case 4:
                answer = "passionately";
                break;
            case 5:
                answer = "madly";
                break;
        }

        return answer;
    }
}
