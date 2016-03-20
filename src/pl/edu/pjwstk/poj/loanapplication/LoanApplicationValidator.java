package pl.edu.pjwstk.poj.loanapplication;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LoanApplicationValidator {


    public static boolean validateFirstName(String firstName) {


        if (firstName == null)
            return false;

        else if (firstName.length() < 3) {
            return false;
        }


        String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.find();


    }


    public static boolean validateSurname(String surName) {

        if (surName == null) {
            return false;
        } else if (surName.length() < 3) {
            return false;
        }

        String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(surName);
        return matcher.find();
    }


    public static boolean validatePesel(String pesel) {

        if (pesel == null) {
            return false;
        } else if (pesel.length() != 11) {
            return false;
        }

        String regx = "\\d+";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pesel);
        return matcher.find();


    }

    public static boolean validateDob(String dob, String pesel) {

        if (dob == null) {
            return false;
        }
        return pesel.startsWith(dob);
    }


    public static boolean validateGender(String pesel, Gender plec) {


        char M[] = {'1', '3', '5', '7', '9'};
        char F[] = {'0', '2', '4', '6', '8'};


        if (pesel == null) {
            return false;
        }
        for (int i = 0; i < M.length; i++) {
            String m = String.valueOf(M[i]);
            String f = String.valueOf(F[i]);
            if (pesel.endsWith(m) && plec == Gender.M) {

                return true;
            } else if (pesel.endsWith(f) && plec == Gender.F) {
                return true;
            }

        }
        return false;
    }


    public static boolean validateNip(String nip) {

        int nsize = nip.length();
        int[] weights = {6, 5, 7, 2, 3, 4, 5, 6, 7};
        int j = 0, sum = 0, control = 0;
        int controlsum = Integer.valueOf(nip.substring(nsize - 1));

        if (nsize != 10) {
            return false;
        }

        for (int i = 0; i < nsize - 1; i++) {
            char c = nip.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }
        control = sum % 11;
        return (control == controlsum);

    }


    public static boolean validateNrb(String nrb) {


        if (nrb == null) {
            return false;
        } else if (nrb.length() != 26) {
            return false;
        }
        int wagi[] = {1, 10, 3, 30, 9, 90, 27, 76, 81, 34, 49, 5, 50, 15, 53, 45, 62, 38, 89, 17, 73, 51, 25, 56, 75, 71, 31, 19, 93, 57};

        nrb = nrb + "2521";
        nrb = nrb.substring(2) + nrb.substring(0, 2);

        char x[] = nrb.toCharArray();
        int Z = 0;

        for (int i = 0; i < 30; i++) {
            Z += Character.getNumericValue(x[29 - i]) * wagi[i];
        }
        if (Z % 97 == 1) {
            return true;
        }
        return false;
    }

    public static void printall(LoanApplication[] aplikacja) {

        if (aplikacja == null) {
            return;
        }

        for (int i = 0; i < aplikacja.length; i++) {
            if (LoanApplicationValidator.validateFirstName(aplikacja[i].getFirstName()) == false) {
                System.out.println("Blad - podales niepoprawne imie");
                continue;
            } else if (LoanApplicationValidator.validateSurname(aplikacja[i].getSurname()) == false) {
                System.out.println("Blad - podales niepoprawne nazwisko");
                continue;
            } else if (LoanApplicationValidator.validatePesel(aplikacja[i].getPesel()) == false) {
                System.out.println("Blad - podales niepoprawny numer pesel");
                continue;
            } else if (LoanApplicationValidator.validateDob((aplikacja[i]).data1(), aplikacja[i].getPesel()) == false) {
                System.out.println("Blad - data urodzenia nie zgadza sie z numerem pesel");
                continue;
            } else if (LoanApplicationValidator.validateGender(aplikacja[i].getPesel(), aplikacja[i].getGender()) == false) {
                System.out.println("Blad - podana plec niezgadza sie z podanym numerem pesel");
                continue;
            } else if (LoanApplicationValidator.validateNip(aplikacja[i].getNip()) == false) {
                System.out.println("Blad - niepoprawny numer nip");
                continue;
            } else if (LoanApplicationValidator.validateNrb(aplikacja[i].getBankAccountNumber()) == false) {
                System.out.println("Blad - podales niepoprawny numer konta bankowego");
                continue;
            }

            System.out.println(aplikacja[i]);
        }
    }

}




