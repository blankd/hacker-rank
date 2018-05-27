# https://www.hackerrank.com/challenges/no-idea
if __name__ == '__main__':
    with open("path/to/data/file") as f:
        total = 0
        lines = f.readlines()
        (m, n) = lines[0].split()
        nums = lines[1].split()
        like = set(lines[2].split())
        dislike = set(lines[3].split())

        for num in nums:
            if num in like:
                total += 1
            if num in dislike:
                total -= 1

        print(total)
