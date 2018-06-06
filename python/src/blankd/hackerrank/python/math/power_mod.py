if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        (a, b, m) = [int(x) for x in f.readlines()]
        print(pow(a, b), pow(a, b, m), sep='\n')
