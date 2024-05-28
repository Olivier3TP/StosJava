public class Stos {
    private double[] tablica;
    private int pierwszy;

    public Stos(int rozmiar){
        tablica = new double[rozmiar];
        pierwszy = 0;
    }

    public boolean isEmpty(){
        if(pierwszy == 0){
            return true;
        }else{
            return false;
        }
    }

    public void Push(double zawartosc){
        if(pierwszy == tablica.length){
            tablica[pierwszy] = zawartosc;
            pierwszy++;
        }
    }
    public double Pop(){
        double zwraca = tablica[pierwszy];
        pierwszy--;
        return zwraca;
    }
    public double Top(){
        return tablica[pierwszy];
    }
}
