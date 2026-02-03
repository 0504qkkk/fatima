import java.util.*;

public class AllArrayListTasks {
    public static void main(String[] args) {

        // ---------- 11. Find Common Elements ----------
        ArrayList<String> countries1 = new ArrayList<>(
                Arrays.asList("Великобритания", "Турция", "Арабские Эмираты")
        );
        ArrayList<String> countries2 = new ArrayList<>(
                Arrays.asList("Китай", "Греция", "Египет")
        );
        ArrayList<String> common = new ArrayList<>(countries1);
        common.retainAll(countries2);
        System.out.println("11. Общие страны: " + common);

        // ---------- 12. Remove Even-Length Strings ----------
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Диана", "Фатима", "Нурия", "Самина")
        );
        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println("12. Имена с нечётной длиной: " + names);

        // ---------- 13. Find Smallest Element ----------
        ArrayList<String> songs = new ArrayList<>(
                Arrays.asList("моменты", "манишь", "amazing", "love is",
                        "в открытый космос", "асфальт 8")
        );
        String shortest = songs.get(0);
        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.println("13. Самая короткая песня: " + shortest);

        // ---------- 14. Replace All Vowels ----------
        ArrayList<String> drinks = new ArrayList<>(
                Arrays.asList("чай", "бабл ти", "кола", "лимонад", "вода")
        );
        for (int i = 0; i < drinks.size(); i++) {
            drinks.set(i, drinks.get(i).replaceAll("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]", "*"));
        }
        System.out.println("14. Напитки с заменой гласных: " + drinks);

        // ---------- 15. Partition ArrayList ----------
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(15, 25, 35, 45, 88)
        );
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }
        System.out.println("15. Чётные числа: " + even);
        System.out.println("15. Нечётные числа: " + odd);

        // ---------- 16. Rotate Elements ----------
        ArrayList<String> months = new ArrayList<>(
                Arrays.asList("январь", "февраль", "март", "апрель", "май", "июнь")
        );
        Collections.rotate(months, 3); // Поворот на 3 позиции
        System.out.println("16. Месяцы после поворота: " + months);

        // ---------- 17. Remove Null Values ----------
        ArrayList<String> items = new ArrayList<>(
                Arrays.asList("сумка", "наушники", null, "брелок", "обувь", null, "заколка")
        );
        items.removeIf(Objects::isNull);
        System.out.println("17. Список без null: " + items);

        // ---------- 18. Find Second Largest Element ----------
        ArrayList<String> movies = new ArrayList<>(
                Arrays.asList("аватар", "убежище", "ограбление", "механик",
                        "человек паук", "чудо женщина")
        );
        movies.sort((a, b) -> b.length() - a.length());
        System.out.println("18. Второе по длине название фильма: " + movies.get(1));

        // ---------- 19. Replace Elements with Lengths ----------
        ArrayList<String> berries = new ArrayList<>(
                Arrays.asList("клубника", "малина", "вишня", "ежевика", "голубика")
        );
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String b : berries) {
            lengths.add(b.length());
        }
        System.out.println("19. Длины названий ягод: " + lengths);

        // ---------- 20. Create Nested ArrayList ----------
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        ArrayList<String> group1 = new ArrayList<>(
                Arrays.asList("Фатима", "Диана", "Али")
        );
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Аида", "Кубат", "Мелис")
        );
        groups.add(group1);
        groups.add(group2);
        System.out.println("20. Вложенные списки сотрудников:");
        for (ArrayList<String> group : groups) {
            System.out.println(group);
        }

    }
}