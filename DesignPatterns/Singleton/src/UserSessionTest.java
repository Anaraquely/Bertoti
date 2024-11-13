public class UserSessionTest {
    public static void main(String[] args) {
        UserSession session1 = UserSession.getInstance("john_doe");
        System.out.println(session1.getUsername());  // Imprime: john_doe

        UserSession session2 = UserSession.getInstance("jane_doe");
        System.out.println(session2.getUsername());  // Imprime: john_doe (a mesma sessão)
    }
}