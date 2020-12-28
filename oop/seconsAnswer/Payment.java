package oop.seconsAnswer;

import java.io.IOException;

public class Payment {
    private String name;
    private Product[] products;
    private int cost;

    private class Product{
        private String productName;
        private int productCost;

        public Product(){
            productName = "";
            productCost = 0;
        }

        private Product(String productName,int productCost){
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName(){
            return this.productName;
        }

        public int getProductCost(){
            return this.productCost;
        }
    }

    public Payment(){
        this.name = "";
        this.cost = 0;
    }

    public Payment(String name){
        this.name = name;
    }

    public void setPayment() throws IOException{
            this.cost = 0;
            PaymentScanner.alert();
            int arrayLength = PaymentScanner.productArrayLength();
            products = new Product[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                String str_name = PaymentScanner.enterProductName(i);
                int prod_cost = PaymentScanner.getCost();
                products[i] = new Product(str_name,prod_cost);
                this.cost = this.cost + products[i].productCost;
            }

    }

    public void printCheque() throws IOException{
        try {
            if(this.products.length != 0){
                System.out.println("========================");
                System.out.println(" "+this.name);
                System.out.println("========================");
                for (int i = 0; i < this.products.length; i++) {
                    System.out.printf("%3d",i+1);
                    System.out.printf("%15s", this.products[i].productName);
                    System.out.printf("%10d",this.products[i].productCost);
                    System.out.println();
                }

                System.out.println("======================");
                System.out.print("Общая стоимость");
                System.out.printf("%11d",this.cost);
                System.out.println();
                System.out.println("======================");
            }else {
                System.out.println();
                System.out.println("Массив не создан");
            }
        }catch (NullPointerException e){
            System.out.println();
            System.out.println("Массив не создан");
        }
    }
}
