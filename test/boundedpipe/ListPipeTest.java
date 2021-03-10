package boundedpipe;

public class ListPipeTest extends BasePipeTest {
    @Override
    public Pipe<String> initPipe(int capacity, String... args) {
        Pipe<String> p = new ListPipe<>(capacity);
        for (String s : args) {
            p.append(s);
        }
        return p;
    }
}
