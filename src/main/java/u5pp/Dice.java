package u5pp;

public class Dice{
    private int numSides = 6;
    private int side = 1;
    private String color = "green";

    public Dice(int numSides){
        this.numSides = 6;
        this.side = 1;
        this.color = "green";
    }

    public Dice(int numSides, int side){
        this.numSides = 6;
        this.side = 1;
        this.color = "green";
    }

    public Dice(int numSides, int side, String color){
        this.numSides = 6;
        this.side = 1;
        this.color = "green";
    }

    public int getSides(){
        return numSides;
    }

    public int getCurrentSide(){
    return side;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "The " + getColor() + " " + getSides() + "sided dice is showing " + getCurrentSide();
    }

    public boolean equals(Dice d){
        return this.side == d.side;
    }

    public int roll(){
        changeSide((int)(Math.random() * numSides + 1));
        return getCurrentSide();
    }

    public void changeSide(int number){
        if(number > 0 && number <= numSides){
            this.side = number;
        }
    }
    public void changeColor(String color){
        this.color = color;
    }

    public void changeNumSides(int number){
        this.numSides = number;
    }
}