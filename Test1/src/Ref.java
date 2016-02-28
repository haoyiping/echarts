import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Ref {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        String input;
        while (true) {
            System.out.print("���������������� exit �˳�����");
            input = in.readLine();
            if (input == null || input.equals("exit")) {
                break;
            }
            try {
                Class<?> clazz = Class.forName(input);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                 // �� methodName(param1Type, ..., paramNType) ��ʽ���
                    System.out.println(format(method)); 
                }
            } catch (ClassNotFoundException ex) {
                System.err.println(input + " �಻����");
            }
        }
 
        in.close();
    }
 
    private static String format(Method method) {
        StringBuilder builder = new StringBuilder(method.getName());
        builder.append('(');
        Class<?>[] classes = method.getParameterTypes();
        for (int i = 0, len = classes.length - 1; i < len; i++) {
            builder.append(classes[i].getSimpleName());
            builder.append(',').append(' ');
        }
        if (classes.length > 0) {
            builder.append(classes[classes.length - 1].getSimpleName());
        }
        builder.append(')');
        return builder.toString();
    }
}
