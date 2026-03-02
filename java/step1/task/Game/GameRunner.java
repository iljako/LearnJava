import java.util.Scanner;

class GameLogic {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    private static final String[] MOVE_NAMES = {"", "Камень", "Бумага", "Ножницы"};

    public int getWinner(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            return 0; // Ничья
        }

        switch (playerMove) {
            case ROCK:
                if (computerMove == SCISSORS) return 1;
                else return 2;
            case PAPER:
                if (computerMove == ROCK) return 1;
                else return 2;
            case SCISSORS:
                if (computerMove == PAPER) return 1;
                else return 2;
            default:
                return -1; // Ошибка
        }
    }

    public String getMoveName(int move) {
        if (move >= 1 && move <= 3) {
            return MOVE_NAMES[move];
        }
        return "Неизвестно";
    }

    public String getResultMessage(int result) {
        if (result == 1) return "Вы победили!";
        if (result == 2) return "Вы проиграли!";
        return "Ничья!";
    }
}

class Field {
    private int playerScore;
    private int computerScore;
    private int lastPlayerMove;
    private int lastComputerMove;

    public Field() {
        this.playerScore = 0;
        this.computerScore = 0;
        this.lastPlayerMove = 0;
        this.lastComputerMove = 0;
    }

    public void setMoves(int playerMove, int computerMove) {
        this.lastPlayerMove = playerMove;
        this.lastComputerMove = computerMove;
    }

    public void updateScore(int result) {
        if (result == 1) { // Победа игрока
            this.playerScore++;
        } else if (result == 2) { // Победа компьютера
            this.computerScore++;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getLastPlayerMove() {
        return lastPlayerMove;
    }

    public int getLastComputerMove() {
        return lastComputerMove;
    }

    // Вывод состояния поля в консоль
    public void display(GameLogic logic) {
        System.out.println("\n--- Игровое поле ---");
        System.out.println("Ваш ход: " + logic.getMoveName(lastPlayerMove));
        System.out.println("Ход ПК:  " + logic.getMoveName(lastComputerMove));
        System.out.println("Счет (Вы : ПК) -> " + playerScore + " : " + computerScore);
        System.out.println("--------------------\n");
    }
}

public class GameRunner {
    public static void main(String[] args) {
        Field field = new Field();
        GameLogic logic = new GameLogic();

        Scanner scanner = new Scanner(System.in);

        int playerMove;
        int computerMove;
        int result;
        boolean gameRunning = true;

        System.out.println("=== Камень, Ножницы, Бумага ===");
        System.out.println("Правила: 1 - Камень, 2 - Бумага, 3 - Ножницы");
        System.out.println("Введите 0 для выхода.\n");

        while (gameRunning) {
            System.out.print("Ваш ход (1-3): ");

            if (scanner.hasNextInt()) {
                playerMove = scanner.nextInt();

                if (playerMove == 0) {
                    gameRunning = false;
                    continue;
                }

                if (playerMove < 1 || playerMove > 3) {
                    System.out.println("Ошибка: Введите число от 1 до 3.");
                    continue;
                }

                computerMove = (int) (Math.random() * 3) + 1;

                field.setMoves(playerMove, computerMove);

                result = logic.getWinner(playerMove, computerMove);
                field.updateScore(result);

                System.out.println(logic.getResultMessage(result));
                field.display(logic);
            } else {
                System.out.println("Ошибка: Введите цифру.");
                scanner.next();
            }
        }

        System.out.println("Игра окончена. Спасибо за игру!");
        scanner.close();
    }
}