from unittest import TestCase, main
from src.blankd.hackerrank.python.errs.raise_math_errs import divide_numbers


class MyTestCase(TestCase):
    def test_valid_result(self):
        self.assertEqual(divide_numbers(3, 1), 3)  # add assertion here

    def test_divide_by_zero(self):
        with self.assertRaises(ZeroDivisionError):
            divide_numbers(3, 0)

    def test_other_exception(self):
        with self.assertRaises(Exception):
            divide_numbers(3, "$")


if __name__ == '__main__':
    main()
