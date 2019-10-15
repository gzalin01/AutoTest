import org.testng.annotations.Test;

public class MyTest {
    private static int count=1;
    private static String name="gzalin";
    @Test
    public static void myTest(){
        for (int i=0;i<count;i++){
            System.out.println(name+count);
        }
    }

}
