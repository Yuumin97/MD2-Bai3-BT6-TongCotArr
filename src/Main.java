import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc:");
        System.out.println("Hang : ");
        int rows = scanner.nextInt();
        System.out.println("Cot : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Nhap phan tu cu mang (" + i + ", " + j + "):");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Nhap column can tinh :");
        int column = scanner.nextInt();
        if (column < columns) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][column];
            }
            System.out.println("Tong = " + sum);
        } else {
            System.out.println("Khong tim thay cot");
        }
    }
}