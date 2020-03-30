package inclass_ex1;

public class TestUniversity {

    public static void main(String[] args) {
        int[] department_ids = {1, 2, 3, 4};
        String[] department_names = {"Computing", "Business", "Languages", "Engineering"};

        University dcu = new University("DCU", department_ids, department_names);

        dcu.showList();
        System.out.println();

        dcu.changedeptname("Business", "Business & Marketing");

        dcu.showList();
    }
}
