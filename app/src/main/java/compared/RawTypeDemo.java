package compared;


/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/7/9
 * description  : 原始类型
 */
public class RawTypeDemo {

    /**
     * 由于 JDK 5.0 之前 API 中的很多类（比如集合类）是不支持泛型的，所以原始类型出现在旧有代码中。为了向后兼容，允许将一个参数化类型指向原始类型的：
     */
    public static void main(String args[]) {

        Person person1 = new Person();

        //警告表明，原始类型会绕过泛型检查，将不安全代码的捕获推迟到运行时。因此，你应该避免使用原始类型。
        Person<String> person = person1;

        System.out.print(person1.toString());
    }

    static class Person<T> {

    }
}
