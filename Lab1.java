import java.util.Arrays;
import java.util.Scanner;


public class Lab1 {
    private Scanner scanner = new Scanner(System.in);


    // Задача 1.3
    public int charToNum (char x) {
        return x - '0';
    }

    // Задача 1.4
    public boolean isPositive (int x) {
        return x > 0;
    }

    // Задача 1.6
    public boolean isUpperCase (char x) {
        return x >= 'A' && x <= 'Z';
    }

    // Задача 1.8
    public boolean isDivisor (int a, int b) {
        if (a == 0) {
            return false;
        }
        if (b == 0) {
            return false;
        }
        return (a % b == 0) || (b % a == 0);
    }

    // Задача 1.10
    public int lastNumSum (int a, int b) {
        return (Math.abs(a) % 10) + (Math.abs(b) % 10);
    }

    // Задача 2.1
    public int abs (int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    // Задача 2.4
    public String makeDecision (int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " = " + y;
        }
    }

    // Задача 2.5
    public int max3 (int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // Задача 2.7
    public int sum2 (int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // Задача 2.9
    public String day (int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // Задача 3.2
    public String reverseListNums (int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }
        return result.trim();
    }

    // Задача 3.3
    public String chet (int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    // Задача 3.6
    public boolean equalNum (int x) {
        x = Math.abs(x);
        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    // Задача 3.8
    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    // Задача 3.9
    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    // Задача 4.1
    public int findFirst (int [] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //Задача 4.2
    public int findLast (int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача 4.4
    public int[] add (int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    // Задача 4.7
    public int[] reverseBack (int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 -i];
        }
        return result;
    }

    // Задача 4.10
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int val : arr) {
            if (val >= 0) count ++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int val : arr) {
            if (val >= 0) {
                result[index++] = val;
            }
        }
        return result;
    }

    // Методы ввода с проверкой
    private int readInt (String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Введите целое число!");
            scanner.next();
            System.out.println("Введите снова: ");
        }
        return scanner.nextInt();
    }

    private char readChar (String message) {
        System.out.print(message);
        String input = scanner.next();
        return input.charAt(0);
    }

    private int[] readArray() {
        int size = readInt("Введите размер массива: ");
        while (size < 0) {
            System.out.println("Размер не может быть отрицательным!");
            size = readInt("Введите размер массива: ");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = readInt("  Элемент [" + i + "]: ");
        }
        return arr;
    }

    // Метод main с меню выбора задачи
    public static void main (String[] args) {
        Lab1 lab = new Lab1();
        boolean running = true;

        while (running) {
            System.out.println("Лабораторная работа 1. Вариант 10");
            System.out.println();
            System.out.println("ЗАДАНИЕ 1. МЕТОДЫ");
            System.out.println(" 1. Задача 1.3 (Букву в число)");
            System.out.println(" 2. Задача 1.4 (Есть ли позитив)");
            System.out.println(" 3. Задача 1.6 (Большая буква)");
            System.out.println(" 4. Задача 1.8 (Делитель)");
            System.out.println(" 5. Задача 1.10 (Многократный вызов");
            System.out.println();
            System.out.println("ЗАДАНИЕ 2. УСЛОВИЯ");
            System.out.println(" 6. Задача 2.1 (Модуль числа)");
            System.out.println(" 7. Задача 2.4 (Строка сравнения)");
            System.out.println(" 8. Задача 2.5 (Тройной максимум)");
            System.out.println(" 9. Задача 2.7 (Двойная сумма)");
            System.out.println(" 10. Задача 2.9 (День недели)");
            System.out.println();
            System.out.println("ЗАДАНИЕ 3. ЦИКЛЫ");
            System.out.println(" 11. Задача 3.2 (Числа наоборот)");
            System.out.println(" 12. Задача 3.3 (Четные числа)");
            System.out.println(" 13. Задача 3.6 (Одинаковость)");
            System.out.println(" 14. Задача 3.8 (Левый треугольник)");
            System.out.println(" 15. Задача 3.9 (Правый треугольник)");
            System.out.println();
            System.out.println("ЗАДАНИЕ 4. МАССИВЫ");
            System.out.println(" 16. Задача 4.1 (Поиск первого значения)");
            System.out.println(" 17. Задача 4.2 (Поиск последнего значения)");
            System.out.println(" 18. Задача 4.4 (Добавление в массив)");
            System.out.println(" 19. Задача 4.7 (Возвратный реверс)");
            System.out.println(" 20. Задача 4.10 (Удалить негатив)");
            System.out.println(" 0. Выход");

            int choice = lab.readInt("Выберите задачу: ");
            switch (choice) {
                case 1:
                    char c1 = lab.readChar("Введите цифру (0-9): ");
                    System.out.println("Ответ: " + lab.charToNum(c1));
                    break;
                case 2:
                    int num2 = lab.readInt("Введите число: ");
                    System.out.println("Ответ: " + lab.isPositive(num2));
                    break;
                case 3:
                    char c3 = lab.readChar("Введите символ: ");
                    System.out.println("Ответ: " + lab.isUpperCase(c3));
                    break;
                case 4:
                    int a4 = lab.readInt("Введите первое число: ");
                    int b4 = lab.readInt("Введите второе число: ");
                    System.out.println("Ответ: " + lab.isDivisor(a4, b4));
                    break;
                case 5:
                    System.out.println("Введите 5 чисел: ");
                    int n1 = lab.readInt("Число 1: ");
                    int n2 = lab.readInt("Число 2: ");
                    int n3 = lab.readInt("Число 3: ");
                    int n4 = lab.readInt("Число 4: ");
                    int n5 = lab.readInt("Число 5: ");
                    int res = lab.lastNumSum(n1, n2);
                    res = lab.lastNumSum(res, n3);
                    res = lab.lastNumSum(res, n4);
                    res = lab.lastNumSum(res, n5);
                    System.out.println("Ответ: " + res);
                    break;
                case 6:
                    int num6 = lab.readInt("Введите число: ");
                    System.out.println("Модуль числа: " + lab.abs(num6));
                    break;
                case 7:
                    int x7 = lab.readInt("Введите первое число: ");
                    int y7 = lab.readInt("Введите второе число: ");
                    System.out.println("Ответ: " + lab.makeDecision(x7, y7));
                    break;
                case 8:
                    int x8 = lab.readInt("Число 1: ");
                    int y8 = lab.readInt("Число 2: ");
                    int z8 = lab.readInt("Число 3: ");
                    System.out.println("Максимум: " + lab.max3(x8, y8, z8));
                    break;
                case 9:
                    int x9 = lab.readInt("Введите первое число: ");
                    int y9 = lab.readInt("Введите второе число: ");
                    System.out.println("Ответ: " + lab.sum2(x9, y9));
                    break;
                case 10:
                    int dayNum = lab.readInt("Введите номер дня недели (1-7): ");
                    System.out.println("День недели: " + lab.day(dayNum));
                    break;
                case 11:
                    int x11 = lab.readInt("Введите число x: ");
                    System.out.println("Ответ: " + lab.reverseListNums(x11));
                    break;
                case 12:
                    int x12 = lab.readInt("Введите число x: ");
                    System.out.println("Четные числа: " + lab.chet(x12));
                    break;
                case 13:
                    int x13 = lab.readInt("Введите число x: ");
                    System.out.println("Ответ: " + lab.equalNum(x13));
                    break;
                case 14:
                    int h14 = lab.readInt("Введите высоту: ");
                    lab.leftTriangle(h14);
                    break;
                case 15:
                    int h15 = lab.readInt("Введите высоту: ");
                    lab.rightTriangle(h15);
                    break;
                case 16:
                    int[] arr16 = lab.readArray();
                    int search16 = lab.readInt("Введите искомое число: ");
                    System.out.println("Индекс первого вхождения: " + lab.findFirst(arr16, search16));
                    break;
                case 17:
                    int[] arr17 = lab.readArray();
                    int search17 = lab.readInt("Введите искомое число: ");
                    System.out.println("Индекс последнего вхождения: " + lab.findFirst(arr17, search17));
                    break;
                case 18:
                    int[] arr18 = lab.readArray();
                    int val18 = lab.readInt("Введите добавляемое число: ");
                    int pos18 = lab.readInt("Введите позицию для вставки (0.." + arr18.length + "): ");
                    while (pos18 < 0 || pos18 > arr18.length) {
                        System.out.println("Некорректная позиция!");
                        pos18 = lab.readInt("Введите позицию заново (0.." + arr18.length + "): ");
                    }
                    System.out.println("Новый массив: " + Arrays.toString(lab.add(arr18, val18, pos18)));
                    break;
                case 19:
                    int[] arr19 = lab.readArray();
                    System.out.println("Развернутый массив: " + Arrays.toString(lab.reverseBack(arr19)));
                    break;
                case 20:
                    int[] arr20 = lab.readArray();
                    System.out.println("Массив без отрицательных чисел: " + Arrays.toString(lab.deleteNegative(arr20)));
                    break;
                case 0:
                    running = false;
                    System.out.println("Заверщение работы");
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуйте еще раз");
                    break;
            }
        }
    }
}