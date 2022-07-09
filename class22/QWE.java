package com.syntax.class22;

public class QWE {
   public static  class StoreProduct{
        String label;
        Double price;
        String category;
        boolean hasExpiration;
        int stock;
        StoreProduct(String label,Double price, String category,boolean hasExpiration,int stock){
            this.label=label;
            this. price=price;
            this. category=category;
            this.hasExpiration=hasExpiration;
            this. stock=stock;
        }
        StoreProduct(String label,Double price, int stock){
            this.label=label;
            this. price=price;
            this. category="misc";
            this.hasExpiration=false;
            this. stock=stock;
        }
        StoreProduct(String label,Double price){
            this.label=label;
            this. price=price;
            this. category="";
            this.hasExpiration=false;
            this. stock=0;
        }
        void display(){
            System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);

        }

        public static void main(String [] args){
            StoreProduct a=new StoreProduct("Eggs", 3.0 ,"Produce ", true, 10);
            StoreProduct w=new StoreProduct("Paper Towels", 2.0," misc", false ,24) ;
            StoreProduct q=new StoreProduct("Paper Towels", 2.0," misc" ,false ,24) ;

        }
    }
}
