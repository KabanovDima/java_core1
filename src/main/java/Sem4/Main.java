package Sem4;

public class Main {
//1.    Создать статический метод который принимает на вход три
//    параметра: login, password и confirmPassword.
//2. Длина login должна быть меньше 20 символов. Если login не
//    соответствует этим требованиям, необходимо выбросить
//    WrongLoginException.
//3. Длина password должна быть меньше 20 символов. Также password
//    и confirmPassword должны быть равны. Если password не
//    соответствует этим требованиям, необходимо выбросить
//    WrongPasswordException.
//4. WrongPasswordException и WrongLoginException - пользовательские
//    классы исключения с двумя конструкторами – один по умолчанию,
//    второй принимает сообщение исключения и передает его в
//    конструктор класса Exception.
//5. В основном классе программы необходимо по-разному обработать
//    исключения.
//6. Метод возвращает true, если значения верны или false в другом
//    случае.

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(authorize("di", "22", "22"));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());;
        }
    }
    public static boolean authorize(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 3){
            throw new WrongLoginException();
        }
        if (password.length() > 3){
            throw new WrongPasswordException("Password length more than 20 symbols");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Password does not match confirmPassword");
        }
        return false;
    }

}
