package control;

import model.Answer;
import model.Student;

import java.rmi.Naming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        try{
            IRegistration i = null;
            i = (IRegistration)java.rmi.Naming.lookup("rmi://10.170.77.34:1099/Server");
            Student stu = new Student("B17DCCN","Le Truong Long","10.170.77.54",3);
            Student res = i.register(stu);
            Answer ans = new Answer();
            ans.setStudent(res);
            //Reverse String
            StringBuilder input1 = new StringBuilder();
            input1.append(res.getStrExamCode1());
            input1 = input1.reverse();
            ans.setReverseStringAnswer(input1.toString());
            //Max numeric Exam
            int arr []= res.getNumericExam();
            int max =0;
            for(int j=0;j< arr.length;j++){
                if(arr[j]>=max) max = arr[j];
            }
            ans.setMaxNumericAnswer(max);
            //Chuan hoa
            ans.setNormalizationStringAnswer(capitalize(res.getStrExamCode2()));
            //USCLN
            ans.setUclnNumericAnswer(USCLN(res.getNumericCode3(),res.getNumericCode4()));
            //BSCNN
            ans.setBcnnNumericAnswer(BSCNN(res.getNumericCode3(),res.getNumericCode4()));
            ans.setAlreadyRegistration(true);
            System.out.println(ans.toString());
            i.answer(ans);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static String capitalize(String s){
        List<String> list = Arrays.asList(s.split(" "));
        String result = list.stream()
                .map(Client::capitalizeString)
                .collect(Collectors.joining(" "));
        return result;
    }

    public static String capitalizeString(String s){
        String s1 = s.substring(0, 1).toUpperCase();
        return s1 + s.substring(1);
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
