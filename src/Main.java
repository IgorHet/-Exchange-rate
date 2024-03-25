import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів банків та їх курсів
        Bank[] banks = new Bank[14];
        banks[0] = new Bank("ПриватБанк", generateRate());
        banks[1] = new Bank("Ощадбанк", generateRate());
        banks[2] = new Bank("Укрсоцбанк", generateRate());
        banks[3] = new Bank("Альфа-Банк", generateRate());
        banks[4] = new Bank("Райффайзен Банк Аваль", generateRate());
        banks[5] = new Bank("Укрексімбанк", generateRate());
        banks[6] = new Bank("Креді Агріколь Банк", generateRate());
        banks[7] = new Bank("МоноБанк", generateRate());
        banks[8] = new Bank("Форвард Банк", generateRate());
        banks[9] = new Bank("Кредобанк", generateRate());
        banks[10] = new Bank("ПУМБ", generateRate());
        banks[11] = new Bank("Укргазбанк", generateRate());
        banks[12] = new Bank("ПроКредит Банк", generateRate());
        banks[13] = new Bank("Акордбанк", generateRate());

        // Знайти найкращий банк за курсом
        Bank bestBank = banks[0];
        for (int i = 1; i < banks.length; i++) {
            if (banks[i].getRate() < bestBank.getRate()) {
                bestBank = banks[i];
            }
        }

        // Виведення найкращого банку на екран
        System.out.println("Найкращий банк за курсом: " + bestBank);
    }

    // Метод для генерації випадкового курсу обміну
    private static double generateRate() {
        Random random = new Random();
        return 37 + random.nextDouble() * (42 - 37);
    }
}