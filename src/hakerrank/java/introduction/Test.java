package hakerrank.java.introduction;


public class Test {
    public static void main(String[] args) {
        int x = 1 << 31;
        System.out.println(x); // -2147483648
        int y = 1 << 32;
        System.out.println(y); // 1
        int z = 1 << 33;
        System.out.println(z); // 2

        byte k = (byte) (1 << 6);
        System.out.println(k); // 64
        byte d = (byte) (1 << 7);
        System.out.println(d); // -128
        byte c = (byte) (1 << 8);
        System.out.println(c); // 0


        long a = 1L << 7;
        System.out.println(a);

        byte b = (byte) 129;
        System.out.println(b); // -127


//  false - as different links in different objects
        Integer g = new Integer(250);
        Integer gg = new Integer(250);
        System.out.println(g == gg);        //false

        Integer h = new Integer(12);
        Integer hh = new Integer(12);       //false -- так как ты явно вызываешь конструктор - то объекты и ссылки разные
        System.out.println(h == hh);

        Integer f = 250;
        Integer ff = 250;
        System.out.println(f == ff);        //false

        Integer r = 12;
        Integer rr = 12;
        System.out.println(r == rr);        //true
        //Здесь фактически вызывается статичный метод java.lang.Integer.valueOf(int), который, как вы можете увидеть в исходниках, кэширует значения от -128 до 127
        // (в более свежей реализации верхнюю границу кэша можно менять).

        //ну смотри, просто для оберток интов в диапозоне -128 - 127 вернется один и тот же объект для одинаковых чисел и все
        // не будет создан новый объект


        String aa = new String("123");
        String bb = "123";
        System.out.println(aa == bb);       //false т к новый объект и типо разные ссылки

        String cc = "123";
        String dd = "123";
        System.out.println(cc == dd);       //true  когда значения строк одинаковы, то они записываются в 1 объект

        String s = "8";
        int n = 0;
        n = Integer.parseInt(s);
        System.out.println(s);
    }
}
