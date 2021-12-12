package ru.job4j.puzzle;

// Добавить еще 2 дополнительных метода, которые будут проверять строку и столбец на нашем
// игровом поле, которые мы будем вызывать в методе check() при определенных условиях.

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        int count = 0;

        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][count] == 1 || board[count][cell] == 1) {
                while (count < board.length) {
                    if(board[cell][count] == 1 ) {
                        count++;
                    }
                    else if (board[count][cell] == 1 ) {
                        count++;
                    } else {
                        count = 0;
                        rsl = false;
                        break;
                    }
                }
                if (count == 5) {
                    break;
                }
            }
        }
        return rsl;
    }
}

