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

        // Курс долара до гривні
        double usdToUahRate = 27.50; // Припустимо, курс долара становить 27.50 гривень

        // Пошук банків з найвигіднішим курсом обміну
        List<Bank> bestBanks = new ArrayList<>();
        double bestRate = 0;

        for (Bank bank : banks) {
            double rate = bank.getRate();
            double uahAmount = 100 * rate; // Обмін 100 доларів на гривні

            if (uahAmount > bestRate) {
                bestRate = uahAmount;
                bestBanks.clear();
                bestBanks.add(bank);
            } else if (uahAmount == bestRate) {
                bestBanks.add(bank);
            }
        }

        // Виведення найвигідніших банків на екран
        System.out.println("Найвигідніші банки для обміну доларів на гривні:");
        for (Bank bank : bestBanks) {
            System.out.println(bank.getName() + " - курс: " + bank.getRate());
        }
    }

    // Метод для генерації випадкового курсу обміну
    private static double generateRate() {
        Random random = new Random();
        return 37 + random.nextDouble() * (42 - 37);
    }
}