//package com.vti.examwebsise.examonline;
//
//import com.vti.examwebsise.examonline.entity.*;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.*;
//
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@DataJpaTest
//@Rollback(value = false)
//public class TestCreateQandA {
//    @Autowired
//    QuestionRepo repo;
//    @Autowired
//    AnswerRepo answerRepo;
//    @Autowired
//    RoleRepo roleRepo;
//    @Autowired
//    UserRepo userRepo;
//    @Autowired
//    ExamRepo examRepo;
//    @Autowired
//    TopicRepo topicRepo;
//    @Test
//    public void create(){
//        List<Question> questionList = new ArrayList<>();
//        Question javaQuestion1 = new Question("What is the correct syntax for the main method of a Java class?", 1, 1, new Topic(5));
//        javaQuestion1.addAnswer("public static int main(String[] args)", false);
//        javaQuestion1.addAnswer("public int main(String[] args)", false);
//        javaQuestion1.addAnswer("public static void main(String[] args)", true);
//        javaQuestion1.addAnswer("None of the above.", false);
//        Question javaQuestion2 = new Question("Which arithmetic operations can result in the throwing of an ArithmeticException?", 1, 1, new Topic(5));
//        javaQuestion2.addAnswer("/ , %", true);
//        javaQuestion2.addAnswer("* , +", false);
//        javaQuestion2.addAnswer("! , -", false);
//        javaQuestion2.addAnswer(">>, <<", false);
//        Question javaQuestion3 = new Question("What is an applet?", 1, 1, new Topic(5));
//        javaQuestion3.addAnswer("An applet is a Java program that runs in a Web browser.", true);
//        javaQuestion3.addAnswer("Applet is a standalone java program.", false);
//        javaQuestion3.addAnswer("Applet is a tool.", false);
//        javaQuestion3.addAnswer("Applet is a run time environment.", false);
//        Question javaQuestion4 = new Question("Can we have multiple classes in the same Java file?", 1, 1, new Topic(5));
//        javaQuestion4.addAnswer("True", true);
//        javaQuestion4.addAnswer("False", false);
//        Question javaQuestion5 = new Question("What is the default value of an int variable?", 1, 1, new Topic(5));
//        javaQuestion5.addAnswer("0", true);
//        javaQuestion5.addAnswer("0.0", false);
//        javaQuestion5.addAnswer("null", false);
//        javaQuestion5.addAnswer("not defined", false);
//
//
//
//        repo.saveAll(List.of(javaQuestion1,javaQuestion2,javaQuestion3,javaQuestion4,javaQuestion5));
//        }
//    @Test
//    public void get(){
////        Question q = repo.findById(1).get();
////        System.out.println(q);
//        List<Question> questions = repo.getExamQuestion(3,1,"1");
//        for (Question q: questions){
//            System.out.println(q);
//        }
//    }
//    @Test
//    public void createUserAndRole(){
//
//        User admin = new User("admin","123",new Role(1));
//        User user2 = new User("user","123",new Role(2));
//        userRepo.save(user2);
//    }
//    @Test
//    public void testEncodePassword() {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String rawPassword = "123";
//        String encodedPassword = passwordEncoder.encode(rawPassword);
//        System.out.println(encodedPassword);
//
//        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);
//
//
//    }
//    @Test
//    public void getExamResult(){
//        Exam exam = examRepo.getById(59);
//        Map<Question,Answer> map = new LinkedHashMap<>();
//        map.keySet().addAll(exam.getQuestions());
//        map.values().addAll(exam.getAnswers());
//    }
//    @Test
//    public void newTopic(){
//        List<Topic> topics = new ArrayList<>();
//        Topic topic = new Topic("English");
//        Topic topic1 = new Topic("Technology");
//        Topic topic2 = new Topic("Science");
//        topics.add(topic);
//        topics.add(topic1);
//        topics.add(topic2);
//        topicRepo.saveAll(topics);
//    }
//}
