package Soup2;

public class TestVegetable {
    public static void main(String[] args){
        Vegetable pdt = new Potatoe(0.3, 10);
        Vegetable c = new Carrot(0.25, 30);
        System.out.println(pdt);
        System.out.println(c);
        System.out.println(pdt.getPeelingWeight());
        System.out.println(c.getPeelingWeight());
    }
}
