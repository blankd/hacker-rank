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
        # self.scan_horizontal(1, 3)
        self.scan_vertical(1, 0, {})
        # self.scan_vertical(1, 0)
        # print_grid(self.puzzle)

    def scan_vertical(self, col, row, found_chars):
        intersects = []
        start = row - 1
        end = row + 1
        left = col - 1
        right = col + 1

        if self.disabled == self.puzzle[start][col]:
            start = row
        if self.disabled == self.puzzle[end][col]:
            end = row

        if start == row or end == row:
            if self.is_horizontal_intersect(col, row):
                intersects.append(row)

        if start != row:
            while True:
                if self.is_horizontal_intersect(col, start):
                    intersects.append(start)

                if start - 1 > 0 and self.disabled != self.puzzle[start - 1][col]:
                    start = start - 1
                else:
                    break

        if end != row:
            while True:
                if self.is_horizontal_intersect(col, end):
                    intersects.append(end)

                if end + 1 < len(self.puzzle) and self.disabled != self.puzzle[end + 1][col]:
                    end = end + 1
                else:
                    break

        print("start row => {0:d}\nrow => {1:d}\nend row => {2:d}".format(start, row, end))
        pos_words = find_possible_words(self.words, ((end - start) + 1))

        if len(pos_words) == 1:
            word = pos_words[0]
            for letter in range(start, end + 1):
                self.puzzle[letter][col] = word[0]
                word = word[1:]
        else:
            next_chars = {}
            for intersect in intersects:
                next_chars[intersect - start] = [word[intersect - start] for word in pos_words]

            print(next_chars)

    def scan_horizontal(self, col, row, found_chars):
        intersect = []
        line = self.puzzle[row]
        start = col - 1
        end = col + 1

        if self.disabled == self.puzzle[row][start]:
            start = col
        if self.disabled == self.puzzle[row][end]:
            end = col

        if start == col or end == col:
            if self.is_vertical_intersect(col, row):
                intersect.append(col)

        if start != col:
            while True:
                if self.is_vertical_intersect(start, row):
                    intersect.append(start)

                if start - 1 > 0 and self.disabled != self.puzzle[row][start - 1]:
                    start = start - 1
                else:
                    break

        if end != col:
            while True:
                if self.is_vertical_intersect(end, row):
                    intersect.append(end)

                if end + 1 < len(line) and self.disabled != self.puzzle[row][end + 1]:
                    end = end + 1
                else:
                    break

        print("Start col --> {0:d}\nCol => {1:d}\nEnd Row => {2:d}".format(start, col, end))
        print(intersect)
        pos_words = find_possible_words(self.words, (end - start) + 1)
        if len(pos_words) == 1:
            word = pos_words[0]
            for letter in range(start, end + 1):
                self.puzzle[row][letter] = word[0]
                word = word[1:]

    def is_vertical_intersect(self, col, row):
        up = row - 1
        down = row + 1

        return (up > -1 and self.disabled != self.puzzle[up][col]) or (
                down < len(self.puzzle) and self.disabled != self.puzzle[down][col])

    def is_horizontal_intersect(self, col, row):
        left = col - 1
        right = col + 1

        return (left > -1 and self.disabled != self.puzzle[row][left]) or (
                right < len(self.puzzle) and self.disabled != self.puzzle[row][right])


if __name__ == '__main__':
    with open("../../../../solutions/test_data.txt") as f:
        puzzle = []
        for _ in range(10):
            puzzle.append(list(f.readline().strip()))
        words = f.readline().split(';')
        master = PuzzleSolver(puzzle, words, PuzzleSolver.DEFAULT_DISABLED)
        master.solve()
