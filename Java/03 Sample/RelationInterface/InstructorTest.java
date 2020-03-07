
public class InstructorTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Si Ganteng","Simalingkar","Medan",21,'L');
        Person p3 = new Person(p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println(p2.isEquals(p1));
        System.out.println(p2.isEquals(p3));
        
        Subject s1 = new Subject(); 
        Subject s2 = new Subject("112110","PBO",3,50000);
        Subject s3 = new Subject(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s2.isEquals(s1));
        System.out.println(s2.isEquals(s3));
    }
}
