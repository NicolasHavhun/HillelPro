package com.hillelPro.havhun.homework3;

public class Main {


    private static String textWrite;

    public static void main(String[] args) {
        final User user = new User();
        System.out.println("Инициализация юзера: ");
        User.printInformation("Nico", "Havhun", "nicolas.havhun@gmail.com", "****", "male", "Ukraine");

        final Support support = new Support("Alain", "00000");
        final Admin admin = new Admin("Tom", "Cruse");
        System.out.println();
        User.read("Проверочный текст метода read");

        System.out.println("Теперь мы видим вызов метода validationSupport класса Support: ");
        Support.validationSupport(user.firstString, user.secondString);
        System.out.println("Теперь мы видим вызов метода deleteSubstring класса Admin: ");
        Admin.deleteSubstring(user.firstString);

        System.out.println("Теперь продемонстрируем вызов метода write класса User: ");

        User.write();

        System.out.println("Реализация динамической диспетчеризации методов и вызов метода validationSupport класса Support: ");

        userValidation(support);

        System.out.println("Реализация динамической диспетчеризации методов и вызов метода deleteSubstring класса Admin: ");

        userValidation(admin);


    }

    public static void userValidation(User user) {
        if (user instanceof Support) {
            Support.validationSupport(user.firstString, user.secondString);
        }
        if (user instanceof Admin) {
            Admin.deleteSubstring(user.firstString);
        }


    }
}


