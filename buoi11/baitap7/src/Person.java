class Person {
    String name;
    String gender;
    String birthDate; // Định dạng: yyyy-mm-dd

    public Person(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + birthDate;
    }
}