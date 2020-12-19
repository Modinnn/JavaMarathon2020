package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    public static int recursionSum(int[] numbers) {
        if (numbers.length == 1) return numbers[0];
        int[] newNumbers = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length - 1);
        newNumbers[numbers.length - 2] = numbers[numbers.length - 2] + numbers[numbers.length - 1];
        return recursionSum(newNumbers);
    }
}
