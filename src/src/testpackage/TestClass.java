package testpackage;

import java.util.GregorianCalendar;

public class TestClass {
    public static void main(String[] args) {
        int age = 25;

        for (Girl girl : getMyPair(age)) {
            if (girl.age < age) {
                girl.show();
            }
        }


    }

    static Girl[] getMyPair(int age) {

        Girl girl1 = new Girl();
        girl1.name = "Вероника";
        girl1.age = 25;
        girl1.hobby = "йога";
        girl1.height = 150;

        Girl girl2 = new Girl();
        girl2.name = "Вероника2";
        girl2.age = 22;
        girl2.hobby = "йога2";
        girl2.height = 152;

        Girl[] girls = {girl1, girl2};
        return girls;
    }

    static class Girl {
        String name;
        int age;
        String hobby;
        int height;
        public void show()
        {
            System.out.println(name+age+hobby+height);
        }
    }
}
