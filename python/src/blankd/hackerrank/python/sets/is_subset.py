# https://www.hackerrank.com/challenges/py-check-subset/problem
if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        cases = int(f.readline())
        for c in range(cases):
            a_len = int(f.readline())
            input_a = f.readline()
            b_len = int(f.readline())
            input_b = f.readline()
            # Set A cannot be a subset of set B if there are items in set A
            # Hence no reason to waste time on making sets
            if b_len > a_len:
                a_set = set(map(int, input_a.split()))
                b_set = set(map(int, input_b.split()))

                print(len(b_set.union(a_set)) == b_len)
            else:
                print(False)
