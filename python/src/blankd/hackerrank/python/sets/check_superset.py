# https://www.hackerrank.com/challenges/py-check-strict-superset/problem
if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        super_set = set(map(int, input().split()))
        total_sets = int(input())
        all_super = True
        while all_super and total_sets > 0:
            the_set = set(map(int, input().split()))
            all_super = len(super_set.union(the_set)) == len(super_set)
            total_sets -= 1
        print(all_super)
