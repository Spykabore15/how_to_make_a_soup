package Soup2;

public class TestSoup {
    public static void main(String[] args){
        Soup s = new Soup();
        s.add(new Potatoe(0.3, 10));

        s.add(new Carrot(0.25, 30));
        System.out.println(s);
        System.out.println(s.getPeelingWeight());
        System.out.println(s.getPeelingWeight(0.05));

        s.add(new Potatoe(0.500));
        s.add(new Potatoe(0.150));
        s.add(new Carrot(0.20, 25));
        s.add(new Potatoe(0.450, 2));
        System.out.println(s);
        System.out.println(s.getPeelingWeight());
        System.out.println(s.getPeelingWeight(0.05));



    }
}
