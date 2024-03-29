package com.company;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**

 * Студент %surname% %initials%

 * Группа %group%

 * Высшая школа информационных технологий и систем

 * Казанский (Приволжский) федеральный университет

 *

 * Контрольная работа №2.

 *

 */

public class SecondControlWork {


    public static void main(String[] args) throws IOException {
        String filename = "MOCK_DATA.csv";
        Users users = new Users(filename);
        users.save();
        users.findUsersWithParam("id","200","out.txt");

    }
}







/**

 * 1. Считать файл csv в массив, каждая строка (кроме первой) которого является объектом типа User (см. задание 2).

 * Реализовать методы load, save, saveAs.

 * Реализовать метод getUserById, получающий объект типа User, по id (id != номер строки).

 *

 */

class Users {
    String filename;
    User[] users;

    Users(String filename) throws FileNotFoundException {
        this.filename = filename;
        users = new User[300];
        this.load();
    }

    public void load() throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        sc.nextLine();
        sc.useDelimiter(";");
        int i = 0;
        while (sc.hasNextLine()) {
            users[i] = new User(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next() == "Male" ? Gender.Male : Gender.Female,
                    sc.next(), sc.next(), sc.next());
        }
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter(filename);
        fw.write("id;first_name;last_name;email;gender;money;country;job\n");
        for (User user : users) {
            fw.write(user.toString() + "\n");
        }
    }

    public void saveAs(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        fw.write("id;first_name;last_name;email;gender;money;country;job\n");
        for (User user : users) {
            fw.write(user.toString() + "\n");
        }
    }
    public User getUserById(int id) {
        for (User user : users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;




//    load()

//    save()

//    saveAs(String newFilename)

//    getUserById(int id)

//    findUsersWithParam(String haystack, String needle) (см. задание 4.).

}

    public void findUsersWithParam(String haystack, String needle, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        switch (haystack) {
            case "id": {
                for (User user : users){
                    if (("" + user.getId()).equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "first_name": {
                for (User user : users){
                    if (user.getLastname.equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "last_name": {
                for (User user : users){
                    if (user.getLastname.equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "email": {
                for (User user : users){
                    if (user.getEmail().equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "gender": {
                for (User user : users){
                    if (("" + user.getGender()).equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "money": {
                for (User user : users){
                    if (user.getMoney().equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
            case "country": {
                for (User user : users){
                    if (user.getCountry().equals(needle)){
                        fw.write(user.toString());
                    }
                }
            }
        }


        /**

     * 2. Создать класс юзер, с полями из CSV файла. Все геттеры/сеттеры + toString. Пол через Enum.

     * 3. В первой строке файла содержатся заголовки таблицы.

     * Создать метод, позволяющий получить номер столбца, по его названию, например, getColByName("name").

     * 4. Создать boolean метод, возвращающий true если пара название/номер столбца и значение соответствует введенным.

     * Используя его, создать метод в тестовом классе, который получит строки по названию опрделенной должности/стране,

     * и сохранит его в другой файл csv.

     */

class User {

    int id,money;
    String first_name, last_name, email, country, job;
    Gender gender;

    public User(int id, String firstName, String lastName, String email, Gender gender, int money, String country, String job) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = money;
        this.country = country;
        this.job = job;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;

    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;

    }

    public Gender getGender() {
        return gender;
    }

    public String getFirst_name() {
        return first_name;
    }





    public String getCountry() {
        return country;
    }

    public String getJob() {
        return job;
    }




     public String toString() {
         return id + "  " + first_name + "  " + last_name + "  " + email +"  " + money + "  " + country + "  " + job + "  " + gender;
     }





enum Gender {
    Female, Male;
    }
}



/**

 * 5. Имплементировать класс User, от интерфейса Measurable.

 * Реализовать метод getMeasure().

 * Реализовать статичные и дефолтные методы в интерфейсе.

 * Добавить в main-е выполнение этих методов.

 */

interface Measurable {

    double getMeasure();



    static double getAverage(Measurable[] list) {

        return 0;

    }



    static double getMaximum(Measurable[] list) {

        return 0;

    }



    static double getMinimum(Measurable[] list) {

        return 0;

    }



    default boolean isGreaterThan(Measurable other){

        return false;

    }

}