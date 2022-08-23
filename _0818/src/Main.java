import java.util.Objects;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("John",18);
        Person p2 = new Person("Jane",20);

        System.out.println(p1.equals(p2));

        String[] str1={"1","2"};
        String[] str2={"1","2"};
        System.out.println(Objects.deepEquals(str1,str2));
        System.out.println(str1.equals(str2));
    }
}
