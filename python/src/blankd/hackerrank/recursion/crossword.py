def find_possible_words(the_words, w_len):
    pos = list()
    for word in the_words:
        if len((word)) == w_len:
            pos.append(word)
    return pos


def print_grid(grid):
    for row in grid:
        print(''.join(row))


class PuzzleSolver:
    DEFAULT_DISABLED = "+"

    def __init__(self, puzzle, words, disabled):
        self.puzzle = puzzle
        self.words = words
        self.disabled = disabled

    def solve(self):
        pass

    def scan_word(self, row, col, horizontal, found_chars):
        pass

if __name__ == '__main__':
    with open("../../../../solutions/test_data.txt") as f:
        puzzle = []
        for _ in range(10):
            puzzle.append(list(f.readline().strip()))
        words = f.readline().split(';')
        master = PuzzleSolver(puzzle, words, PuzzleSolver.DEFAULT_DISABLED)
        master.solve()
