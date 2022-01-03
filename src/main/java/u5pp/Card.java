package u5pp;

public class Card{
    private String suit;
    private String value;
    public Card(){
        this.suit = "2";
        this.value = "clubs";
    }
    public Card(String suit){
        this.suit = suit;
    }

    public Card(String suits, String values) {
        this.suit = suits;
        this.value = values;
    }

    
    public String getValue(){
        return value;
    }
    public String getSuit(){
        return suit;
    }

    public String toString(){
        return "The" + " " + value + " of " + suit;
    }

    public void changeSuit(String suit) {
        suit = suit.toLowerCase();
        if(suit.equals("clubs") || suit.equals("diamonds") || suit.equals("hearts") || suit.equals("spades"))
        {
            this.suit = suit;
        }
    }

    public void changeValue(String value){
        value = value.toLowerCase();
        if(value.equals("2") || value.equals("3") || value.equals("4") || value.equals("5") || value.equals("6") || value.equals("7") || value.equals("8") || value.equals("9") || value.equals("10") || value.equals("jack") || value.equals("queen") || value.equals("king") || value.equals("2ace"))
        {
            this.value = value;
        }
    }
}