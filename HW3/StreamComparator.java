package HW3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream NameFirstStudent, Stream NameSecondStudent) {
        return Integer.compare(NameFirstStudent.getListStudentGroup().size(), NameSecondStudent.getListStudentGroup().size());
    }
    
}
