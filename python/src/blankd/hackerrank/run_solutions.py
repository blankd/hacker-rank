from blankd.hackerrank.python.collections.counter import CounterSolution

from sys import argv
from os.path import isfile

if __name__ == '__main__':
    if isfile(argv[1]):
        solution = CounterSolution(open(argv[1], 'r'))
        solution.run_solution()
        solution.print_results()

    else:
        print("That was not a file")
