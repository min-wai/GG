package com.threesteps.firestoretest;

import java.util.ArrayList;

public class ArrayTest {

    private ArrayList<String> myArrayList;

    public ArrayTest(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public ArrayTest() {
    }

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    void setMyArrayList(String myArrayList) {
        this.myArrayList.add(myArrayList);
    }
}
