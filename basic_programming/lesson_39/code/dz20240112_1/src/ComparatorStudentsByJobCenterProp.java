import java.util.Comparator;

public class ComparatorStudentsByJobCenterProp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.isJobCenter() && !o2.isJobCenter() ) {
            return -1;
        }
        if (!o1.isJobCenter() && o2.isJobCenter() ){
            return 1;
        }
        return 0;
    }
}
