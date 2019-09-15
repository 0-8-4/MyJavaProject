package lab1;

public class Homework {
    private double fillCost;
    private double pricePerLiter;
    private double kmTravelled;

    Homework(double fillCost, double pricePerLiter, double kmTravelled){
        this.fillCost = fillCost;
        this.pricePerLiter = pricePerLiter;
        this.kmTravelled = kmTravelled;
    }

    void countGas(){
        double litresUsed = fillCost / pricePerLiter;
        double kmPerLitre = kmTravelled / litresUsed;
        System.out.println("The number of kilometres travelled per litre " + kmPerLitre);
    }



    public static void rua() {
        System.out.println("RUA!");
        //for test
    }
}
