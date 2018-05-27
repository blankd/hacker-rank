# https://www.hackerrank.com/challenges/polar-coordinates/problem
from cmath import polar

if __name__ == '__main__':
    with open("../../../../../solutions/test_data.txt") as f:
        (r, p) = polar(complex(f.readline()))
        print(r)
        print(p)
