public class Individual implements Person{
    private String name;

    public Individual(String name) {
        this.name = name;
    }

    @Override
    public void showFamilyDetails() {
        System.out.println("Individual: " + name);
    }
}
