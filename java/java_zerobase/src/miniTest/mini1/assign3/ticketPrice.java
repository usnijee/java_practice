package miniTest.mini1.assign3;

public enum ticketPrice {

    BASIC(10000),
    SPECIAL(4000),
    ORDINARY(8000);

    private int fee;

    ticketPrice(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
