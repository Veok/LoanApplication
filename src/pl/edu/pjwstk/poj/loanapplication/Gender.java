package pl.edu.pjwstk.poj.loanapplication;

public enum Gender {
    M("Male"),
    F("Female");


    private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
