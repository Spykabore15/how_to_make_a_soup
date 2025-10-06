package Soup3;

public class Soup implements Quantifiable {
    protected Vegetable[] vegetables;
    private final static int taille = 15;
    private static int index;

    Soup(){
        this.vegetables = new Vegetable[taille];
    }

    public void add(Vegetable v){
        if(index >= taille){
            System.out.println("Il y a plus de places pour ajouter des légumes");
            return;
        }
        vegetables[index] = v;
        index++;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("Soupe\n------\n");
        s.append(getCalories()).append("\n");
        for(int i=0; i<index; i++){
            s.append(vegetables[i]).append("\n");
        }
        return s.toString();
    }

    public double getPeelingWeight(){
        double w = 0;
        for(int i=0;i<index;i++){
            w += vegetables[i].getPeelingWeight();
        }
        return w;
    }

    public double getPeelingWeight(double pourcentage){
        double w = 0;
        for(int i=0;i<index;i++){
            w += vegetables[i].getPeelingWeight(pourcentage);
        }
        return w;
    }

    public int getCalories(){
        int calories = 0;
        for(int i=0; i<index; i++){
            if(vegetables[i] instanceof Carrot)
                calories += ((Carrot) vegetables[i]).getCalories();
            if(vegetables[i] instanceof Potatoe)
                calories += ((Potatoe) vegetables[i]).getCalories();
        }
        return calories;
    }

}
