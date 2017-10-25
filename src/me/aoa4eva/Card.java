package me.aoa4eva;

public class Card {
    //The attributes of the card
    private String symbol;
    private String number;

    public Card(String number, String symbol)
    {
        this.number=number;
        this.symbol=symbol;

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    boolean isThisCard(String checkNumber, String checkSymbol)
    {
        if(this.number.equalsIgnoreCase(checkNumber )&& this.symbol.equalsIgnoreCase(checkSymbol))
            return true;
        else
            return false;
    }

    boolean isThisCard(Card c)
    {
        if(this.number.equalsIgnoreCase(c.number) && this.symbol.equalsIgnoreCase(c.symbol))
            return true;
        else
            return false;
    }


    String show()
    {
        return String.format("%-5s%-2s%-10s",this.number," of ",this.symbol);
    }
}
