import java.util.ArrayList;
import java.util.List;

public class MyNewMac {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            list.add(i);
        }
        list.stream().forEach(e->{
            if (e==1){
                return;
            }
            System.err.println(e);
        });
    }

}
