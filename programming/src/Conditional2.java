import java.util.Scanner;

public class Conditional2 { // クラス名とファイル名が一致している必要があります
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("点数を入力してください: ");
        int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("合格です");
            System.out.println("おめでとうございます！");
        } else {
            System.out.println("不合格です");
            System.out.println("もっと頑張りましょう");
        }

        System.out.println("処理を終了します");
        scanner.close();
    }
}