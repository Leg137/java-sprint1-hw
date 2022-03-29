import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Предлагаю выбрать дату, за которую хотите ввести количество шагов");
                System.out.println("Выберите месяц: 01-Янв | 02-Фев | 03-Мар | 04-Апр | 05-Май | 06-Июн \n\t\t\t\t07-Июл | 08-Авг | 09-Сен | 10-Окт | 11-Ноя | 12-Дек");
                int month = scanner.nextInt();
                if (month == 1) {
                    System.out.println("Выберите число:");
                    for (int i = 1; i < 32; i += 7) {
                        int n = i;

                        for (int j = n; j < (n + 7) & j < 32; j++) {
                            System.out.print("\t" + j + "\t|");
                        }

                        System.out.println("");
                    }




                }

                //converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                //dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                /*System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();

                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);*/


            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}