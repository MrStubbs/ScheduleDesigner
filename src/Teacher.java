import java.util.ArrayList;

public class Teacher {
    private ArrayList<Subject> subjects;
    private ArrayList<ArrayList<Student>> classLists; //ref for returning all students in a class via teacher

    public Teacher(){
        subjects = new ArrayList<Subject>();
        classLists = new ArrayList<ArrayList<Student>>();
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void addSubjects(Subject s) {
        subjects.add(s);
    }

    public void addClassLists(ArrayList<Student> s){
        classLists.add(s);

    }
}
