import java.util.Random;

public class DoorChoose {
    public static void main(String[] args) {
        Random random = new Random();
        int success = 0;
        int failiure = 0;
        for (int i = 0; i < 1000000; i++) {
            int tmp = Math.abs(random.nextInt() % 3) + 1;
            int picker = Math.abs(random.nextInt() % 3) + 1;
            int openDoor;
            switch (picker) {
                case 1:
                    if (tmp == 2) {
                        openDoor = 3;
                    } else {
                        openDoor = 2;
                    }
                    break;
                case 2:
                    if (tmp == 3) {
                        openDoor = 1;
                    } else {
                        openDoor = 3;
                    }
                    break;
                default:
                    if (tmp == 2) {
                        openDoor = 1;
                    } else {
                        openDoor = 2;
                    }
            }
            if (picker == tmp) {
                success++;
            } else {
                failiure++;
            }

        }
        System.out.println("Вероятность успеха, если оставить дверь: " + (success / (double) 1000000));
        System.out.println("Вероятность успеха, если поменять дверь: " + (failiure / (double) 1000000));
    }
}
