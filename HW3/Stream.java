package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    
    private List<StudentGroup> newListStudentGroup;

    public List<StudentGroup> getListStudentGroup() {
        return newListStudentGroup;
    }

    public void setListStudentGroup(List<StudentGroup> newListStudentGroup) {
        this.newListStudentGroup = newListStudentGroup;
    }
    private int index;

    public Stream(List<StudentGroup> studentsStreame) {
        this.newListStudentGroup = studentsStreame;
        this.index = -1;
    }

    public Stream() {
        this.newListStudentGroup = new ArrayList<>();
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return index < newListStudentGroup.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return newListStudentGroup.get(++index);
    }

    @Override
    public void remove() {
        if (index >= 0 && index < newListStudentGroup.size()) {
            newListStudentGroup.remove(index);
        }
    }

    
}
