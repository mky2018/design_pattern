package com.mky.design.observer.jdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 * @author makaiyu
 * @date 2020-08-04 10:11
 * 被观察者
 */
public abstract class AbstractSubject {

    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void delObserver(Observer obs) {
        this.observers.remove(obs);
    }

    protected void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public abstract void doSomething();

    public static void main(String[] args) throws ParseException {
//        Date data = new Date();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        String dataStr = sdf.format(data);
//
//        System.out.println(dataStr);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY");

        System.out.println(sdf1.format(sdf.parse("2019-12-01")));

        System.out.println(sdf1.format(sdf.parse("2019-12-30")));

        System.out.println(sdf1.format(sdf.parse("2020-01-01")));
    }

}
