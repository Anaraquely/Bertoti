import java.util.ArrayList;
import java.util.List;

public class Family implements Person{
    private String familyName;
    private List<Person> members = new ArrayList<>();

    public Family(String familyName) {
        this.familyName = familyName;
    }

    public void addMember(Person member) {
        members.add(member);
    }

    @Override
    public void showFamilyDetails() {
        System.out.println("Family: " + familyName);
        for (Person member : members) {
            member.showFamilyDetails();
        }
    }
}
