/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import view.UpdateContactView;
import view.RegisterView;
import view.CreateContactView;
import view.LoginView;
import view.ContactView;
import controller.UserController;
import controller.ContactController;
import model.User;
import model.Contact;
import java.util.Scanner;

/**
 *
 * @author GokPrazPC
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        String id, username, name, password;
        
        UserController controllerUser = new UserController();

        boolean menuLogin = true;
        
        do {
            System.out.println("== Menu == ");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. keluar");
            System.out.print("Masukkan pilihan: ");
            int menu = scInt.nextInt();

            User user = new User();
            RegisterView registerView = new RegisterView();

            switch (menu) {
                case 1:
                    System.out.print("ID : ");
                    id = sc.nextLine();
                    user.setId(id);

                    System.out.print("Nama : ");
                    name = sc.nextLine();
                    user.setName(name);

                    System.out.print("Username : ");
                    username = sc.nextLine();
                    user.setUsername(username);

                    System.out.print("Password : ");
                    password = sc.nextLine();
                    user.setPassword(password);

                    registerView.register(controllerUser, user);

                    System.out.println();
                    controllerUser.readAll(controllerUser.database.getDataUser());
                    break;

                case 2:
                    System.out.print("Username : ");
                    username = sc.next();
                    user.setUsername(username);

                    System.out.print("Password : ");
                    password = sc.next();
                    user.setPassword(password);

                    LoginView loginView = new LoginView(username, password);

                    if (loginView.login(controllerUser) != null) {
                        User dataLogin = loginView.login(controllerUser);
                        contact(dataLogin);
                    
                    } else {
                        System.out.println("Login Gagal");
                    }

                    break;

                case 3:
                    menuLogin = false;
                    break;
            }
            System.out.println();
        
        } while(menuLogin);

    }

    public static boolean contact(User user) {
        System.out.println("HALLO : " + user.getName());
        
        Scanner sc = new Scanner(System.in);
        String id, nama, telepon;
        
        ContactController controllerContact = new ContactController();
        CreateContactView createContactView = new CreateContactView();
        UpdateContactView updateContactView = new UpdateContactView();
        
        
        boolean menuKontak = true;
        while (menuKontak) {
            System.out.println("== Menu Kontak == ");

            System.out.println("1. Tambah Kontak");
            System.out.println("2. Edit Kontak");
            System.out.println("3. Hapus Kontak");
            System.out.println("4. Tampil Kontak");
            System.out.println("5. logout");
            System.out.print("Masukkan pilihan: ");
            int menu = sc.nextInt();

            System.out.println("=========");

            Contact contact = new Contact();
            ContactView contactView = new ContactView();

            switch (menu) {
                case 1:
                    System.out.print("ID : ");
                    id = sc.next();
                    contact.setId(id);

                    System.out.print("Nama : ");
                    nama = sc.next();
                    contact.setNama(nama);

                    System.out.print("Telepon : ");
                    telepon = sc.next();
                    contact.setTelepon(telepon);

                    createContactView.createContact(controllerContact, contact);
                    break;

                case 2:
                    contactView.showListContact(controllerContact);

                    System.out.print("Input ID yang akan diedit : ");
                    String idEdit = sc.next();

                    System.out.print("ID Baru : ");
                    id = sc.next();
                    contact.setId(id);

                    System.out.print("Nama Baru : ");
                    nama = sc.next();
                    contact.setNama(nama);

                    System.out.print("Telepon Baru : ");
                    telepon = sc.next();
                    contact.setTelepon(telepon);

                    updateContactView.updateContact(controllerContact, contact, idEdit);

                    break;

                case 3:
                    contactView.showListContact(controllerContact);

                    System.out.print("Input ID yang akan dihapus : ");
                    String idHapus = sc.next();

                    controllerContact.delete(idHapus);

                    break;

                case 4:
                    contactView.showListContact(controllerContact);
                    break;

                case 5 : 
                    menuKontak = false;
                    break;
                    
                default:
                    System.out.println("Pilih menu 1 - 3");
                    break;
            }

            System.out.println();
        }
        return menuKontak;
    }
}

//        System.out.println("USER\n");

//        /** USER **/
//        User a = new User();
//        a.setId("1");
//        a.setName("Melkan");
//        a.setUsername("melkan");
//        a.setPassword("123");
//      
//        UserController controllerUser = new UserController();
//        
//        // Register
//        RegisterView registerView = new RegisterView();
//        registerView.register(controllerUser, a);
//        
//        controllerUser.readAll(controllerUser.database.getDataUser());
//        
//        // Login
//        // username & password
//        LoginView loginView = new LoginView("melkan", "123");
//        loginView.login(controllerUser);
//        
//        
//        System.out.println("\n\nTELEPON\n");
//        
//        Contact contact1 = new Contact();
//        contact1.setId("1");
//        contact1.setNama("Rina");
//        contact1.setTelepon("084661212355");
//        
//        Contact contact2 = new Contact();
//        contact2.setId("2");
//        contact2.setNama("Joni");
//        contact2.setTelepon("11983738766");
//        
//        ContactController controllerContact = new ContactController();
//
//        CreateContactView createContactView = new CreateContactView();
//        createContactView.createContact(controllerContact, contact1);
//        createContactView.createContact(controllerContact, contact2);
// Menampilkan Contact
//        ContactView contactView = new ContactView();
//        contactView.showListContact(controllerContact);
// Update
//        UpdateContactView updateContactView = new UpdateContactView();
//        updateContactView.updateContact(controllerContact, contact2);
//    }
/**
 * public void editKontak(int index, String id, String nama, String telepon){
 * data_id.set(index-1,id); data_nama.set(index-1,nama);
 * data_telepon.set(index-1,telepon); }
 *
 * public void hapusKontak(int index){ data_id.remove(index-1);
 * data_nama.remove(index-1); data_telepon.remove(index-1); this.index--; }
 */
/**
 * import java.util.Scanner;
 *
 * public class MainUnity { public static void main(String[] args) { Unity unity
 * = new Unity(); Scanner scanner = new Scanner(System.in); while (true) {
 * System.out.println("Menu"); unity.tampilKontak(); System.out.println("1.
 * Tambah Kontak"); System.out.println("2. Edit Kontak"); System.out.println("3.
 * Hapus Kontak"); System.out.print("Masukkan pilihan: "); int in_menu =
 * scanner.nextInt(); switch (in_menu) { case 1 -> { System.out.println("Tambah
 * Kontak"); unity.tampilKontak(); System.out.print("Id: "); String id =
 * scanner.next(); System.out.print("Nama: "); String nama = scanner.next();
 * System.out.print("Telepon: "); String telepon = scanner.next();
 * unity.tambahKontak(id, nama, telepon); } case 2 -> { System.out.println("Edit
 * Kontak"); unity.tampilKontak(); System.out.print("Edit data ke-: "); int
 * edit_in = scanner.nextInt(); System.out.print("Id: "); String id_edit =
 * scanner.next(); System.out.print("Nama: "); String nama_edit =
 * scanner.next(); System.out.print("Telepon: "); String telepon_edit =
 * scanner.next(); unity.editKontak(edit_in, id_edit, nama_edit, telepon_edit);
 * } case 3 -> { System.out.println("Hapus Kontak"); unity.tampilKontak();
 * System.out.print("Hapus data ke-: "); int hapus_in = scanner.nextInt();
 * unity.hapusKontak(hapus_in); } default -> System.out.println("Pilih menu 1 -
 * 3"); } } } }
 */
//}
