public class Zadanie_domowe1 {
    public static void main(String[] args) {
        int num1 = 6456;
        int num2 = 54342;
        int num3 = 123;
        int num4 = 78978;

        int sum12 = num1 + num2;
        int sum34 = num3 + num4;
//        int sumBoth = sum12 + sum34;

        if (sum12 % 2 == 0) {
            System.out.println("Suma dwóch pierwszych jest parzysta");
        }
        if (sum34 % 2 == 0) {
            System.out.println("Suma dwóch ostatnich jest parzysta");
        } else {
            System.out.println("Suma dwóch ostatnich jest nieparzysta");
        }
        if (sum12 % 2 ==0 && sum34 % 2 ==0){
            System.out.println("Obie sumy są parzyste");

        }else{
            System.out.println("Obie sumy nie są parzyste");
        }
    }
}