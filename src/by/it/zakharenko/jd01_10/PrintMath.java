package by.it.zakharenko.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Math> structMath = Math.class;  //Math.class.var
        //structMath.getDeclaredField("E");
        Method[] methods = structMath.getDeclaredMethods();
        for (Method m : methods) {
            int modifiers = m.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                String result = m.toString().replaceAll("java.lang.Math.", "");
                System.out.println(result);
            }
             /*int modifiers = m.getModifiers();//m.getModifiers().var
            if ((modifiers & Modifier.PUBLIC) == Modifier.PUBLIC) {
                System.out.println(m);
            }*/

           /* int methoMod = m.getModifiers();
            if (Modifier.isPublic(methoMod))
                System.out.println(m.toString().replace("java.lang.Math", ""));*/
            Field[] fields = structMath.getFields();
            for (Field field : fields) {
                String result = field.toString().replaceAll("java.lang.Math.", "");
                System.out.println(result);
            }
        }
    }
}
