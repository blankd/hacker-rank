from blankd.hackerrank.python.errs.raise_math_errs import RaiseMathErrs

from sys import argv
from os.path import isfile

if __name__ == '__main__':
    if isfile(argv[1]):
        solution = RaiseMathErrs(open(argv[1], 'r'))
        solution.prepare_data()
        solution.run_solution()

    else:
        print("That was not a file")
