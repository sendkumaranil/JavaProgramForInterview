package java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MapExample {

    public static void main(String[] args){

        //Convert array each value in to upper case and return to the list
        // by using map function
        String[] name={"Anil","Jay","Sujita","Komal","Deepak"};

        List<String> nameinUpperCase= Arrays.stream(name)
                .map(value -> value.toUpperCase()) //map(String::toUpperCase)
                .collect(Collectors.toList());

        nameinUpperCase.stream().forEach(System.out::println); //val->System.out.println(val)

        //get all name value from the list of objects
        List<Employee> employees=new ArrayList<>();
        Employee e1=new Employee("Anil","Bangalore");
        Employee e2=new Employee("Sumit","Delhi");
        Employee e3=new Employee("Kabir","Hydrabad");
        Employee e4=new Employee("Ashok","Patna");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        List<String> listOfName=employees.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toList());

        listOfName.stream().forEach(System.out::println);

        //Get all list of even numbers from arrays
        //all values of arrays are in string

        String[] numbers={"1","20","13","14","34","27"};

        List<Integer> evenNumbers= Arrays.stream(numbers)
                .map(value -> Integer.valueOf(value))//map(Integer::valueOf)
                .filter(val -> (val % 2==0))
                .collect(Collectors.toList());

        System.out.println("======Even Numbers =======");
        evenNumbers.stream().forEach(System.out::println);

    }
}

class Employee{
    String name;
    String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
