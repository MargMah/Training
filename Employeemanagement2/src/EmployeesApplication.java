public class EmployeesApplication {

        public static void main(String[] args) {
            Employees emp1 = new Employees("Margaret", "Mahoney", "Office2", "BX", "52");
            Employees emp2 = new Employees("Tim", "Jones", "Office3","YX" , "43");

            emp1.introduction();
            emp2.introduction();

            //see the output, the age is not incremented past 65
            for(int i=0; i<70; i++ ){
                emp1.incAge();
                System.out.println(emp1.getAge());
            }
        }
    }
}
