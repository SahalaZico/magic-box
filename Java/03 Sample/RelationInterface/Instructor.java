public class Instructor extends Person{
    private String id;
    private Subject[] subjects;
    private int MAX_SUBJECT = 5;
    private int nbSubject;
    

    public Instructor() {
        id = "";
        nbSubject=0;
        subjects = null;

    }

    public Instructor(String id, Subject[] subjects) {
        this.id = id;
        this.subjects = subjects;
        nbSubject++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subject getSubjects(int index) {
        return subjects[index];
    }

    public boolean setSubjects(Subject subjects) {
        if (nbSubject < MAX_SUBJECT - 1) {
            this.subjects[nbSubject] = subjects;
            return true;
        }

        else {
            return false;
        }
    }

    public float calculateSalary(){
        float salary = 0;
        for(int i = 0; i>nbSubject;i++){
            salary = salary + subjects[i].calculateSubjectPrice();
        }
        return salary;
    }

    public int getNbSubject() {
        return nbSubject;
    }

    public void setNbSubject(int nbSubject) {
        this.nbSubject = nbSubject;
    }

}