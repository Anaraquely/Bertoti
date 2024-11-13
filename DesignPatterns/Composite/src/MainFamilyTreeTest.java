public class MainFamilyTreeTest {
    public static void main(String[] args) {
        Individual john = new Individual("John");
        Individual jane = new Individual("Jane");

        Family smithFamily = new Family("Smith");
        smithFamily.addMember(john);
        smithFamily.addMember(jane);

        smithFamily.showFamilyDetails();
    }
}