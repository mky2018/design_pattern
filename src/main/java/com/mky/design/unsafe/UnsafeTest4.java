package com.mky.design.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author makaiyu
 * @date 2020-08-31 15:35
 */
public class UnsafeTest4 {
    public static void main(String[] args) throws Exception {
        unsafeCAS();

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


    public static void unsafeCAS() throws Exception {
        Unsafe unsafe = getUnsafe();
        class MyAutomicInteger {
            private volatile int value = 0;
            private Unsafe unsafe;
            private long offset;

            public MyAutomicInteger(Unsafe unsafe) throws Exception {
                this.unsafe = unsafe;
                this.offset = unsafe.objectFieldOffset(MyAutomicInteger.class.getDeclaredField("value"));
            }

            public void increment() {
                int oldValue = value;

                for (;;) {
                    if (unsafe.compareAndSwapInt(this, offset, oldValue, oldValue + 1)) {
                        break;
                    }

                    oldValue = value;
                }
            }

            public int getAndIncrement() {
                int oldValue = value;

                for (;;) {
                    if (unsafe.compareAndSwapInt(this, offset, oldValue, oldValue + 1)) {
                        return oldValue;
                    }

                    oldValue = value;
                }
            }

            public int getValue() {
                return value;
            }
        }

        MyAutomicInteger myAutomicInteger = new MyAutomicInteger(unsafe);
        myAutomicInteger.increment();
        System.out.println(myAutomicInteger.getValue());

        for (int i = 0; i < 5; i++) {
            System.out.println(myAutomicInteger.getAndIncrement());
        }

        System.out.println(myAutomicInteger.getValue());
    }
}
