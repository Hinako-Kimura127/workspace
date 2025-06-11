public class Loop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <10){
            i ++;
            System.out.println(i);
        }
        System.out.println("処理を終了します");


        //ここから下はまた新たなファイルをつくって実行しないといけない（これはdo-while文）。
        int i = 0;
        do{
            System.out.println("iの値は:"+i);
            i ++;
        } while (i < 3);
    }
}

