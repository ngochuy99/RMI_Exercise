package model;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    static final long serialVersionUID = 1L;
    private String maSV;
    private String hovaten;
    private String IP;
    private int group;
    private String strExamCode1;
    private String strExamCode2;
    private int numericCode3;
    private int numericCode4;
    private int[] numericExam;

    public Student(String maSV, String hovaten, String IP, int group) {
        this.maSV = maSV;
        this.hovaten = hovaten;
        this.IP = IP;
        this.group = group;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHovaten() {
        return hovaten;
    }

    public String getIP() {
        return IP;
    }

    public int getGroup() {
        return group;
    }

    public String getStrExamCode1() {
        return strExamCode1;
    }

    public String getStrExamCode2() {
        return strExamCode2;
    }

    public int getNumericCode3() {
        return numericCode3;
    }

    public int getNumericCode4() {
        return numericCode4;
    }

    public int[] getNumericExam() {
        return numericExam;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSV='" + maSV + '\'' +
                ", hovaten='" + hovaten + '\'' +
                ", IP='" + IP + '\'' +
                ", group=" + group +
                ", strExamCode1='" + strExamCode1 + '\'' +
                ", strExamCode2='" + strExamCode2 + '\'' +
                ", numericCode3=" + numericCode3 +
                ", numericCode4=" + numericCode4 +
                ", numericExam=" + Arrays.toString(numericExam) +
                '}';
    }
}
