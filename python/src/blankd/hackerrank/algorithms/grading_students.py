LOWEST_GRADE = 40
MAX_GRADE_DISTANCE = 3


def calc_grade(grade):
    if grade < LOWEST_GRADE - MAX_GRADE_DISTANCE:
        return grade
    else:
        mod = (5 - (grade % 5))
        return grade + mod if mod < MAX_GRADE_DISTANCE else grade


if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        grades = [int(f.readline()) for _ in range(int(f.readline()))]
        results = [calc_grade(r) for r in grades]
        print('\n'.join(map(str, results)))
