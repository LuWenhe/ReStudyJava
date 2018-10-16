package edu.just.generic;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GenericTest {

    public class Generic<T> {
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        /**
         * 虽然在方法中使用了泛型，但是这并不是一个泛型方法，只是类中一个普通的成员方法，
         * 只不过他的返回值是在声明泛型类已经声明过的泛型
         * @return
         */
        public T getKey() {
            return key;
        }

    }

    public <T> T showKeyName(Generic<T> generic) {
        System.out.println("container key: " + generic.getKey());
        T key = generic.getKey();
        return key;
    }

    public void showKeyValue(Generic<Number> obj) {
        System.out.println("key value is: " + obj.getKey());
    }

    public void showKeyValue2(Generic<?> obj) {
        System.out.println("key value is: " + obj.getKey());
    }

//    public void showKey(T gen) {
//
//    }

}
