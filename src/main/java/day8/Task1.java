package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = new String();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            string = string + i + " ";
        }
        System.out.println(string);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        StringBuilder strungBuild = new StringBuilder();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            strungBuild = strungBuild.append(i).append(" ");
        }
        System.out.println(strungBuild);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}
