# https://www.hackerrank.com/challenges/py-set-union
if __name__ == '__main__':
    with open("path/to/file.txt") as f:
        lines = f.readlines()
        set_one = set(map(int, lines[1].split()))
        set_two = set(map(int, lines[3].split()))
        print(len(set_one.union(set_two)))
