package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable {
    public static class A {
        protected String name = "A";

        public A(String name) {
            this.name += name;
        }

        public A() {
            super();
        }
    }

    public class B extends A implements Serializable {
        public B(String name) {
            super(name);
            this.name += name;
        }

        private void writeObject(ObjectOutputStream oos) throws IOException {
            oos.writeObject(name);
        }
        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            this.name = (String) ois.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution s1 = new Solution();
        B b = s1.new B("2");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.tmp"));
        oos.writeObject(b);
        oos.close();
        System.out.println(b.name);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.tmp"));
        B bb = (B) ois.readObject();
        ois.close();
        System.out.println(bb.name);
    }
}
