package pl.edu.pjwstk.poj.loanapplication;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        LoanApplication client1 = new LoanApplication("Gustaf", "Kowalski", "95032010311", "23", "123123", 1995, 6, 9, Gender.M);
        LoanApplication client2 = new LoanApplication("1", "Kowalski", "9503101043", "23", "123123", 1995, 6, 9, Gender.M);
        LoanApplication client3 = new LoanApplication("Praaaa", "Kow*", "9503101043", "23", "123123", 1995, 6, 9, Gender.M);
        LoanApplication client4 = new LoanApplication("#$$$$$$$$$", "Kowalski", "9503101043", "23", "123123", 1995, 6, 9, Gender.F);
        LoanApplication client5 = new LoanApplication("Weronika", "Kowalska", "950310", "23", "123123", 1995, 6, 9, Gender.F);
        LoanApplication client6 = new LoanApplication("Weronika", "Kowalska", "95032010311", "23", "123123", 1995, 3, 20, Gender.F);
        LoanApplication client7 = new LoanApplication("Jan", "Kowalski", "95031010433", "4768966922", "39109017370208507153471894", 1995, 03, 10, Gender.M);
        LoanApplication client8 = new LoanApplication("Jan", "Kowalski", "95031010433", "4768966923", "123123", 1995, 03, 10, Gender.M);
        LoanApplication client9 = new LoanApplication("Jan", "Kowalski", "95031010433", "4768966922", "39109017370308507153471894", 1995, 03, 10, Gender.M);
        LoanApplication client10 = new LoanApplication("Weronika", "Kowalska", "95031010432", "4768966922", "39109017370308507153471894", 1995, 03, 10, Gender.F);


        LoanApplication[] aplikacja = new LoanApplication[10];
        aplikacja[0] = client1;
        aplikacja[1] = client2;
        aplikacja[2] = client3;
        aplikacja[3] = client4;
        aplikacja[4] = client5;
        aplikacja[5] = client6;
        aplikacja[6] = client7;
        aplikacja[7] = client8;
        aplikacja[8] = client9;
        aplikacja[9] = client10;

        LoanApplicationValidator.printall(aplikacja);


    }


}
