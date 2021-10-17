from collections import Counter

from blankd.hackerrank.main.hacker_rank_solution import HackerRankSolution


# Solution for https://www.hackerrank.com/challenges/collections-counter/problem
class CounterSolution(HackerRankSolution):
    def __init__(self, file_to_read):
        super().__init__(file_to_read)
        lines = self.file_to_read.read().split("\n")
        self.counter = dict(Counter(lines[1].split(" ")))
        self.customers = lines[3:]
        self.total = 0

    def run_solution(self):
        for cust in self.customers:
            sale = cust.split(" ")
            self.handle_sale(sale[0], int(sale[1]))

    def print_results(self):
        print(self.total)

    def handle_sale(self, size, amt):
        if size in self.counter:
            self.total += amt
            self.counter[size] -= 1
            if self.counter[size] < 1:
                del self.counter[size]
