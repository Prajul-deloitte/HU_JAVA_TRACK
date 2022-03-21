public class Student {
    String name;
    String regNo10;
    String regNo12;
    String regNoBtech;
    int rank;

    public Student(String name, String regNo10, String regNo12, String regNoBtech, int rank) {
        this.name = name;
        this.regNo10 = regNo10;
        this.regNo12 = regNo12;
        this.regNoBtech = regNoBtech;
        this.rank = rank;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo10() {
        return regNo10;
    }

    public void setRegNo10(String regNo10) {
        this.regNo10 = regNo10;
    }

    public String getRegNo12() {
        return regNo12;
    }

    public void setRegNo12(String regNo12) {
        this.regNo12 = regNo12;
    }

    public String getRegNoBtech() {
        return regNoBtech;
    }

    public void setRegNoBtech(String regNoBtech) {
        this.regNoBtech = regNoBtech;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "name='" + name + '\'' +
                ", regNo10='" + regNo10 + '\'' +
                ", regNo12='" + regNo12 + '\'' +
                ", regNoBtech='" + regNoBtech + '\'' +
                ", rank=" + rank +
                '}';
    }
}
