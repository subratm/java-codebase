package dp.builder;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee.Builder(101,"Subrat")
                .department("ADMIN")
                .salary(2567.80)
                .build();
        System.out.println(employee);
    }

    }
