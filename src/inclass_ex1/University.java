package inclass_ex1;

public class University {

    private String uName;
    private Department[] deptlist;

    public University(String name, int[] deptId, String[] deptName) {
        uName = name;

        deptlist = new Department[deptId.length];

        for (int i = 0; i < deptId.length; i++) {
            deptlist[i] =new Department(deptId[i], deptName[i]);
        }
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void showList() {
        for (int i = 0; i < deptlist.length; i++) {
            System.out.println(deptlist[i].getDeptid() + "," + deptlist[i].getDeptName());
        }
    }

    public void changedeptname(String old, String newname) {
        for (int i = 0; i < deptlist.length; i++) {
            if (deptlist[i].getDeptName().equals(old)) {
                deptlist[i].setDeptName(newname);
            }
        }
    }


    private class Department {

        private int deptid;
        private String deptName;

        public Department(int dept, String deptN) {
            deptid = dept;
            deptName = deptN;
        }

        public int getDeptid() {
            return deptid;
        }

        public void setDeptid(int deptid) {
            deptid = deptid;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }
    }
}
