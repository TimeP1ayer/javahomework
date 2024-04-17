import java.lang.reflect.InvocationTargetException;

public class ComputeTime {
    public static void main(String[] args) {

        double []a = new double[3];

        if (args[1]!=null&&args[2]!=null&&args[3]!=null) {
            for (int i = 0; i < a.length; i++) {
                if (args[i + 1] != null && args[1].matches("^[0-9]+$")) {
                    a[i] = Double.parseDouble(args[i + 1]);
                }
            }
        }else {
            System.out.println("args error");
            System.exit(0);
        }

        String warn = "class error";
        System.out.println("target class:"+args[0]);
        try {
            Common Vehicle = (Common) Class.forName(args[0]).getDeclaredConstructor().newInstance();
            double speed = Vehicle.speed(a[0],a[1],a[2]);
            System.out.println("speed: "+speed);
        } catch (InstantiationException e) {
            System.out.println(warn);
        } catch (IllegalAccessException e) {
            System.out.println(warn);
        } catch (InvocationTargetException e) {
            System.out.println(warn);
        } catch (NoSuchMethodException e) {
            System.out.println(warn);
        } catch (ClassNotFoundException e) {
            System.out.println(warn);
        }

    }
}
