# https://www.hackerrank.com/challenges/grading/problem
# Okay so almost one line replace the file with inputs and the constants with magic numbers and it is one line.
# Of course I do not condone writing code like this, but it is a fun challenge from time to time.
LOWEST_GRADE = 40
MAX_GRADE_DISTANCE = 3


if __name__ == '__main__':
    with open("path/to/test_data.txt") as f:
        print('\n'.join(map(str, [(5 - (r % 5)) + r if 5 - (r % 5) < MAX_GRADE_DISTANCE and r >= LOWEST_GRADE - MAX_GRADE_DISTANCE else r for r in [int(f.readline()) for _ in range(int(f.readline()))]])))