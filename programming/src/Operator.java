public class Operator {
    public static void main(String[] args) {
        //☆☆演算子
        //☆算術演算子（+-*/は省略しますだってわかるから。）
        // % x%y でxをyで割ったあまりを表せられる。
        //Datatypeの時にもやったけど，割り算の結果は整数（切り捨て）になる。
        //べき乗の代わりには　Math.pow() を使う。

        int a = 10;
        int b = 3;
        System.out.println("加算:" + (a +b));  // 13
        System.out.println("割算:" + (a / b));  // 3
        System.out.println("あまり:" + (a % b)); // 1

        double power = Math.pow(a, b);
        System.out.println("累乗:" + power);

        //【注意】わる数=0  <= 整数ならArithmeticException, 浮動小数点数なら Infinity または NaN が表示される。

        //☆代入演算子と複合演算子
        /* = x=y yをxに代入する
         * += x+=y x=x+yと同じ
         * -= x-=y x=x-yと同じ
         * *= x*=y x=x*yと同じ
         * /= x/=y x=x/yと同じ
         * %= x%=y x=x%yと同じ
         */
        int x = 10;
        x += 5;     // x=x+5;
        System.out.println("x += 5:" + x);  // 15
        
        x *= 2;     // x=x*2;
        System.out.println("x *= 2:" + x);  // 30

        //☆比較演算子 <=値を比較してtrueまたはfalseを返す
        //<, >, <=, >= は未満，以上を表すことは知っているのでいいとして，以下は確認。
        /*
         *  == a=b aはbと等しいか
         *  != a!=b aはbと等しくないか
         */
        a = 10;
        b = 5;
        System.out.println("a > b:" + (a >b));  //true
        System.out.println("a == b;" + (a == b));   //false

        //☆論理演算子 <=複数の条件を組み合わせるための演算子
        /*
         * &&  a&&b  両方がtrueならtrue
         * ||  a||b  どちらかがtrueならtrue
         * !   !a  　aがtrueならfalseを返す
         */
        x =15 ;
        System.out.println(10 < x && x < 20);   //true
        System.out.println(!(x == 15));     //false

        //☆ビット演算子 <=整数のビット単位で処理をおこなう演算子
        /*
         * &  a&b　両方のビットが1なら1
         * |  a|b　どちらかのビットが1なら1
         * ^  a^b　ビットが異なるとき1
         * ~  ~a　各ビットを反転
         * <<  a<<1　ビットを左に1ビットシフト（×2）
         * >>  a>>1　ビットを右に1ビットシフト（÷2）
         */
        a = 0b1100;     // 12
        b = 0b1010;     // 10
        System.out.println("a & b:" + Integer.toBinaryString(a & b));   //0b1000
        System.out.println("a << 1:"+ Integer.toBinaryString(a << 1));  //0b11000

    //☆☆命令規則（java）
    /*☆共通ルール
     * 名前は英字ではじめ，2文字目以降に英字，数字を使用できる（記号は使用しない）。
     * アンダースコア_や記号は原則として使わない（例外あり）。
     * 大文字と小文字は区別される。
     * 意味のある単語を使う（numよりstudentCountのように具体的な単語を使う）。
     * 
     * ☆変数名，メソッド名
     * ローワーキャメルケースを使用する。　<=複合語の最初の単語の最初の文字を小文字，それ以降の単語の最初の文字を大文字で表記する命名規則。
     * ex)getName()
     * 
     * ☆クラス名クラス名
     * アッパーキャメルケースを使用する。
     *　ex)MyClass

       ☆定数名（static final），インターフェース名
       すべて大文字（全大文字），単語はアンダースコアで区切る。
       ex)MAX_SIZE
            public static final int MAX_RETRIES = 3;
        
        ☆パッケージ名
        すべて小文字。必要に応じてドットで区切る（通常は逆ドメイン名）。
        ex) com.example.myapp

        ☆予約語
        jabaの予約語（キーワード）は識別子として使用できない。（予約語に文字や数字をつけた変数名はOK）

        ☆変数名には組み込みクラス名の使用を避ける（Stringなど）。
      
     */
       


 


    }

}
