from sys import argv


# Solution for https://www.hackerrank.com/challenges/apple-and-orange/problem
class AppleAndOrange:
    def __init__(self, path_to_file):
        with open(path_to_file) as f:
            (self.s, self.t) = map(int, f.readline().split(" "))
            (self.apple_tree, self.orange_tree) = map(int, f.readline().split(" "))
            unused = map(int, f.readline().split(" "))
            self.apples = map(int, f.readline().split(" "))
            self.oranges = map(int, f.readline().split(" "))

    def run_solution(self):
        hits = [0, 0]
        for apple in self.apples:
            hits[0] += 1 if (self.s <= (apple + self.apple_tree) <= self.t) else 0
        for orange in self.oranges:
            hits[1] += 1 if (self.s <= (orange + self.orange_tree) <= self.t) else 0
        for hit in hits:
            print(hit)


if __name__ == '__main__':
    aao = AppleAndOrange(argv[1])
    aao.run_solution()
