package com.sudoku;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // Allows frontend to connect
@RestController
@RequestMapping("/sudoku")
public class SudokuController {
    private final Sudoku solver = new Sudoku();

    @PostMapping("/solve")
    public char[][] solveSudoku(@RequestBody char[][] board) {
        return solver.solveSudoku(board);
    }
}
