import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password, shfrPassword;
        int count = 0;

        shfrPassword = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        password = input.next();

        if (password.length() != 5){
            System.out.print("Пароль должен состоять ровно из 5 символов");
        }
        else{
            for (int i = 0; i < password.length(); i++) {
                if (!(password.charAt(i) > 47 && password.charAt(i) < 58 || password.charAt(i) > 64 && password.charAt(i) < 91 || password.charAt(i) > 96 && password.charAt(i) < 123))
                {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) > 64 && (password.charAt(i) < 91) || (password.charAt(i) > 96 && (password.charAt(i) < 123)))
                    {
                        shfrPassword += (int) password.charAt(i);
                    }
                    else {
                        shfrPassword += Integer.parseInt(("" + password.charAt(i))) + 1;
                    }
                }
                System.out.print(shfrPassword);
            }
            else System.out.print("В пароле могут быть только латинские буквы и арабские цифры");
        }
    }
}