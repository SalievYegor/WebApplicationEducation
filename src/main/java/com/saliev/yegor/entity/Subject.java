package com.saliev.yegor.entity;

import java.io.PrintStream;
import java.util.Date;

/**
 * Created by Halvasan on 19.10.2017.
 */
public interface Subject {
    /*
    ��������� ��� �������� �������� ���������
     */
    String title();
    TimeTable timeTable();
    void print();
}
