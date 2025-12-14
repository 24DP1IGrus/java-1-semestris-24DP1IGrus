package rvt;

public class Student extends Person {
    private int studyCredits;

    Student(String name, String address) {
        super(name, address);
        studyCredits = 0;
    }

    int credits() {
        return studyCredits;
    }

    void study() {
        studyCredits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + studyCredits;
    }
}
