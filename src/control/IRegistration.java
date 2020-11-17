package control;

import model.Answer;
import model.Student;

public interface IRegistration {
    public Student register(Student s);
    public Answer answer(Answer answer);
}
