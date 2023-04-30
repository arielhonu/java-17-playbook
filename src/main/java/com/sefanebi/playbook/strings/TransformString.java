package com.sefanebi.playbook.strings;

public class TransformString {
    public static void main(String[] args) {
        String lotteryWin = " 100 usd ";
        String result = lotteryWin
                .replaceAll("[a-z]", "")
                .strip();

        String formattedResult = formatNumber(result);
        System.out.println(formattedResult.toUpperCase());

        String finalResult = lotteryWin
                .replaceAll("[a-z]", "")
                .strip()
                .transform(TransformString::formatNumber)
                .toUpperCase();

        System.out.println(finalResult);

        finalResult = lotteryWin
                .transform(s -> s.replaceAll("[a-z]", ""))
                .transform(String::strip)
                .transform(TransformString::formatNumber)
                .transform(String::toUpperCase);

    }

    private static String formatNumber(String num){
        if(Integer.parseInt(num) < 100){
            return "Nice! You've won: " + num;
        } else {
            return "Great news! You've won: " + num;
        }
    }
}
