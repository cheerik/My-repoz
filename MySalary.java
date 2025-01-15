package test;

import java.util.Scanner;

public class MySalary {
    public static int day = 0;
    public static int stroki = 0;
    public static int MyStroki = 0;
    public static int premiya;
    public static int summaZp;
    int zpOfDay(int a) {
        day = (a * 11) * 160;
        return day;
    }
    int podschetStroki(int a) {
        stroki = a * 2;
        return stroki;
    }
    int podschetMyStroki(int a) {
        MyStroki = a * 12;
        return MyStroki;
    }
    int podschetPremii(int a, int b) {
        stroki = a;
        MyStroki = b;
        premiya = ((stroki + MyStroki) / 100) * 40;
        return premiya;
    }
    int summaSalary(int a, int b, int c, int d) {
        summaZp = a + b + c + d;
        return summaZp;
    }
    public static void main(String[] args) {
        MySalary zp = new MySalary();
        zp.zpOfDay(day);
        zp.podschetStroki(stroki);
        zp.podschetMyStroki(MyStroki);
        zp.podschetPremii(stroki, MyStroki);
        int summZp = zp.summaSalary(day, stroki, MyStroki, premiya);
        double summNDFL = (summZp * 0.13);
        double summ = summZp - summNDFL;
        System.out.println(summ);
    }
}
