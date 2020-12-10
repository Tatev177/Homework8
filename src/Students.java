public class Students {
    String firstName;
    String lastName;
    int year;
    char gender;
    double mark;



    public Students(String firstName, String lastName, int age, char gender, double mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public void printInfo(){
        System.out.println("First name is:" + " " + firstName);
        System.out.println("Last name is:" + " " + lastName);
        System.out.println("Gender:" + " " + gender);
        System.out.println("Mark is:" + " " +mark);

    }
}
