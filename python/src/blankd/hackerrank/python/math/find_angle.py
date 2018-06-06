from math import degrees, atan2
if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        ab, bc = [int(n) for n in f.readlines()]
        print('{0:d}°'.format(int(round(degrees(atan2(ab, bc))))))
