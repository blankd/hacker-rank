# https://www.hackerrank.com/challenges/python-mod-divmod/problem
if __name__ == '__main__':
    with open("/path/to/the/test_data.txt") as f:
        d = divmod(int(f.readline()), int(f.readline()))
        print("{0:d}\n{1:d}\n{2}".format(d[0], d[1], d))
