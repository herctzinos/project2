package weekly2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Humanity {

    public static void main(String args[]) {

        ArrayList<Student> st = new ArrayList<Student>();

        st.add(new Student("hr", "smith", "1"));            //not valid name
        st.add(new Student("john", "s", "5678"));               //not valid last name
        st.add(new Student("mary", "jones", "135ge7ger7"));      //valid
        st.add(new Student("nick", "taylor", "252985"));          //valid
        st.add(new Student("chris", "rtyu", "235bdf2bebe098")); //not valid faculty number
        st.add(new Student("jessica", "rose", "8252qev3"));    //valid
        st.add(new Student("tom", "howard", "5233908!£"));      //not valid faculty number

        Student stud = new Student("firstName", "lastName", "facultyNumber");

        Iterator<Student> iterator = st.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if ((student.getFirstName().equals("error")) || (student.getLastName().equals("error")) || (student.getFacultyNumber().equals("error"))) {
                iterator.remove();
            }
        }

        for (int i = 0; i < st.size(); i++) {

            System.out.println(st.get(i));
        }

        ArrayList<Worker> wk = new ArrayList<Worker>();

        wk.add(new Worker("brian", "Griffin", 100, -5));           //not valid work hours
        wk.add(new Worker("peter", "Griffin", -2424, 10));         //not valid week salary
        wk.add(new Worker("stewie", "griffin", 317.145, 4));       //valid
        wk.add(new Worker("glenn", "quagmire", 1450.145, 8));      //valid

        Worker wrk = new Worker("firstName", "lastName", 1, 1);

        Iterator<Worker> iterator2 = wk.iterator();
        while (iterator2.hasNext()) {
            Worker worker = iterator2.next();
            if ((worker.getFirstName().equals("error")) || (worker.getLastName().equals("error")) || (worker.getHours_per_day() * worker.getWeekSalary() == 0)) {
                iterator2.remove();
            }

        }

        for (int i = 0; i < wk.size(); i++) {
            System.out.println(wk.get(i));

        }
        if(wk.isEmpty()){
            System.out.println("No worker lives in our application....");
        }else
            System.out.println("Workers in our application: " + wk.size() );
    }

}
