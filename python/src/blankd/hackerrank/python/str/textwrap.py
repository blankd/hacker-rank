'''
Created on Jun 11, 2017

@author: blankd
https://www.hackerrank.com/challenges/text-wrap
'''

import textwrap

def wrap(s, w):
  return textwrap.fill(s, w)
if __name__ == '__main__':
  print wrap(raw_input(), int(raw_input()))