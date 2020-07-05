package oop.model.enums;

public enum Gender {
    MAN("mezczyzna"), WOMAN("kobieta");

    private final String genderName;

    public String getGenderName() {
        return genderName;
    }

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
