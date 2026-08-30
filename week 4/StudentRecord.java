public class StudentRecord {
    public static void main(String[] args) throws Exception 
    {

        Student S = new Student();
        System.out.println(S.getName());
        System.out.println(S.getId());
        System.out.println(S.getMark());
        System.out.println(S.hasPassed());
        System.out.println(S.getClassification());

        System.out.println("============================");


        Student S1 = new Student("Vishal", "25CSU263", 12);

        System.out.println(S1.getName());
        System.out.println(S1.getId());
        System.out.println(S1.getMark());
        System.out.println(S1.hasPassed());
        System.out.println(S1.getClassification());

        S1.setName("Vishal Khandelwal");
        S1.setId("25CSU378");
        S1.setMark(998);

        System.out.println("============================");


        System.out.println(S1.getName());
        System.out.println(S1.getId());
        System.out.println(S1.getMark());
        System.out.println(S1.hasPassed());
        System.out.println(S1.getClassification());



    }
}
