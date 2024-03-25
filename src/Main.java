import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank("ПриватБанк", generateRate()));
        banks.add(new Bank("Ощадбанк", generateRate()));
        banks.add(new Bank("Укрсоцбанк", generateRate()));
        banks.add(new Bank("Альфа-Банк", generateRate()));
        banks.add(new Bank("Райффайзен Банк Аваль", generateRate()));
        banks.add(new Bank("Укрексімбанк", generateRate()));
        banks.add(new Bank("Креді Агріколь Банк", generateRate()));
        banks.add(new Bank("МоноБанк", generateRate()));
        banks.add(new Bank("Форвард Банк", generateRate()));
        banks.add(new Bank("Кредобанк", generateRate()));
        banks.add(new Bank("ПУМБ", generateRate()));
        banks.add(new Bank("Укргазбанк", generateRate()));
        banks.add(new Bank("ПроКредит Банк", generateRate()));
        banks.add(new Bank("Акордбанк", generateRate()));

        // Виведення всіх банків на екран
        System.out.println("Доступні банки та їх курси:");
        for (int i = 0; i < banks.size(); i++) {
            System.out.println((i + 1) + ". " + banks.get(i));
        }

        // Вибір банку користувачем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер банку, курс якого ви хочете подивитися: ");
        int bankIndex = scanner.nextInt();

        if (bankIndex >= 1 && bankIndex <= banks.size()) {
            Bank selectedBank = banks.get(bankIndex - 1);
            System.out.println("Ви обрали " + selectedBank);
        } else {
            System.out.println("Невірний номер банку");
        }
    }

    // Метод для генерації випадкового курсу обміну
    private static double generateRate() {
        Random random = new Random();
        return 37 + random.nextDouble() * (42 - 37);
    }
}