import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів банків та їх курсів
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
        System.out.println("Усі банки та їх курси:");
        for (Bank bank : banks) {
            System.out.println(bank);
        }
    }

    // Метод для генерації випадкового курсу обміну
    private static double generateRate() {
        Random random = new Random();
        return 37 + random.nextDouble() * (42 - 37);
    }
}