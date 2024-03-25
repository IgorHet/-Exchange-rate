class Bank {
    private String name; // Назва банку
    private double rate; // Курс валют

    public Bank(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return name + " - курс: " + rate;
    }
}