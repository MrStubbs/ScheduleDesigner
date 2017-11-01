import java.util.ArrayList;

public class Subject {
    private String name;
    private String code;
    private int id;
    private Teacher teacher;
    private Room room;
    private ArrayList<Student> students;
    private String ibCode;

    public Subject(){
        name = new String();
        code = new String();
        teacher = new Teacher();
        room = new Room();
        students = new ArrayList<Student>();
        id = 0;
        ibCode = new String();
    }

    public Subject(String n, String c, Teacher t, Room r, String i){
        setName(n);
        setCode(c);
        setTeacher(t);
        setRoom(r);

    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getRoom() {
        return room.getName();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public String getIbCode() {
        return ibCode;
    }

    public void setIbCode(String ibCode) {
        this.ibCode = ibCode;
    }
}

