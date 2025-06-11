//☆for文　<=指定された回数だけ処理を繰り返す。
public class Loop {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int[] numbers = {2, 4, 6, 8, 10};
        for (int num : numbers){
            System.out.println(num);
        }
    }
}

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i <10){
            i ++;
            System.out.println(i);
        }

        System.out.println("処理を終了します");
    }
}