# https://www.hackerrank.com/challenges/py-set-add
if __name__ == '__main__':
    with open("path/to/file.txt") as f:
        lines = f.readlines()
        print(len(set([lines[i].strip() for i in range(1, int(lines[0])+1)])))
