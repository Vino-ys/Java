package 자바.배열수업부분;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, colume, i, j, num, onerow = 0, twerow = 0, sum = 0, twedw = 0, max = 0, maxidxX = 0, maxidxY = 0;
        System.out.print("행: ");
        row = scanner.nextInt();
        System.out.print("열: ");
        colume = scanner.nextInt();

        int[][] arr = new int[row][colume];

        System.out.println("최초 재고: ");
        for(i = 0; i < row; i++) for(j = 0; j < colume; j++) arr[i][j] = scanner.nextInt();

        while(true) {
            System.out.print("명령 행: ");
            i = scanner.nextInt();
            if(i == -1) break;
            else{
                System.out.print("명령 열: ");
                j = scanner.nextInt();
                System.out.print("변경 수량: ");
                num = scanner.nextInt();
                if ((arr[i - 1][j - 1] + num) < 0){
                    continue;
                }
                else arr[i - 1][j - 1] += num;
            }
        }
        System.out.println();
        System.out.println("최종 재고:");
        for(int[] rows : arr) {
            for(int columes : rows) {
                System.out.print(columes + " ");
            }
            System.out.println();
        }

        for(i = 0; i < row; i++) {
            for(j = 0; j < colume; j++){
                if(i == 0) onerow += arr[i][j];
                if(i == 1) twerow += arr[i][j];
                sum += arr[i][j];
                if(arr[i][j] <= 2) twedw += 1;
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxidxX = i + 1;
                    maxidxY = j + 1;
                }
            }
        }
        System.out.println("1행 전체 재고: " + onerow);
        System.out.println("2행 전체 재고: " + twerow);
        System.out.println("전체 재고: " + sum);
        System.out.println("재고가 2개 이하인 보관함: " + twedw + "개");
        System.out.println("가장 많은 재고: " + max);
        System.out.println("위치: " + maxidxX + "행 " + maxidxY + "열");
    }
}