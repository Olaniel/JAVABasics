package by.epam.unit02.main;

public class Task05 {
    /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 / 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦 *∗ 𝑡𝑔 𝑥𝑦
    */

    public static void main(String[] args) {

        double f,x,y;
        x=60;
        y=90;

            f=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x);
            System.out.println("F(x,y) = " + f);

    }
}
