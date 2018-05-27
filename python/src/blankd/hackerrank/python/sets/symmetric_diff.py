# https://www.hackerrank.com/challenges/py-set-symmetric-difference-operation
if __name__ == '__main__':
    with open("path/to/test/data.txt") as f:
        lines = f.readlines()
        worthless_one = lines[0]
        set_one = set(map(int, lines[1].split()))
        worthless_two = lines[2]
        set_two = set(map(int, lines[3].split()))
        print(len(set_one.symmetric_difference(set_two)))
