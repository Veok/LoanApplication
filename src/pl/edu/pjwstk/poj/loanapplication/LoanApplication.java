package pl.edu.pjwstk.poj.loanapplication;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class LoanApplication {

    private String firstName;
    private String Surname;
    private String pesel;
    private String nip;
    private String bankAccountNumber;
    private Date dateOfBirth;
    private Gender gender;


    public LoanApplication(String firstName, String Surname, String pesel, String nip, String bankAccountNumber, int year, int month, int day, Gender gender) {

        this.firstName = firstName;
        this.Surname = Surname;
        this.pesel = pesel;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
        this.gender = gender;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        dateOfBirth = calendar.getTime();

    }


    public LoanApplication() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String data1() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyMMdd");
        String dateOfBirth1 = DATE_FORMAT.format(dateOfBirth);
        return dateOfBirth1;
    }


    @Override
    public String toString() {


        return "LoanApplication [firstName=" + firstName + ", Surname=" + Surname + ", pesel=" + pesel + ", nip=" + nip
                + ", bankAccountNumber=" + bankAccountNumber + ", dateOfBirth=" + data1() + ", gender=" + gender
                + "]";
    }


}

