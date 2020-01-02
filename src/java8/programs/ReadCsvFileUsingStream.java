package java8.programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCsvFileUsingStream {

    //Read employee csv file and store data to employee object and print the employee list.
    public static void main(String[] args) throws IOException {
        String filename="employees.csv";
        String absolutePath=System.getProperty("user.dir")+ File.separator+filename;

        List<Employee> employees=null;
        employees=Files.lines(Paths.get(absolutePath))
                .skip(1)
                .map(line -> {
                    String[] items=line.split(",");
                    Employee emp=new Employee();
                    emp.setFirstname(items[0]);
                    emp.setLastname(items[1]);
                    emp.setAge(Integer.valueOf(items[2]));
                    emp.setGender(items[3]);
                    emp.setEmailid(items[4]);
                    emp.setContactno(items[5]);

                    return emp;
                })
                .collect(Collectors.toList());

        employees.stream().forEach(employee -> {
            System.out.println("==============================");
            System.out.println("Name: "+employee.getFirstname()+" "+employee.getLastname());
            System.out.println("Age: "+employee.getAge());
            System.out.println("Gender: "+employee.getGender());
            System.out.println("Email: "+employee.getEmailid());
            System.out.println("Contact No: "+employee.getContactno());
        });
    }

    static class Employee{
        String firstname;
        String lastname;
        Integer age;
        String gender;
        String emailid;
        String contactno;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getContactno() {
            return contactno;
        }

        public void setContactno(String contactno) {
            this.contactno = contactno;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
