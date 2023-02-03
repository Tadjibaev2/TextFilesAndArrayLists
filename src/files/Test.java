package files;

public class Test {
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 5 / a;
            System.out.println(b);
        } catch (Exception ex) {
//            throw new Error();
            System.out.println(ex.getMessage());
        }
        System.out.println("Project works");
    }
}
