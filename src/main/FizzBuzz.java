package main;

public class FizzBuzz {

    public String printNumbers(Integer min, Integer max) {
        StringBuilder result = new StringBuilder();
        while (min <= max) {
            result.append(stringFor(min));
            result.append(min < max ? "," : "");
            min++;
        }
        return result.toString();
    }

    private String stringFor(Integer number) {
        if (divisibleByThreeAndFive(number))
            return "FizzBuzz";
        if (isFizz(number))
            return "Fizz";
        if (divisibleByFive(number))
            return "Buzz";
        return number.toString();
    }

    private boolean isFizz(Integer number) {
        return divisibleByThree(number) || hasDigitInNumber(3,number);
    }

    private boolean hasDigitInNumber(Integer digit,Integer number) {
        return number.toString().contains(digit.toString());
    }

    private boolean divisibleByThreeAndFive(Integer number) {
        return divisibleByThree(number) && divisibleByFive(number);
    }

    private boolean divisibleByFive(Integer number) {
        return number % 5 == 0;
    }

    private boolean divisibleByThree(Integer number) { return number % 3 == 0;}
}
