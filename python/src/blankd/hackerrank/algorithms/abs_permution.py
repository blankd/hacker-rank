if __name__ == '__main__':
    with open("../../../../solutions/test_data.txt") as f:
        for _ in range(int(f.readline())):
            (n, k) = map(int, f.readline().split(" "))

            if k == 0:
                print(' '.join([str(i) for i in range(1, n + 1)]))
            elif n % (k * 2) == 0:
                res = [None] * (n + 1)
                for i in range(1, n + 1):
                    if res[i] is None:
                        res[i] = str(i + k)
                        res[i + k] = str(i)
                print(' '.join(res[1:]))
            else:
                print("-1")
