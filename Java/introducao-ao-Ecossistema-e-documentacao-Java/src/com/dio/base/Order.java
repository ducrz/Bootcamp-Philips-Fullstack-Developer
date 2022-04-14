package com.dio.base;

/**
 Curso Introdução ao Ecossistema e Documentação Java
 @author Eduardo Monteiro
 @version 0.1
 @see Integer
 @since 0.1



 */
public class Order {
    // Representa o código do pedido
    private final String code;
    private final double totalValue;

    private String[] items;

    /**
     * Construtor da classe Order
     * @param code Código do Pedido
     * @param totalValue Valor total do Pedido
     */
    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;

    }

    //IF - Else

    /**
     * Calcula as taxas de acordo com o valor total do pedido
     * @return O valor total com a taxa calculada
     */
    public double calculateFee(){
        if(this.totalValue > 100){
            return this.totalValue * 0.99;
        }
        else{
            return this.totalValue;
        }
    }

    //Switch - Case
      public double calculateFeeSwitch(){
            switch(totalValue){
                case 100:
                    return totalValue * 0.99;
                case 200:
                    return totalValue * 1.99;
                default:
                    return totalValue;
       }
   }

    //While
    public void printItems(){
        int i = 0;
        while(i < items.length){
            System.out.println(items[i]);
            i++;
        }
    }
    //Do While
    public void printItemsDoWhile(){
        int i = 0;
        do{
            System.out.println(items[i]);
            i++;
        } while(i < items.length);
    }

    //For
    public void printItemsFor(){
        for (int i=0; i< items.length; i++){
            System.out.println(items[i]);
        }

    }

    //Enhanced For
    public void printItemsEnhancedFor(){
        for(String i : items){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Order={" +
                "code='" + code + "'" +
                "}";
    }

}