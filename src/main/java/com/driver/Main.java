package com.driver;

public class Main {
    public  static class Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }

    }
    public static void main(String[]args){
        Product p=new Product();
        int result=p.product(3,4);
        int result1=p.product(5,6,7);
        double result2=p.product(8.0,9.0);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }

}