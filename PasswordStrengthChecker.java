import java.util.*;
public class PasswordStrengthChecker {
    static String Password;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Password: ");
        Password = scanner.nextLine();

        int Score = StrengthScore(Password);
        System.out.println("Password Strength: " + StrengthChecker(Score));
    }

    public static int StrengthScore(String Password){
        int score = 0;
        if(Password.length() >= 8){
            score++;
        }if(Password.matches(".*[A-Z].*")){
            score++;
        }if(Password.matches(".*[a-z].*")){
            score++;
        }if(Password.matches(".*\\d.*")){
            score++;
        }if(Password.matches(".*[!@#$%^&*()-+].*")){
            score++;
        }
        return score;
    }

    public static String StrengthChecker(int score){
        if(score == 5){
            return "Very Strong";
        }else if(score == 4){
            return "Strong";
        }else if(score == 3){
            return "Good";
        }else if(score == 2){
            return "Weak";
        }else{
            return "Very Weak";
        }
    }
}