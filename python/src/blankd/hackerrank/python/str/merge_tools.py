# https://www.hackerrank.com/challenges/merge-the-tools/problem
if __name__ == '__main__':
    with open("../../../../../solutions/test_data.txt") as f:
        the_str = f.readline().strip()
        the_split = int(f.readline())

        for jump in range(0, len(the_str), the_split):
            print(''.join(set(the_str[jump:jump+the_split])))