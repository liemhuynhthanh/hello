public class LopHoc {
    private String id;
    private String name;
    private int numberOfStudents;

//    constructor with full parameter
    public LopHoc(String id, String name, int numberOfStudents) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }
//    default constructor
    public LopHoc() {

    }
//    getter and setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
