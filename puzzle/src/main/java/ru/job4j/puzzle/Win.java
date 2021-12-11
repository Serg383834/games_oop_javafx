package ru.job4j.puzzle;

// Добавить еще 2 дополнительных метода, которые будут проверять строку и столбец на нашем
// игровом поле, которые мы будем вызывать в методе check() при определенных условиях.

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int[] ints : board) {
            rsl = true;
            for (int cell = 0; cell < board.length; cell++) {
                if (ints[cell] != 1) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) {
                break;
            }
        }
        if (!rsl) {
            for (int row = 0; row < board.length; row++) {
                rsl = true;
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[cell][row] != 1) {
                        rsl = false;
                        break;
                    }
                }
                if (rsl) {
                    break;
                }
            }

        }
        return rsl;
    }
}

