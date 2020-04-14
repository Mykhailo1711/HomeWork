class Student extends Person {
    private String faculty;
    private int graduateYear;

    public Student(String FirstName, String LastName, int Age, String faculty, int graduateYear) {
        super(FirstName, LastName, Age);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }
}







