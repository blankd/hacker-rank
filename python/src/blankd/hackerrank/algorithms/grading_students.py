LOWEST_GRADE = 40
MAX_GRADE_DISTANCE = 3


def calc_grade(grade):
    if grade < LOWEST_GRADE - MAX_GRADE_DISTANCE:
        return grade
    else:
        diff = 1
        while diff < MAX_GRADE_DISTANCE:
            if (grade + diff) % 5 == 0:
                return grade + diff
            diff = diff + 1
        return grade


if __name__ == '__main__':
    with open("/path/to/test_data.txt") as f:
        grades = [int(f.readline()) for _ in range(int(f.readline()))]
        results = [calc_grade(r) for r in grades]
        print('\n'.join(map(str, results)))
