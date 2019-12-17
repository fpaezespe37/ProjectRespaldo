package ec.edu.espe.booksystem.vist;

import ec.edu.epe.booksystem.model.User;
import ec.edu.epe.booksystem.model.Document;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edison Vaca
 */
public class UserSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Document document = new Document();
        boolean exit = false;
        int option;
        int op;
        String superUser = "Team2";
        String superU;
        String superPassword = "java";
        String superP;
        while (!exit) {
            System.out.println("\tuser");
            superU = scn.nextLine();
            System.out.println("\n\tPassword");
            superP = scn.nextLine();

            if (superUser.equals(superU) && superPassword.equals(superP)) {
                ArrayList<User> userList = new ArrayList<>();
                while (!exit) {
                    System.out.println("\n1) Login user"
                            + "\n2) View all users"
                            + "\n3) Search user by name"
                            + "\n4) Exit");

                    System.out.println("\nEnter option ");
                    option = Integer.parseInt(scn.nextLine());

                    switch (option) {
                        case 1:
                            User user = new User();
                            user.dataEntry();
                            userList = document.readAllUsers();
                            userList.add(user);
                            document.addNewUser(userList);
                            break;
                        case 2:
                            userList = document.readAllUsers();
                            for (int i = 0; i < userList.size(); i++) {
                                userList.get(i).showInformationUser();
                            }

                            break;
                        case 3:
                            System.out.println("Input Name ");
                            String name = scn.nextLine();
                            document.showUserByName(name);
                            break;

                        case 4:
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                }
            } else {
                System.out.println("Invalide user or password");
            }
        }
    }
}
