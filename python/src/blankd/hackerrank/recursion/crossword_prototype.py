# https://www.hackerrank.com/challenges/crossword-puzzle/problem
def solve_puzzle(puzzle, words, disabled='+'):
    # print(puzzle[9][4])
    # print(puzzle[8][4])
    # print(puzzle[7][4])
    # print(puzzle[6][4])
    # print(puzzle[5][4])
    # print(puzzle[4][4])
    # print(puzzle[3][4])
    # print(puzzle[2][4])
    # print(puzzle[1][4])
    # print(puzzle[0][4])
    # print('&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&')

    # scan_horizontal(puzzle, words, 3, 3, disabled, [])
    scan_vertical(puzzle, words, 5, 7, disabled, [])
    # scan_vertical(puzzle, words, 1, 0, disabled, [])
    # scan_vertical(puzzle, words, 1, 0, disabled)
    # for row in range(len(puzzle)):
    #     for c in range(len(puzzle[row])):
    #         if puzzle[row][c] != disabled and not puzzle[row][c].isalpha():
    #             scan_vertical(puzzle, words, c, row, disabled)


def scan_vertical(puzzle, words, col, row, disabled, pos_chars):
    intersect = []
    start_row = row - 1
    if start_row < 0:
        start_row = 0
    elif disabled == puzzle[start_row][col]:
        start_row = row

    end_row = row + 1
    if end_row > len(puzzle):
        end_row = len(puzzle) - 1
    elif disabled == puzzle[end_row][col]:
        end_row = row

    print("start -> {0:d} --- row -> {1:d} --- end -> {2:d}".format(start_row, row, end_row))
    if start_row != row:
        while True:
            if col - 1 > -1 and disabled != puzzle[start_row][col - 1]:
                intersect.append(start_row)
            elif col + 1 > len(puzzle) and disabled != puzzle[start_row][col + 1]:
                intersect.append(start_row)

            if start_row - 1 > 0 and disabled != puzzle[start_row - 1][col]:
                start_row = start_row - 1
            else:
                break

    if end_row != row:
        print("going down")
        while True:
            if col - 1 < len(puzzle) and disabled != puzzle[end_row][col - 1]:
                intersect.append(end_row)
            elif col + 1 < len(puzzle) and disabled != puzzle[end_row][col + 1]:
                intersect.append(end_row)

            if end_row + 1 < len(puzzle) and disabled != puzzle[end_row + 1][col]:
                end_row = end_row + 1
            else:
                break

    if disabled != puzzle[row][col]:
        intersect.append(row)

    print(intersect)
    print("start -> {0:d} --- row -> {1:d} ---- end -> {2:d}".format(start_row, row, end_row))

def find_possible_words(words, size):
    ret = []
    for word in words:
        if len(word) == size:
            ret.append(word)

    return ret


if __name__ == '__main__':
    with open("../../../../solutions/test_data.txt") as f:
        puzzle = []
        for _ in range(10):
            puzzle.append(list(f.readline().strip()))
        words = f.readline().split(';')

        solve_puzzle(puzzle, words)
        # for line in puzzle:
        #     print(' '.join(line))
