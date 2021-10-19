from src.blankd.hackerrank.main.hacker_rank_solution import HackerRankSolution


# Solution  for https://www.hackerrank.com/challenges/exceptions/problem
def divide_numbers(one, two):
    return int(one / two)


class RaiseMathErrs(HackerRankSolution):
    def __init__(self, file_to_read):
        super().__init__(file_to_read)
        self.total_tests = 0
        self.tests = []

    def prepare_data(self):
        self.tests = self.file_to_read.read().split("\n")[1:]

    def run_solution(self):
        for test in self.tests:
            try:
                sTest = test.split(" ")
                print(divide_numbers(int(sTest[0]), int(sTest[1])))
            except ZeroDivisionError as unused:
                print("Error Code: integer division or modulo by zero")
            except Exception as e:
                print("Error Code:", e)
