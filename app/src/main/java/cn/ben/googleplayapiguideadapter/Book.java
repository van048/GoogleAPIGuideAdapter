package cn.ben.googleplayapiguideadapter;

class Book {
    private final String name;

    Book(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
}
