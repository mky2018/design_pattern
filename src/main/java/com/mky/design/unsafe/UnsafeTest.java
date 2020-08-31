package com.mky.design.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author makaiyu
 * @date 2020-08-31 15:13
 */
public class UnsafeTest {

    public static void main(String[] args) throws Exception {
        unsafePutGetInt();
    }

    private static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            return unsafe;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void unsafePutGetInt() throws Exception {
        Unsafe unsafe = getUnsafe();

        class Student {
            private int age = 5;

            public int getAge() {
                return age;
            }
        }

        Student student = new Student();
        System.out.println(student.getAge());

        Field field = student.getClass().getDeclaredField("age");

        unsafe.putInt(student, unsafe.objectFieldOffset(field), 10);

        System.out.println(student.getAge());
    }
}
