package ttc_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Check check = new Check();

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("nhap tong so can kiem tra Ping");
        int a = scanner.nextInt();
        //Input Ping (200-599)
        for (int i = 0 ; i< a ; i++){
            System.out.println("So ping thu "+(i+1)+" la");
             int k = scanner.nextInt();
             list.add(k);
        }
       // list.add(500); list.add(400); list.add(444); list.add(500);
       check.Check1(list);
    }
}
