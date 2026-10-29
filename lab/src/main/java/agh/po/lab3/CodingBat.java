package agh.po.lab3;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        boolean res1 = cb.sleepIn(false, false);
        int res2 = cb.diff21(19);
        String res3 = cb.helloName("Bob");
        boolean res4 = cb.firstLast6(new int[]{1, 2, 6});

        System.out.println("sleepIn: " + res1);
        System.out.println("diff21: " + res2);
        System.out.println("helloName: " + res3);
        System.out.println("firstLast6: " + res4);
    }
}