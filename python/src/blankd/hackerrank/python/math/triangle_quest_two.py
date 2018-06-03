# https://www.hackerrank.com/challenges/triangle-quest-2/problem
# Rules: One For Loop One Print Statement No Strings max two lines
if __name__ == '__main__':
    for n in range(1, int(input()) + 1):
        print(pow((pow(10, n) // 9), 2))
