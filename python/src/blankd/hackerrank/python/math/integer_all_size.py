if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        (a, b, c, d) = [int(_) for _ in f.readlines()]
        print(pow(a, b) + pow(c, d))
