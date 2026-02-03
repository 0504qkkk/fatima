import java.util.*;

public class ArrayListTasks {

    public static void main(String[] args) {
        mergeBooks();
        findLongestMovie();
        countFries();
        removeApple();
        replaceColors();
        checkSportsSublist();
        flowerIndex();
        removeDuplicateAnimals();
        citiesToArray();
        numbersToList();
    }

    // 1. Merge Unique Elements (книги)
    public static void mergeBooks() {
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList(
                "Война и мир",
                "Преступление и наказание"
        ));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList(
                "И дольше века длится день",
                "Коко Шанель"
        ));
        Set<String> mergedSet = new LinkedHashSet<>(books1);
        mergedSet.addAll(books2);
        ArrayList<String> mergedBooks = new ArrayList<>(mergedSet);
        System.out.println("1. Merge Books: " + mergedBooks);
    }

    // 2. Find Maximum Element (самое длинное название фильма)
    public static void findLongestMovie() {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Бийиш",
                "Горничная",
                "Гарри Поттер",
                "Операция Фортуна",
                "Любовь с первого взгляда"
        ));
        String longest = "";
        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        System.out.println("2. Longest Movie: " + longest);
    }

    // 3. Count Occurrences ("Картошка фри")
    public static void countFries() {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Картошка фри", "Бургер", "Картошка фри", "Салат"
        ));
        int count = 0;
        for (String food : foods) {
            if (food.equals("Картошка фри")) count++;
        }
        System.out.println("3. Count 'Картошка фри': " + count);
    }

    // 4. Remove All Matching Elements ("Яблоко")
    public static void removeApple() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Яблоко", "Груша", "Яблоко", "Апельсин"
        ));
        fruits.removeIf(fruit -> fruit.equals("Яблоко"));
        System.out.println("4. Remove 'Яблоко': " + fruits);
    }

    // 5. Replace All Elements ("Фиолетовый")
    public static void replaceColors() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "Красный", "Синий", "Зелёный"
        ));
        Collections.fill(colors, "Фиолетовый");
        System.out.println("5. Replace Colors with 'Фиолетовый': " + colors);
    }

    // 6. Check Sublist Presence (спорт)
    public static void checkSportsSublist() {
        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "Теннис", "Пилатес", "Бокс"
        ));
        ArrayList<String> checkList = new ArrayList<>(Arrays.asList(
                "Теннис", "Пилатес"
        ));
        System.out.println("6. Sports contains all: " + sports.containsAll(checkList));
    }

    // 7. Find Index of Element ("Ромашка")
    public static void flowerIndex() {
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
                "Ромашка", "Роза", "Ромашка", "Тюльпан"
        ));
        System.out.println("7. First index of 'Ромашка': " + flowers.indexOf("Ромашка"));
        System.out.println("7. Last index of 'Ромашка': " + flowers.lastIndexOf("Ромашка"));
    }

    // 8. Remove Duplicates (животные)
    public static void removeDuplicateAnimals() {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
                "Корова", "Медведь", "Обезьяна", "Корова"
        ));
        Set<String> set = new LinkedHashSet<>(animals);
        animals = new ArrayList<>(set);
        System.out.println("8. Unique animals: " + animals);
    }

    // 9. Convert ArrayList to Array (города)
    public static void citiesToArray() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Чуй", "Ош", "Нарын"));
        String[] cityArray = cities.toArray(new String[0]);
        System.out.println("9. Cities Array: " + Arrays.toString(cityArray));
    }

    // 10. Convert Array to ArrayList (числа)
    public static void numbersToList() {
        Integer[] numbers = {7, 9, 11, 13, 25};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("10. Numbers List: " + list);
    }
}