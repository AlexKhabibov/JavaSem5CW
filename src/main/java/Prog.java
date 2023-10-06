import java.util.*;
//
//public class Prog {
//    public static void main(String[] args) {
//        TreeMap<Integer, String> treeMap = new TreeMap<>();
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        HashMap<Integer, String> hashMap = new HashMap<>();
//
//        hashMap.put(5, "Пять");
//        hashMap.putIfAbsent(5, "Пять");
//        hashMap.replace(5, "Пять");
//        hashMap.put(5, "Три");
//        hashMap.replace(5, "Три", "Пять");
//        String str = hashMap.get(5);
//        hashMap.getOrDefault(5, "Ничего");
//        if (hashMap.containsValue("Пять")) {}
//        if (hashMap.containsKey(5)) {}
//        hashMap.remove(5);
//        hashMap.remove(5, "Три");
//
//        for (int i = 0; i < 10; i++) {
//            hashMap.put(i, Character.getName(i));
//        }
//
//        hashMap.compute(10, (k, v) -> v == null ? v = "10" : v + "11");
//        hashMap.computeIfPresent(10, (k, v) -> v == null ? v = "10" : v + "11");
//        hashMap.computeIfAbsent(10, v -> "9");
//
//        Set<Map.Entry<Integer, String>> a = hashMap.entrySet();
//        Iterator<Map.Entry<Integer, String>> iterator = a.iterator();
//        while (iterator.hasNext()){}
//
//        Set<Integer> k = hashMap.keySet();
//        Collection<String> v = hashMap.values();
//
//        AtomicInteger integer = new AtomicInteger(11);
//        hashMap.merge(integer.get(), "11", (o, n) -> {
//            if (o == null) {
//                System.out.println("Оштибка");
//                System.exit(-1);
//            }
//            o = o+n+String.valueOf(integer.get());
//            return o;
//        });
//
//        System.out.println(hashMap);
//
//        hashMap.forEach( (k1, v1) -> System.out.println(k1+" = "+v1));
//
//    }
//}

// Задание:
// Дана строка. Необходимо написать метод, который отсортирует слова в
// строке по длине с помощью TreeMap. Строки с одинаковой длиной не
// должны “потеряться”.

//public class Prog {
//    public static void main(String[] args) {
//        String s ="В начале октября владельцы гаджетов Xiaomi из России и Белоруссии начали жаловаться на проблемы в работе устройств";
//        TreeMap<String, Integer> treeMap = new TreeMap<>((a1, b) -> {
//            if (a1.length() != b.length()) return a1.length() - b.length();
//            return a1.compareTo(b);
//        });
//        String[] a = s.split(" ");
//        for (int i = 0; i < a.length; i++) {
//        treeMap.put(a[i], a[i].length());
//        }
//        treeMap.forEach((a1, b) -> System.out.println(a1 + "=" +b));
//    }
//}

//    Задание:
//    1. Создать мапу, ключ - случайная строка из Char getName а значение - индекс первой буквы ключа.
//    2. Сделать так, чтобы значений было 10
//    3. Вывести пары (ключ/значение) отсортированные по значению.

//public class Prog {
//    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
////        for (int i = 0; hashMap.size() < 10; i++) {
//            while (hashMap.size() < 10) {
//            String a = Character.getName(new Random().nextInt(50));
//            hashMap.put(a, (int) a.charAt(0));
//        }
//        System.out.println(hashMap.toString().replace(",", "\n"));
//        System.out.println("-.".repeat(15));
//        ArrayList<Integer>list = new ArrayList(hashMap.values());
//        list.addAll(hashMap.values());
//
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);
//        for (int v:list) {
//            for (String k: hashMap.keySet()) {
//                if (hashMap.get(k) == (v)) System.out.println(k+ "=" +v);
//            }
//        }
//        hashMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
////                .limit(5) // Можно дописать еще задачи
//                .forEach(k -> System.out.println(k.getKey()+ "="+k.getValue()));
//    }
//}