//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int[] weeklyExpence = {10000, 15000, 19000, 24000, 12000};
        int totalExpence = 0;
        for (int expence : weeklyExpence) {
            totalExpence += expence;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpence + " руб.");

        {
            System.out.println();
            {
                System.out.println("Задача №2");
                int minExpence = weeklyExpence[0];
                int maxExpence = weeklyExpence[0];
                for (int expence : weeklyExpence) {
                    if (expence < minExpence) {
                        minExpence = expence;
                    }
                    if (expence > maxExpence) {
                        maxExpence = expence;
                    }
                }
                System.out.println("Минимальная сумма трат за неделю составила " + minExpence + " руб.");
                System.out.println("Максимальная сумма трат за неделю составила " + maxExpence + " руб.");
            }
            System.out.println();
            {
                System.out.println("Задача №3");
                int total = 0;
                for (int expence : weeklyExpence) {
                    total += expence;
                    double averege = (double) total / weeklyExpence.length;
                    System.out.println("Средняя сумма трат за месяц составила " + averege + " руб.");
                }
                System.out.println();
                System.out.println("Задача №4");
                char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                System.out.println("Исходный массив: " + new String(reversFullName));
                for (int i = 0; i < reversFullName.length / 2; i++) {
                    char temp = reversFullName[i];
                    reversFullName[i] = reversFullName[reversFullName.length - 1 - i];
                    reversFullName[reversFullName.length - 1 - i] = temp;
                }
                System.out.println("Результат: " + new String(reversFullName));
            }


        }
    }
}

