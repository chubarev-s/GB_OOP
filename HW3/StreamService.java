package HW3;

import java.util.List;

public class StreamService {
    private List<Stream> listStreams;

    public StreamService(List<Stream> listStreams) {
        this.listStreams = listStreams;
    }

    public void sortStudentsStreamSize(){
        listStreams.sort(new StreamComparator());
    }
    
}
