import java.util.Scanner;

public class passedStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhap so luong sinh vien");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("so luong sinh vien toi da la " + 30);
            }
        } while (size > 30);
        int listPoint[] = new int[size];
        int count = 0;
        System.out.println("nhap diem cho cac sinh vien");
        for (int i = 0; i < listPoint.length; i++) {
            do {
                System.out.println("Nhap diem SV " + i + " : ");
                listPoint[i] = scanner.nextInt();
                if (listPoint[i] < 0 || listPoint[i] > 10) {
                    System.out.println(" 0 < Diem SV < 10");
                }
            } while (listPoint[i] < 0 || listPoint[i] > 10);
            if(listPoint[i] >= 5){
                count +=1;
            }
        }
        System.out.println("so luong sinh vien do la " + count);

    }
}
