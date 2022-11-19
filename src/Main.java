import java.util.*;

public class Main {
    public static void main(String[] args) {
        Passport ivan = new Passport(
                Collections.singleton("523HQG"),
                "Иванов",
                "Иван",
                "Иванович", "01.01.1980");
        Passport sergei = new Passport(
                Collections.singleton("184AEW"),
                "Сергеев",
                "Сергей",
                "Сергеевич",
                "02.02.1957");
        Passport andrei = new Passport(
                Collections.singleton("591KРB"),
                "Андреев",
                "Андрей",
                "Андреевич",
                "03.03.2000");

        Set<Passport> passportSets = new HashSet<>();
        passportSets.add(ivan);
        passportSets.add(sergei);
        passportSets.add(andrei);

        Iterator itr = passportSets.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Паспорт: " + find(passportSets, "591KРB"));


    }

    public static Passport find(Set<Passport> passportSets, String number) {
        for (Passport passports: passportSets) {
            if (passports.isSetNumber(number)) {
                return passports;
            }
        }
        return null;
    }




}