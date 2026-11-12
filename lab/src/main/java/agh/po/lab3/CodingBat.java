package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;

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


    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        boolean res1 = cb.sleepIn(false, false);
        int res2 = cb.diff21(19);
        String res3 = cb.helloName("Bob");
        boolean res4 = cb.firstLast6(new int[]{1, 2, 6});


        Map<String, String> mojaMapa = new HashMap<>();
        mojaMapa.put("a", "Hi");
        mojaMapa.put("b", "There");
        Map<String, String> wynikMapy = cb.mapAB(mojaMapa);
        String[] testWords = {"a", "bb", "a", "bb"};
        Map<String, Integer> wynikWordLen = cb.wordLen(testWords);
        String[] testWords2 = {"this", "and", "that", "and"};
        Map<String, Integer> wynikWordLen2 = cb.wordLen(testWords2);
        String[] testWords3 = {"code", "code", "code", "bug"};
        Map<String, Integer> wynikWordLen3 = cb.wordLen(testWords3);


        System.out.println("sleepIn: " + res1);
        System.out.println("diff21: " + res2);
        System.out.println("helloName: " + res3);
        System.out.println("firstLast6: " + res4);
        System.out.println("mapAB: " + wynikMapy);
        System.out.println("wordLen: " + wynikWordLen);
        System.out.println("wordLen (trzeci zestaw): " + wynikWordLen3);
        System.out.println("wordLen (2 zestaw): " + wynikWordLen2);
    }
}