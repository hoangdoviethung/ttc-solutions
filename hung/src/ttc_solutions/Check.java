package ttc_solutions;

import java.util.List;

public class Check {
    public void Check1(List<Integer> list) {
        int count = 0;
        boolean flag = true;
        Thread thread = new Thread();
        for (int i = 0; i < list.size(); i++) {
            if (Ping(list.get(i)) == 3) {
                System.out.println("Ping Invalid");
                System.out.println("time ping 3s");
                count = 0;
                try {
                    thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (Ping(list.get(i)) == 4) {
                count++;
                try {
                    System.out.println("Ping Not Invalid");
                    System.out.println("time ping 5s");
                    thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (Ping(list.get(i)) == 5) {
                count++;
                try {
                    System.out.println("Ping Not Invalid");
                    System.out.println("time ping 10s");
                    thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count == 3) {
                System.out.println("ban da nhap qua 3 lan sai");
                break;
            }
        }
    }

    public int Ping(int item) {
        if (item >= 200 && item <= 399) {
            return 3;
        } else if (item >= 400 && item <= 499) {
            return 4;
        } else if (item >= 500 && item <= 599) {
            return 5;
        } else return 0;// khong co truong hop nay
    }
}
