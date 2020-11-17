package model;

import java.io.Serializable;

public class Answer implements Serializable {
    static final long serialVersionUID = 2L;
    Student student;
    String reverseStringAnswer;
    String normalizationStringAnswer;
    int maxNumericAnswer;
    int uclnNumericAnswer;
    int bcnnNumericAnswer;
    boolean isAlreadyRegistration = false;
    boolean isReverseStringAnswerRight = false;
    boolean isMaxNumericAnswerRight = false;
    boolean isNormalizationStringAnswerRight = false;
    boolean isBSCNNNumericAnswerRight = false;
    boolean isUSCLNNumericAnswerRight = false;

    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "student=" + student +
                ", reverseStringAnswer='" + reverseStringAnswer + '\'' +
                ", normalizationStringAnswer='" + normalizationStringAnswer + '\'' +
                ", maxNumericAnswer=" + maxNumericAnswer +
                ", uclnNumericAnswer=" + uclnNumericAnswer +
                ", bcnnNumericAnswer=" + bcnnNumericAnswer +
                ", isAlreadyRegistration=" + isAlreadyRegistration +
                ", isReverseStringAnswerRight=" + isReverseStringAnswerRight +
                ", isMaxNumericAnswerRight=" + isMaxNumericAnswerRight +
                ", isNormalizationStringAnswerRight=" + isNormalizationStringAnswerRight +
                ", isBSCNNNumericAnswerRight=" + isBSCNNNumericAnswerRight +
                ", isUSCLNNumericAnswerRight=" + isUSCLNNumericAnswerRight +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Student getStudent() {
        return student;
    }

    public String getReverseStringAnswer() {
        return reverseStringAnswer;
    }

    public String getNormalizationStringAnswer() {
        return normalizationStringAnswer;
    }

    public int getMaxNumericAnswer() {
        return maxNumericAnswer;
    }

    public int getUclnNumericAnswer() {
        return uclnNumericAnswer;
    }

    public int getBcnnNumericAnswer() {
        return bcnnNumericAnswer;
    }

    public boolean isAlreadyRegistration() {
        return isAlreadyRegistration;
    }

    public boolean isReverseStringAnswerRight() {
        return isReverseStringAnswerRight;
    }

    public boolean isMaxNumericAnswerRight() {
        return isMaxNumericAnswerRight;
    }

    public boolean isNormalizationStringAnswerRight() {
        return isNormalizationStringAnswerRight;
    }

    public boolean isBSCNNNumericAnswerRight() {
        return isBSCNNNumericAnswerRight;
    }

    public boolean isUSCLNNumericAnswerRight() {
        return isUSCLNNumericAnswerRight;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setReverseStringAnswer(String reverseStringAnswer) {
        this.reverseStringAnswer = reverseStringAnswer;
    }

    public void setNormalizationStringAnswer(String normalizationStringAnswer) {
        this.normalizationStringAnswer = normalizationStringAnswer;
    }

    public void setMaxNumericAnswer(int maxNumericAnswer) {
        this.maxNumericAnswer = maxNumericAnswer;
    }

    public void setUclnNumericAnswer(int uclnNumericAnswer) {
        this.uclnNumericAnswer = uclnNumericAnswer;
    }

    public void setBcnnNumericAnswer(int bcnnNumericAnswer) {
        this.bcnnNumericAnswer = bcnnNumericAnswer;
    }

    public void setAlreadyRegistration(boolean alreadyRegistration) {
        isAlreadyRegistration = alreadyRegistration;
    }

    public void setReverseStringAnswerRight(boolean reverseStringAnswerRight) {
        isReverseStringAnswerRight = reverseStringAnswerRight;
    }

    public void setMaxNumericAnswerRight(boolean maxNumericAnswerRight) {
        isMaxNumericAnswerRight = maxNumericAnswerRight;
    }

    public void setNormalizationStringAnswerRight(boolean normalizationStringAnswerRight) {
        isNormalizationStringAnswerRight = normalizationStringAnswerRight;
    }

    public void setBSCNNNumericAnswerRight(boolean BSCNNNumericAnswerRight) {
        isBSCNNNumericAnswerRight = BSCNNNumericAnswerRight;
    }

    public void setUSCLNNumericAnswerRight(boolean USCLNNumericAnswerRight) {
        isUSCLNNumericAnswerRight = USCLNNumericAnswerRight;
    }
}
