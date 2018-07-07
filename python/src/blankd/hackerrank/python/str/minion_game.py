# https://www.hackerrank.com/challenges/the-minion-game/problem
VOWELS = ['A', 'E', 'I', 'O', 'U']
STUART = "Stuart"
KEVIN = "Kevin"
if __name__ == '__main__':
    with open("../../../../../solutions/test_data.txt") as f:
        word = f.readline().strip()
        stu = 0
        kev = 0

        for start in range(0, len(word)):
            if word[start] in VOWELS:
                kev = kev + len(word) - start
            else:
                stu = stu + len(word) - start

        if kev == stu:
            print("DRAW")
        else:
            print("{0} {1:d}".format(STUART if stu > kev else KEVIN, stu if stu > kev else kev))
