//☆if文
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("点数を入力してください:");
        int score = scanner. nextInt();     //ここまで実行すると”点数を入力してください”がターミナルの所に出るから，そこに直接80を入力する。

        if(score >= 60){
            System.out.println("合格です");
        }
        
        System.out.println("処理を終了します");
        scanner.close();
    }

}

