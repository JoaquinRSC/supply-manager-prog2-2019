// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

import java.util.ArrayList;

public class Quotes {
    private ArrayList<Quote> quotes;

    public Quotes() {
        quotes = new ArrayList<>();
    }

    // Getters / Setters
    public ArrayList<Quote> getQuotes() { return quotes; }
    public void setQuotes(ArrayList<Quote> quotes) { this.quotes = quotes; }

    // Methods
    public Quote get(int index) {
        return quotes.get(index);
    }

    public int size() {
        return quotes.size();
    }

    public String getId(int index) {
        return quotes.get(index).getQuoteId();
    }

    public void remove(int index) {
        quotes.remove(index);
    }

    public void add(Quote quote) {
        quotes.add(quote);
    }
}
