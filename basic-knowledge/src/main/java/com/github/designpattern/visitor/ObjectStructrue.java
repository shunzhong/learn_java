package com.github.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectStructrue {
    /**
     * 定义一个集合用于存储元素对象
     */
    private ArrayList<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();

        while(i.hasNext()) {
            //遍历访问集合中的每一个元素
            i.next().accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }


}
