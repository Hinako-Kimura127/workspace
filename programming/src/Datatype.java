public class Datatype {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;
        int c = 0;
        System.out.println(a+b); //結果として５が返ってくる。

    //☆少数
        System.out.println(10 / 3); /*整数同士の割り算は整数で返ってくるため，少数にしたい場合は
                                      ①3.0というように整数と少数の組み合わせにするか
                                      ②double型を使って型変換をおこなう。*/
        System.out.println(10 / 3.0);   
    
        double x = 3.14;
        double y = 0.1 + 0.2;
        System.out.println(y);  //0.3（浮動小数点誤差）
        //仮数と指数と（さらに＋－の符号と）を用いて表された実数値のことを浮動小数点数と呼ぶ．

        int i = (int)3.99; //3
        //強制的な型変換（キャスト） により、小数点以下が切り捨てられて 3 になる。

        double d = (double) 10; //10.0
        //すでに整数であるが，double に変換されることで 10.0 という表示になる。

    //☆文字列型（string）<= 文字列は""で囲む。
        String text = "Hello, World!";
        System.out.println(text);

        //文字列操作（結合，繰り返し）
        //結合
        System.out.println("Hello," + "World!");

        //繰り返し
        System.out.println("Hi! ".repeat(3)); //repeat()の中に繰り返す回数を設定する。

        //長さ取得 <= length()を使う。
        System.out.println("Hello".length()); //5が返ってくる

        //文字列メソッド
        String text2 = "Java";
        System.out.println(text2.toUpperCase());  //'JAVA'全部大文字で返ってくる。
        System.out.println(text2.toLowerCase());  //'java'全部小文字で返ってくる。

    //☆プール型　<=プール型（boolean）はtrue（真）かfalse（偽）を表す。
        int aa = 5;
        int bb = 10;
        System.out.println(aa < bb); //true
        System.out.println(aa > bb); //false
        //条件式の評価結果はすべてboolean型になる。

        //null参照 <=「何も参照していない」を表している。
        String name = null;
        System.out.println(name); //null
        //【注意】nullにアクセスしようとするとNullPointerExceptionが発生するので注意が必要。
        //参照　https://tech-dream.school/archives/3692







        

        
    }



}
