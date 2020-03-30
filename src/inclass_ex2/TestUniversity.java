package inclass_ex2;

public class TestUniversity {

    public static void main(String[] args) {
        int[] department_ids = {1, 2, 3, 4};
        String[] department_names = {"Computing", "Business", "Languages", "Engineering"};

        University dcu = new University("DCU", department_ids);

        for (int i = 0; i < department_ids.length; i++){
            dcu.add_department(dcu.new Department(department_ids[i], department_names[i]), i);
        }

        dcu.showList();
        System.out.println();

        dcu.changedeptname("Business", "Business & Marketing");

        dcu.showList();
    }
}
